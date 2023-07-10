@echo off
setlocal enabledelayedexpansion

set inputFolder=src\test\systemTestFiles_valid
set outputFolder=src\test\systemTestFiles_valid
set executableFolder=executables

echo Esecuzione degli eseguibili...

REM Loop attraverso ogni eseguibile
for /L %%i in (1, 1, 10) do (
    set executableName=valid%%i
    set inputFilePath=!inputFolder!\!executableName!\!executableName!_in.txt
    set outputFilePath=!outputFolder!\!executableName!\!executableName!_actual_out.txt
    set expectedOutputFilePath=!outputFolder!\!executableName!\!executableName!_out.txt
    set executablePath=!executableFolder!\!executableName!.exe

    echo Esecuzione di !executableName!...

    REM Esegui l'eseguibile con l'input corrente
    type !inputFilePath! | !executablePath! > !outputFilePath!

    REM Confronta l'output generato con l'output atteso ignorando gli spazi vuoti
    fc /w "!outputFilePath!" "!expectedOutputFilePath!" >nul

    REM Verifica se il confronto è riuscito
    if %errorlevel% equ 0 (
        REM Confronto positivo, considera anche le differenze di spazi vuoti
        set "outputContent="
        echo --------------------ESECUZIONE !executableName!--------------------
        for /f "usebackq delims=" %%a in ("!outputFilePath!") do (
            set "outputContent=!outputContent!%%a"
            echo %%a
        )
        echo -------------------------------------------------
        set "expectedOutputContent="
        for /f "usebackq delims=" %%a in ("!expectedOutputFilePath!") do (
            set "expectedOutputContent=!expectedOutputContent!%%a"
        )

        REM Rimuovi gli spazi vuoti
        set "outputContent=!outputContent: =!"
        set "expectedOutputContent=!expectedOutputContent: =!"

        if "!outputContent!" equ "!expectedOutputContent!" (
            echo Output di !executableName! corrispondente.
        ) else (
            echo Output di !executableName! NON corrispondente!
            exit /b 1
        )
    ) else (
        REM Confronto fallito
        echo Output di !executableName! NON corrispondente!
        del "!outputFilePath!" >nul
        exit /b 1
    )

    echo.

    REM Elimina il file actual_output dopo il confronto
    del "!outputFilePath!" >nul
)

echo Esecuzione completata.
exit /b 0







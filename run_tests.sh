#!/bin/bash

# Assicuriamoci di avere il nome del progetto
PROJECT_NAME="Proj_SwD"

# Per essere sicuri che il file report.txt sia nuovo
rm -f "$PROJECT_NAME.report.txt"

for EXEFILE in executables/valid*.exe; do
  TESTNAME=$(basename -- "$EXEFILE" .exe)
  echo "" >> "$PROJECT_NAME.report.txt"
  echo "" >> "$PROJECT_NAME.report.txt"
  echo "Nome del test: $TESTNAME" >> "$PROJECT_NAME.report.txt"
  echo "./$EXEFILE" >> "$PROJECT_NAME.report.txt"

  # Eseguiamo l'eseguibile e salviamo l'output nel file report.txt
  ./"$EXEFILE" >> "$PROJECT_NAME.report.txt" 2>&1

  for TESTIN in src/test/valid_in_out/$TESTNAME/${TESTNAME}_in.txt; do
    if [ -f "$TESTIN" ]; then
      TESTINNAME=$(basename -- "$TESTIN")
      TESTOUT="src/test/valid_in_out/$TESTNAME/${TESTINNAME/_in/_out}.txt"

      # Eseguiamo l'eseguibile leggendo l'input da file e salviamo l'output nel file di output
      ./"$EXEFILE" <"$TESTIN" &>"$TESTOUT"

      echo "" >> "$PROJECT_NAME.report.txt"
      echo "diff -w \"$TESTIN\" \"$TESTOUT\"" >> "$PROJECT_NAME.report.txt"

      # Confrontiamo l'output ottenuto con quello desiderato
      if diff -w "$TESTIN" "$TESTOUT" >> "$PROJECT_NAME.report.txt"; then
        echo "Test $TESTNAME su $TESTIN superato" >> "$PROJECT_NAME.report.txt"
      else
        echo "Test $TESTNAME su $TESTIN fallito" >> "$PROJECT_NAME.report.txt"
      fi

      echo "" >> "$PROJECT_NAME.report.txt"
      echo "Contenuto del file di output $TESTOUT:" >> "$PROJECT_NAME.report.txt"
      cat "$TESTOUT" >> "$PROJECT_NAME.report.txt"
    else
      echo "File di input $TESTIN non trovato" >> "$PROJECT_NAME.report.txt"
    fi
  done
done



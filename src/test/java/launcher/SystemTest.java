package launcher;

import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class SystemTest{
    @Test
    void compilerTest() throws Exception {
        String validDirPath = "src/test/systemTestFiles_valid";
        String invalidDirPath = "src/test/systemTestFiles_invalid";
        File validDir = new File(validDirPath);
        File invalidDir = new File(invalidDirPath);
        String[] args = new String[2];

        if(validDir.isDirectory() && invalidDir.isDirectory()){
            File[] valid_dirs = validDir.listFiles();
            File[] invalid_files = invalidDir.listFiles();
            for(File valid : valid_dirs){
                for(File script : valid.listFiles()){
                    if(script.getName().matches("^[^_]+$")){
                        args[0] = validDirPath + "/"+script.getName().replaceAll("\\.txt$", "")+"/" + script.getName();
                        Launcher.main(args);
                    }
                }
            }
            if (invalid_files != null) {
                for (File file : invalid_files) {
                    if (file.isFile()) {
                        args[0] = invalidDirPath+"/"+file.getName();
                        assertThrows(Throwable.class,() -> Launcher.main(args));
                    }
                }
            }
        }

        /*if (validDir.isDirectory() && invalidDir.isDirectory()) {
            File[] valid_files = validDir.listFiles();
            File[] invalid_files = invalidDir.listFiles();
            if (valid_files != null) {
                for (File file : valid_files) {
                    if (file.isFile()) {
                        args[0] = validDirPath+"/"+file.getName();
                        Launcher.main(args);
                    }
                }
            }
            if (invalid_files != null) {
                for (File file : invalid_files) {
                    if (file.isFile()) {
                        args[0] = invalidDirPath+"/"+file.getName();
                        assertThrows(Throwable.class,() -> Launcher.main(args));
                    }
                }
            }
        }*/
    }

    @Test
    void wrongInputFileTest(){
        String[] args = new String[1];

        args[0] = "filename.doc";
        assertThrows(Throwable.class,() -> Launcher.main(args));

        args[0] = "file@name.txt";
        assertThrows(Throwable.class,() -> Launcher.main(args));

        args[0] = "filename.txt";
        assertThrows(Throwable.class,() -> Launcher.main(args));
    }
}

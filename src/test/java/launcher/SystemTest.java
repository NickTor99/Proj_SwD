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

        if (validDir.isDirectory() && invalidDir.isDirectory()) {
            File[] valid_files = validDir.listFiles();
            File[] invalid_files = invalidDir.listFiles();
            if (valid_files != null) {
                for (File file : valid_files) {
                    if (file.isFile()) {
                        args[0] = validDirPath+"/"+file.getName();
                        args[1] = file.getName();
                        Main.main(args);
                    }
                }
            }
            if (invalid_files != null) {
                for (File file : invalid_files) {
                    if (file.isFile()) {
                        args[0] = invalidDirPath+"/"+file.getName();
                        args[1] = file.getName();
                        assertThrows(Throwable.class,() -> Main.main(args));
                    }
                }
            }
        }
    }
}

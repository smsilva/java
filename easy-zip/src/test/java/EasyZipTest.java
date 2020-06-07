import com.github.smsilva.easy.zip.EasyZipFile;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class EasyZipTest {

    @TempDir
    Path tempDir;

    @Test
    public void zipAFile() throws IOException {
        File file = createFile();
        assertTrue(file.exists());

        File zipFile = new File(tempDir.toFile().getAbsolutePath(), "new-file.zip");

        EasyZipFile easyZipFile = new EasyZipFile(zipFile);
        easyZipFile
                .add(file)
                .zip();

        assertTrue(zipFile.exists());
    }

    private File createFile() throws IOException {
        Path file = tempDir.resolve("numbers.txt");

        List<String> lines = Arrays.asList("1", "2", "3");
        Files.write(file, lines);

        return file.toFile();
    }

}

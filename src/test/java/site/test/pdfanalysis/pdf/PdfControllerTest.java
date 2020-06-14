package site.test.pdfanalysis.pdf;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PdfControllerTest {

    private final static String TEST_FILE_PATH = "file/test-pdf.pdf";

    @Test
    public void testTextExtraction() {
        try {
            File testFile = new File(ClassLoader.getSystemResource(TEST_FILE_PATH).getPath());
            PdfController.textExtraction(testFile);
            assertTrue(true);
        } catch (Exception e) {
            fail();
        }
    }

    @Test
    public void testTextExtractionException() {
        File testFile = new File(ClassLoader.getSystemResource(TEST_FILE_PATH).getPath());
        assertThrows(Exception.class, () ->
                PdfController.textExtraction(null));
    }

}

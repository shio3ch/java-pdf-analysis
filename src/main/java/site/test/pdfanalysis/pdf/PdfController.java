package site.test.pdfanalysis.pdf;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.File;
import java.io.IOException;

public class PdfController {

    private static final Log logger = LogFactory.getLog(PdfController.class);

    private PdfController() {
    }

    public static void textExtraction(File pdfFile) {
        try (PDDocument document = PDDocument.load(pdfFile)) {
            for (int p = 1; p < document.getNumberOfPages(); p++) {
                PDPage page = document.getPage(p);

                PDFTextStripper stripper = new PDFTextStripper();
                stripper.setStartPage(p);
                stripper.setEndPage(p);

                String text = stripper.getText(document);

                String pageStr = String.format("page %d:", p);
                logger.info(pageStr);
                logger.info(text.trim());
            }

        } catch (IOException e) {
            final String errMsg = "PDF extract error!";
            logger.error(errMsg);
            logger.error(e.getMessage());
        }

    }

}

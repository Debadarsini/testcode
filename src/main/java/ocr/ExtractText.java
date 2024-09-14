package ocr;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import java.io.File;

public class ExtractText {

    public static void main (String [] args){
        File image = new File("src/main/resources/IMG_0981.jpg");
        Tesseract tesseract = new Tesseract();
        tesseract.setDatapath("/Users/administrator/Documents/startup/test/src/main/resources/testdata");
        tesseract.setLanguage("eng");
        tesseract.setPageSegMode(1);
        tesseract.setOcrEngineMode(1);
        try {
            System.out.println("its running");

            String result = tesseract.doOCR(image);
            System.out.println(result);
        } catch (TesseractException e) {
            e.printStackTrace();
        }

    }
}

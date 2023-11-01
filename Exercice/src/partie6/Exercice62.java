package partie6;

import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfWriter;

public class Exercice62 {
	public static void main(String[] args) {
		Document document = new Document();
		try {
			FileOutputStream fos = new FileOutputStream("fichier1.pdf");
			PdfWriter.getInstance(document, fos);
            document.open();
            document.add(new Paragraph("paragraphe 1"));
            document.close();
		} catch (FileNotFoundException e) {
			System.out.println("Erreur fichier déja ouvert");
			e.printStackTrace();
		} catch (DocumentException de) {
			System.out.println("Erreur fichier pdf");
			System.err.println(de.getMessage());
		}
	}
}
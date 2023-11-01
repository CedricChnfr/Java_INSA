package partie6;

import java.io.FileWriter;
import java.io.IOException;

public class TestIO {

	public static void main(String[] argv) throws IOException {

        String fileName = "";

        try {
            if (fileName== "") {
                throw new ErrFile();
            }
            FileWriter myFile = new FileWriter(fileName);
            myFile.write("Here is the content of my file");
            myFile.close();
        } catch (ErrFile e) {
            System.out.println("Erreur Nom fichier : " + e.getMessage());
            System.exit(-1);
        }
    }

}

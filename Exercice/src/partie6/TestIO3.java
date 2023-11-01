package partie6;

import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;
//Créer le fichier lire qui sera copié dans écrire
public class TestIO3 {

	public static void main(String[] args) throws IOException {
		FileReader in;
		FileWriter out;
		try {
			in = new FileReader("a_lire.txt");
			out = new FileWriter("a_ecrire.txt");
			int c;
			while((c = in.read()) != -1) {
				out.write(c);
			}
			in.close();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

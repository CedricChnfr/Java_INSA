package partie6;
import partie4.Voiture34;
import java.util.Date;


public class Exercice61 {

	public static void main(String[] args) {
		Voiture34 voiture1 = new Voiture34(5);
		
		System.out.println("Vitesse : "+voiture1.getVitesse());

        Date dateCreation = voiture1.getDateCreation();
        System.out.println("La date de création de la voiture est : " + dateCreation);
  
	}

}


// cmd : javac partie6/Exercice61.java partie4/Voiture34.java
// cmd : java partie6/Exercice61
package week5.practicum4;

import java.io.*;
public class KlasManager{

	public void klasOpslaan(Klas deKlas) {	
		try{
			FileOutputStream fos = new FileOutputStream("klas.obj");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(deKlas);
			oos.close();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

	public Klas klasInladen() {
		Klas deKlas = null;
		
		try{
			FileInputStream fis = new FileInputStream("klas.obj");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Object obj = ois.readObject();
			
			deKlas = (Klas) obj;
			ois.close();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		/* Voeg hier code toe om het Klas-object weer in te lezen uit bestand klas.obj */

		/* Laat variabele 'deKlas' naar het ingelezen Klas object wijzen! */

		return deKlas;
	}
}

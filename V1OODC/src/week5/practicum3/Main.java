package week5.practicum3;
import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException{
		Scanner scan = new Scanner(System.in);
		System.out.println("Vul hier uw bronnaam in: ");
		String bronnaam = scan.nextLine();
		System.out.println("Vul hier uw bestemmingsnaam in: ");
		String bestemmingsnaam = scan.nextLine();
		System.out.println("Vul hier de koers in: ");
		double koers = Double.parseDouble(scan.nextLine());
		
		FileReader fr = new FileReader(bronnaam);
		BufferedReader br = new BufferedReader(fr);
		FileWriter fw = new FileWriter(bestemmingsnaam);
		PrintWriter pw = new PrintWriter(fw);
		
		String regel = br.readLine();
		while(regel != null){
			String[] values = regel.split(" : ");
			pw.println(values[0]+" : "+(Double.parseDouble(values[1])*koers/100));
			System.out.println(values[0]);
			regel = br.readLine();
		}
		
		pw.close();
		br.close();
		scan.close();
	}
}
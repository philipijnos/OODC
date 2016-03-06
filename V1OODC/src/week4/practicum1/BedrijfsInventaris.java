package week4.practicum1;
import java.util.*;

public class BedrijfsInventaris{
	private String bedrijfsnaam;
	private double budget;
	private ArrayList<Goed> alleGoederen;

	public BedrijfsInventaris(String nm, double bud){
		bedrijfsnaam = nm;
		budget = bud;
		alleGoederen = new ArrayList<Goed>();
	}
	public void schafAan(Goed input){			
		boolean controle = true;
		if(input.huidigeWaarde() <= budget){
			for(Goed g : alleGoederen){
				if(g.equals(input)){
					controle = false;
					break;
				}
			}
			if(controle){
				alleGoederen.add(input);
				budget -= input.huidigeWaarde();
			}
		}
	}
	public String toString(){
		String result = bedrijfsnaam + " met inventaris:";
		for(Goed g : alleGoederen){
			result += "\n"+g;
		}
		return result;
	}
}
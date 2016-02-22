package week3.practicum3;
import java.text.DecimalFormat;
import java.util.*;

public class Persoon{
	private String naam;
	private double budget;
	private ArrayList<Game> mijnGames;

	public Persoon(String nm, double bud){
		naam = nm;
		budget = bud;
		mijnGames = new ArrayList<Game>();
	}
	public boolean koop(Game inputGame){
		boolean result = true;
		if(budget >= inputGame.huidigeWaarde()){
			for(Game g : mijnGames){
				if(g.equals(inputGame)){
					result = false;
					break;
				}
			}
			if(result){
				mijnGames.add(inputGame);
				budget -= inputGame.huidigeWaarde();
			}
		}
		return result;
	}
	public boolean verkoop(Game inputGame, Persoon inputPersoon){
		boolean result = true;
		for(Game g : this.mijnGames){
			if(inputGame.equals(g) && inputPersoon.budget >= inputGame.huidigeWaarde()){
				for(Game h : inputPersoon.mijnGames){
					if(h.equals(inputGame)){
						result = false;
						break;
					}
				}
				break;
			}
			else{
				result = false;
			}
		}
		if(result){
			inputPersoon.mijnGames.add(inputGame);
			inputPersoon.budget -= inputGame.huidigeWaarde();
			this.mijnGames.remove(inputGame);
			this.budget += inputGame.huidigeWaarde();
		}
		return result;
	}
	public String toString(){
		DecimalFormat df = new DecimalFormat("#.##");
		String result = naam+" heeft een budget van €"+df.format(budget)+" en bezit de volgende games:";
		for(Game g : mijnGames){
			result += "\n"+g;
		}
		return result;
	}
}
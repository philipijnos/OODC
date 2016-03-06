package week4.practicum1;

public abstract class Voertuig implements Goed{
	private String type;
	protected double nieuwprijs;
	protected int bouwjaar;
	
	public Voertuig(String tp, double pr, int bj){
		type = tp;
		nieuwprijs = pr;
		bouwjaar = bj;
	}
	public boolean equals(Object input){
		boolean result = false;
		if(input instanceof Voertuig){
			Voertuig voertuigInput = (Voertuig) input;
			if (voertuigInput.type.equals(this.type) &&
				voertuigInput.nieuwprijs == this.nieuwprijs &&
				voertuigInput.bouwjaar == this.bouwjaar){
				
				result = true;
			}
		}
		return result;
	}
	public String toString(){
		String result = "Voertuig: "+type+" met bouwjaar "+bouwjaar+" heeft een waarde van: €"+this.huidigeWaarde();
		return result;
	}
}
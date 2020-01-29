package oefening_5;

public class Btw {
	private int btw = 21;
	private double prijs;

	public double getPrijs() {
		return prijs;
	}

	public void setPrijs(double prijs) {
		this.prijs = prijs;
	}

	public int getBtw() {
		return btw;
	}

	public void setBtw(int btw) {
		this.btw = btw;
	}

	public double getPrijsInclusiefBtw() {
		double locPrijs = prijs * (1 + (btw / 100d));
	
		locPrijs = Math.round(locPrijs*100)/100d;
		
		return locPrijs;
	}
}
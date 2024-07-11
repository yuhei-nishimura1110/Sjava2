package s11;

public class Computer extends TangibleAsset {
	String makerName;

	public Computer(String name, int price, String color, double weight, String markName) {
		super(name, price, color, weight);
		this.makerName = markName;
	}

	public String getMakerName() {
		return this.makerName;
	}
}

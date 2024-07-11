package RPG;

public class Wand {
	private String name;
	private double power;

	public String getName() {
		return this.name;
	}

	public double getPower() {
		return this.power;
	}

	public void setName(String a) {
		if (a == null || a.length() < 3) {
			System.out.println("名前を長くしてください");
		} else {
			this.name = a;
		}
	}

	public void setPower(double a) {
		if (a < 0.5 || a > 100.0) {
			System.out.println("正しく設定してください");
		} else {
			this.power = a;
		}
	}
}

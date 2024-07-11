package RPG;

public class Wizard {
	private int hp;
	private int mp;
	private String name;
	private Wand wand;

	public void heal(Hero h) {
		int basePoint = 10;
		int recovPoint = (int) (basePoint * wand.getPower());
		h.hp += recovPoint;
		System.out.println(h.getName() + "のHPを" + recovPoint + "回復した");
	}

	public int getHp() {
		return this.hp;
	}

	public int getMp() {
		return this.mp;
	}

	public String getName() {
		return this.name;
	}

	public void setHp(int a) {
		if (a <= 0) {
			this.hp = 0;
		} else {
			this.hp = a;
		}
	}

	public void setMp(int a) {
		if (a <= 0) {
			this.mp = 0;
		} else {
			this.mp = a;
		}
	}

	public void setName(String a) {
		if (a == null || name.length() < 3) {
			System.out.println("名前を長くしてください");
		} else {
			this.name = a;
		}
	}

	public Wand getWand() {
		return this.wand;
	}

	public void setWand(Wand a) {
		if (a == null) {
			System.out.println("杖を設定してください");
		} else {
			this.wand = a;
		}
	}
}

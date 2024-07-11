package RPG;

public class Cleric {
//8-1
	String name;
	int hp = 50;
	int mp = 10;
	static final int maxHP = 50;
	static final int maxMp = 10;

	public void selfAid() {
		if (this.mp >= 5) {
			System.out.println("聖職者はセルフエイドをし、自身のHPを回復させた");
			this.hp = this.maxHP;
			this.mp -= 5;
		} else {
			System.out.println("セルフエイドできなかった");
		}
	}

	public int pray(int s) {
		int x = new java.util.Random().nextInt(3);
		int r = x + s;
		int re = 0;
		System.out.println("聖職者は" + s + "秒祈った");
		if (r + this.mp >= this.maxMp) {
			re = this.maxMp - this.mp;
		} else {
			re = r;
		}
		System.out.println("聖職者は" + re + "ポイントのｍｐを回復させた");
		return re;
	}
}

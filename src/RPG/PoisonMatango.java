package RPG;

public class PoisonMatango extends matango {
	public PoisonMatango(char suffix) {
		super(suffix);
	}

	int poison = 5;

	public void attack(Hero h) {
		super.attack(h);
		if (poison > 0) {
			System.out.println("さらに毒の胞子をばらまいた");
			int p = h.hp / 5;
			h.hp -= p;
			System.out.println(p + "ポイントのダメージ");
			poison--;
		}
	}
}

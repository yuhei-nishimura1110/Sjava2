package RPG;

//9-1
public class Thief {
	String name;
	int hp;
	int mp;

	public void Thief(String name, int hp, int mp) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}

	public void Thief(String name, int hp) {
		this.name = name;
		this.hp = hp;
		this.mp = 5;
	}

	public void Thief(String name) {
		this.name = name;
		this.hp = 40;
		this.mp = 5;
	}
}

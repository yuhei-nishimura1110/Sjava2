package RPG;

public class Hero {
	private String name = "namae";
	int hp = 0;
	int mp = 0;

	public void Hero(String name, int hp, int mp) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Hero(String name) {
		this.name = name;
	}
}

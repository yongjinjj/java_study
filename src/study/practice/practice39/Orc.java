package study.practice.practice39;

public class Orc {
	protected String name;
	protected int hp;

	public Orc(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}

	public String toString() {
		//return "Orc { name : "+ name + ", hp : " + hp + " }";
		//return String.format("Orc { name : %s, hp : %d }", name, hp);
		String result = String.format("Orc { name : %s, hp : %d }", name, hp);
		return result;
	}
}

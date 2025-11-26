package be_study.quiz.test;

public class Member {
	int x=0, y=0;
	int hp = 60;
	static int weapon=6;
	static int armor = 0;
	
	void weaponU() {
		weapon++;
	}
	
	void armorUp() {
		armor++;
	}
	
	void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	
}

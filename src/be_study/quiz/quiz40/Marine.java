package be_study.quiz.quiz40;

class Unit {
	int x, y;

	public static void stop() {
	};

	void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class Marine extends Unit { // 보병

	boolean isStimPackOn = false;

	void stimPack() {
		isStimPackOn = true;
	}
}

class Tank extends Unit { // 탱크
	boolean isModeSieze = false;

	void changeMode() {
		isModeSieze = !(isModeSieze);
	}

}

class Dropship extends Unit { // 수송선
	boolean isfilled = true;

	void load() {
		isfilled = true;
	}

	void unload() {
		isfilled = false;
	}
}

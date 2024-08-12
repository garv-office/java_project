package com.day1.session2.quiz;

class Rocket {
	private void blastOff() {
		System.out.print("bang ");
	}
}

public class Shuttle extends Rocket {
	public static void main(String[] args) {
		new Shuttle().go();
	}

	void go() {
		blastOff();
		// Rocket.blastOff(); // line A
	}

	private void blastOff() {
		System.out.print("sh-bang ");
	}
}

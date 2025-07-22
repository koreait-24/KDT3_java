package gameTask;

import java.util.Random;

public class Rogue extends Character {
	int[] randomDmg = { 20, 30, 40, 50, 60, 70, 80, 90, 100 };

	public Rogue() {
		super("로그", 20, 20, 3, 20, 0);
	}

	@Override
	public void normalAttack() {
		if (!checkMp(3)) {
			System.out.println("마나 부족!");
			showStatus();
			return;
		}
		System.out.println(name + "이 기본공격을 가했습니다!");
		mp -= 3;
		System.out.println("적에게 " + nomalDmg + " 만큼의 피해를 입혔습니다.");
		showStatus();
	}

	@Override
	public void skillAttack() {
		if (!checkMp(2)) {
			System.out.println("마나 부족!");
			showStatus();
			return;
		}
		System.out.println(name + "이(가) 스킬을 사용했습니다!");
		System.out.println("적에게 " + skillDmg + " 만큼 피해!");
		hp -= 5;
		mp -= 2;
		showStatus();
		revive();
	}

	@Override
	public void specialAttack() {
		Random r = new Random();
		int dmg = randomDmg[r.nextInt(randomDmg.length)];
		System.out.println(name + "가 필살기를 시전합니다!");
		System.out.println("적에게 " + dmg + " 만큼의 피해를 입혔습니다.");
	}
}

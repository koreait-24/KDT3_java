package gameTask;

public class Warrior extends Character {
	public Warrior() {
		super("전사", 30, 10, 5, 15, 100);
	}

	@Override
	public void skillAttack() {
		if (!checkMp(3)) {
			System.out.println("Mp 부족!");
			showStatus();
			return;
		}
		System.out.println(name + "이 스킬공격!");
		System.out.println("적에게 " + skillDmg + " 만큼 피해를 입혔습니다.");
		mp -= 3;
		showStatus();
	}

	@Override
	public void specialAttack() {
		System.out.println(name + "가 필살기를 시전합니다!");
		System.out.println("적에게 " + specialDmg + " 만큼 피해를 입혔습니다.");
		hp -= 10;
		revive();
	}

	public void onlyWarrior() {
		System.out.println("전사만 사용할 수 있는 고유 행동입니다.");
	}
}

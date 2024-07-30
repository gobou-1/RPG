package humans;

import bases.Human;
import utils.Dice;

public class Slime extends Human {

	public Slime(String name, String weapon) {
		super(name, weapon);
		// TODO 自動生成されたコンストラクター・スタブ
		this.hp = Dice.get(70, 130);
		this.offensive = Dice.get(5, 11);
	}

}

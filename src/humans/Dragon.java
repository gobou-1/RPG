package humans;

import bases.Human;
import utils.Dice;

public class Dragon extends Human {

	public Dragon(String name, String weapon) {
		super(name, weapon);
		// TODO 自動生成されたコンストラクター・スタブ
		this.hp = Dice.get(270, 330);
		this.offensive = Dice.get(12, 18);
	}

}

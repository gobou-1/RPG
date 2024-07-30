package humans;

import bases.Human;
import utils.Dice;


public class Fighter extends Human {

	public Fighter(String name, String weapon) {
		super(name, weapon);
		// TODO 自動生成されたコンストラクター・スタブ
		this.hp = Dice.get(240, 300);
		this.offensive = Dice.get(17, 23);

	}

}

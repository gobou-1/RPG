package bases;

import utils.Dice;

public abstract class  Human extends Living {

	public Human(String name, String weapon) {
		super(name,weapon);
	}
	@Override
	public void attack(Living target) {
		// 1から10までのサイコロを振り、自分の攻撃力とかけ合わせた値を相手に与えるダメージとする
		 int damage = Dice.get(1, 10) * this.offensive;
				// 相手のHPをダメージ値だけ減らす
		this.offensive = this.offensive  - 1 ;
				// 自分の攻撃力を1だけ減らす
		System.out.println(this.name + "が" + this.weapon + "で攻撃!" + target.name + "に" + damage + "のダメージを与えた。");
 				// コンソールにステータスを表示
				//this.name「〇〇」がthis.weapon→「✕✕」で攻撃target.name「△△」にdamage▲▲のダメージを与えた。
	}
}

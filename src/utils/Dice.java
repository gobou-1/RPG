package utils;
import java.util.Random;


public class Dice {
	  private static  Random r = new Random();
	  int num = Dice.get(1, 10);



	 public static int get(int min, int max) {
		// TODO 自動生成されたメソッド・スタブ
			return r.nextInt(max - min + 1) + min;
	}


}

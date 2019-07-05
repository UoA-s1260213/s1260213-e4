	import java.util.Random;

	public class Main {

		public static void main(String[] args) {
			// TODO 自動生成されたメソッド・スタブ
	Random rand = new Random();
	int D1=rand.nextInt(6)+1;
	int D2=rand.nextInt(6)+1;
	int total=D1+D2;
	System.out.println("Rolling the dice...");
	System.out.println("Die 1: "+D1);
	System.out.println("Die 2: "+D2);
	System.out.println("Total value: "+total);
		if(total>7) {
			System.out.println("You won");
			} else {
				System.out.println("You lost");
			}
		}
		}

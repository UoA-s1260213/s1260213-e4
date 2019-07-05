		//<<<<<<< HEAD
			import java.util.Random;
import java.util.Scanner;

			public class Main {

				public static void main(String[] args) {
					// TODO 自動生成されたメソッド・スタブ
					System.out.println("Whst's your name?");
					Scanner sc1= new Scanner(System.in);
					String name = sc1.nextLine();
					System.out.println("Hello, "+name+"!");
					Random rand = new Random();
			int D1=rand.nextInt(6)+1;
			int D2=rand.nextInt(6)+1;
			int total=D1+D2;
			System.out.println("Rolling the dice...");
			System.out.println("Die 1: "+D1);
			System.out.println("Die 2: "+D2);
			System.out.println("Total value: "+total);
				if(total>7) {
					System.out.println(name+" won!");
					} else {
						System.out.println(name+" lost!");
					}
				}
				}
		//=======
		/*import java.util.Random;
		import java.util.Scanner;
		public class Main {

			public static void main(String[] args) {
				// TODO 自動生成されたメソッド・スタブ
		System.out.println("Whst's your name?");
				Scanner sc1= new Scanner(System.in);
				String name = sc1.nextLine();
				System.out.println("Hello, "+name+"!");
				Random rand = new Random();
		int D1=rand.nextInt(6)+1;
		int D2=rand.nextInt(6)+1;
		int total=D1+D2;
		System.out.println("Rolling the dice...");
		System.out.println("Die 1: "+D1);
		System.out.println("Die 2: "+D2);
		System.out.println("Total value: "+total);
			}

		}*/
		//>>>>>>> experimental

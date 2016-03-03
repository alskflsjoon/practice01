import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		Random r = new Random();
		int round = 1;
		int knownceil=100;
		int knownfloor=1;

		while(true){
			int k = r.nextInt(100)+1;

			System.out.println("수를 결정하였습니다. 맞추어 보세요.");
			System.out.println("1-100");

			while(true){
				System.out.print(round + ">>");
				int input = scanner.nextInt();
				if( input > k ){
					knownceil=input;
					System.out.println("더 낮게");
					System.out.println(knownfloor+"-"+knownceil);
				}
				else if (input < k){
					knownfloor=input;
					System.out.println("더 높게");
					System.out.println(knownfloor+"-"+knownceil);
				}
				else {
					System.out.println("맞았습니다");
					break;
				}
				round++;
			}

			System.out.print("다시 하시겠습니까(y/n)>>");
			String answer = scanner.next();
			if(answer.equals("n")){
				return;
			}

			scanner.close();
		}


	}

}

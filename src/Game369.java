

public class Game369 {
	public static void main(String[] args) {
		for(int i = 1; i<100; i++){
			String number = String.valueOf(i);
			System.out.print(number+": ");
			int count=0;
			int length = number.length();
			char c;
			for(int j=0;j<length;j++){
				c=number.charAt(j);
				if(c=='3'||c=='6'||c=='9')
					count++;
			}
			for(int k=0;k<count;k++){
				System.out.print("짝");
			}
			System.out.println("");
				
		}
		
	}
}

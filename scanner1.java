package scanner;

import java.util.Scanner;

public class scanner1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		    int dollar = 1200;
			int money= 1200*253; 
			System.out.print("달러를 입력하세요>>");
			
			dollar = scanner.nextInt();
			 
			System.out.print("$"+dollar+"는" +money+"원입니다.");
			 scanner.close();

	}

}

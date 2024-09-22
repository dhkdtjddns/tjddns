package scanner;

import java.util.Scanner;

public class scanner2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		
		System.out.print("생일 입력 하세요>>");
		int bs = scanner.nextInt();
		int y = 2000+1;
		int m = 2+1;
		int e = 15+1;
		
		System.out.print(y + "년");
		System.out.print(m + "월");
		System.out.print(e + "일");
	 scanner.close();
	}

}

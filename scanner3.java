package scanner;

import java.util.Scanner;

public class scanner3 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("****자바 분식입니다. 주문하면 금액을 알려드립니다.****");
		
	
		
		System.out.print("떡볶이 몇 인분>>");
		int i = scanner.nextInt();
		int a = i*2000;
		System.out.print("김말이 몇 인분>>");
		int j = scanner.nextInt();
		int b = j*1000;
		System.out.print("쫄면 몇 인분>>");
		int k = scanner.nextInt();
		int c = k*3000;
		System.out.print("전체 금액은"+(a+b+c)+"원입니다");
		
		 scanner.close();
		
	}

}

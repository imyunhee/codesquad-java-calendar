package honux.calendar;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		int a, b;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("두 수를 입력해주세요");
		a = scan.nextInt();
		b = scan.nextInt();
		
		//System.out.println("두 수의 합은 " + (a+b) + "입니다.");
		System.out.printf("%d와 %d의 합은 %d입니다.", a, b, a + b);
		
		scan.close();
	}
}

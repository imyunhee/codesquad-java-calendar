package honux.calendar;

import java.util.Scanner;

public class Prompt {

	private final static String PROMPT = "cal> ";

	public void runPrompt() {
		// 숫자를 입력받아 해당하는 달의 최대 일수 출력하는 프로그램
		String PROMPT = "cal> ";
		Scanner scan = new Scanner(System.in);
		Calendar cal = new Calendar();

		int month = 1;
		int year = -1;

		while (true) {
			System.out.println("년도를 입력하세요");
			System.out.print("YEAR> ");
			year = scan.nextInt();
			
			System.out.println("달을 입력하세요");
			System.out.print("MONTH> ");
			month = scan.nextInt();
			
			if (month == -1) {
				break;
			}

			if (month > 12) {
				continue;
			}
			
			cal.printCalendar(year, month);
		}

		System.out.print("== 프로그램을 종료합니다 ==");

		scan.close();
	}

}

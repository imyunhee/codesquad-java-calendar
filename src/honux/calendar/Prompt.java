package honux.calendar;

import java.util.Scanner;

public class Prompt {

	/**
	 * @param week 요일명
	 * @return 0~6(0 = Sunday, 6 = Saturday)
	 */
	public int parseDay(String week) {
		if (week.equals("su"))
			return 0;
		else if (week.equals("mo"))
			return 1;
		else if (week.equals("tu"))
			return 2;
		else if (week.equals("we"))
			return 3;
		else if (week.equals("th"))
			return 4;
		else if (week.equals("fr"))
			return 5;
		else if (week.equals("sa"))
			return 6;
		else
			return 0;
	}

	public void runPrompt() {
		// 숫자를 입력받아 해당하는 달의 최대 일수 출력하는 프로그램
		Scanner scan = new Scanner(System.in);
		Calendar cal = new Calendar();

		int month = 1;
		int year = 2020;
		int weekday = 0;

		while (true) {
			System.out.println("년도를 입력하세요.(exit: -1)");
			System.out.print("YEAR> ");
			year = scan.nextInt();
			if(year == -1) {
				break;
			}

			System.out.println("달을 입력하세요");
			System.out.print("MONTH> ");
			month = scan.nextInt();

			System.out.println("첫째 날의 요일을 입력하세요(su, mo, tu, we, th, fr, sa)");
			System.out.print("WEEKDAY> ");
			String str_weekday = scan.next();
			weekday = parseDay(str_weekday);


			if (month > 12 || month < 1) {
				System.out.println("잘못된 입력입니다.");
				continue;
			}

			cal.printCalendar(year, month, weekday);
		}

		System.out.print("== 프로그램을 종료합니다 ==");

		scan.close();
	}

	public static void main(String[] args) {
		// 셀 실행
		Prompt p = new Prompt();
		p.runPrompt();
	}
}

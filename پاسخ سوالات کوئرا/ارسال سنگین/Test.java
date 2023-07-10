import java.util.Scanner;

public class Test {

	public static Scanner console = new Scanner(System.in);

	public static void main(String[] args) {
		boolean[] ADays = new boolean[31];
		boolean[] BDays = new boolean[31];

		int ADaysCnt = console.nextInt();
		int BDaysCnt = console.nextInt();

		for (int i = 1; i <= ADaysCnt; i++) {
			int start = console.nextInt();
			int end   = console.nextInt();

			for (int index = start; index <= end; index++)
				ADays[index] = true;
		}

		for (int i = 1; i <= BDaysCnt; i++) {
			int start = console.nextInt();
			int end   = console.nextInt();

			for (int index = start; index <= end; index++)
				BDays[index] = true;
		}

		int possibleDaysCnt = 0;
		for (int day = 1; day < 31; day++) {
			if (ADays[day] && BDays[day])
				possibleDaysCnt++;
		}

		System.out.println(possibleDaysCnt);
	}
}


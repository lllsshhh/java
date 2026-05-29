package jump2java;
import java.util.Scanner;

public class DigitCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양수 입력: ");
		int num = sc.nextInt();
		sc.close();
		
		int count = 0;
		
		while (num>0) {
			num = num /10;
			count++;
		}
		System.out.println("자릿수: "+count);

	}

}

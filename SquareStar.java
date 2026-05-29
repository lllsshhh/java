package jump2java;
import java.util.Scanner;

public class SquareStar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("높이: ");
		int num = sc.nextInt();
		sc.close();
		
		for(int i=0; i<=num;i++) {
			for(int j=0; j<num; j++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
		
		for(int i=0; i<num;i++) {
			for(int j=0; j<i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}

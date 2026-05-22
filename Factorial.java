package jump2java;
import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		while(true){
			System.out.print("양수 입력");
			n = sc.nextInt();
			if(n>0) {
				break;
			} else {
				System.out.println("1이상 입력해!!");
			}
		}
		
		long result = 1;
		for(int i = 1; i <= n ;i++) {
			result *= i ;
		}
		System.out.println("결과 = "+result);
	}

}

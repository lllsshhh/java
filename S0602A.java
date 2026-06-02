package jump2java;
import java.util.Scanner;

class Student{
	String name;
	int age;
	int score;
	String grade;
	
	//생성자 생성
	Student(String name){
		this.name = name;
	}
	
	//생성자 오버로드
	Student(String name, int age){
		this.name = name;
		this.age = age;
		this.score = 100;
	}  
	
	void info() {
		System.out.println("이름: "+this.name);
		System.out.println("점수: "+this.score);
	}
	
	void setGrade(int score) {
		this.score = score;
		if (score >= 90) {
			System.out.println("Grade A");
		} else if(score >= 70) {
			System.out.println("grade B");		
		} else if(score >= 50) {
			System.out.println("grade C");
		} else {
			System.out.println("grade F");
		}
	}
}


public class S0602A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		sc.close();
		
		Student s1 = new Student(name);
		s1.info();
		s1.setGrade(78);
		s1.info();
	
		
		Student s2 = new Student(name, 18);
		s2.info();
		s2.setGrade(0);
		s2.info();
		
	}
}



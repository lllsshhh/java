package jump2java;

class Student{
	String name;
	int grade;
	//생성자 - 객체생성시 가장 먼저 실행
	Student(String n, int g){
		name = n;
		grade = g;
	}
	//메서드 study: 매게변수X, "이름+공부한다." 출력
	void study() {
		System.out.println(name+ "이름+공부한다.");
	}
	//메서드 study:매게변수O- 시간, "~시간 공부한다" 출력 =>메서드 오버로드
	void study(int hour) {
		System.out.println(hour + "시간 공부한다.");
	}
	
class Leader extends Student{
	int members;
	//생성자 - 부모꺼 모두 상속 받고 추가로 member 입력 받음.
	Leader(String n, int g, int m){
		super(n,g);	//부모 클래스의 생성자를 호출
		members = m;
	}
	//메서드 study() - "~가 조장을 맡아 공부를 이끈다." 출력
	void study() {
		System.out.println(name+"가 조장을 맡아 공부를 이끈다.");
	}
	//메서드 manage() - 리턴X "~명의 조원을 관리한다." 출력
	void manage() {
		System.out.println(members+"명의 조원을 관리한다.");
	}
}
}
public class StudentManage {
	public static void main(String[] args) {
		Student st = new Student("스마트", 1);
		Leader leader = new Leader("스마엉", 2, 21);
		
		st.study();			//스마트 공부한다.
		st.study(5);		//5시간 공부한다.
		
		leader.study();		//스마엉가 조장을 맡아 공부를 이끈다.
		leader.study(3);	//3시간 공부한다.
		leader.manage();	//21명의 조원을 관리하다.

	}

}

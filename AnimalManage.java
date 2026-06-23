package jump2java;

class Animal{
	String name;
	int age;
	
	//생성자 작성
	Animal(String n, int a){
		name = n;
		age = a;
	}
	//sound() 매소드 : 출력
 	void sound() {
 		System.out.println(name + "가 운다.");
 	}
	//sound() 메도스 오버로드: ~번 운다. 입력O
 	void sound(int count) {
 		System.out.println(count +"번 운다.");
 	}
}
//상속: Animal을 상속 받음. 부모=> Animal
class Dog extends Animal{
	int speed;
	//생성자
	Dog(String n, int a, int s){
		super(n, a); //super: 부모생성자 호출
		speed = s;
	}
	//sound()메소드 오버로드 : 출력하는 입력이 없는
	void sound() {
		System.out.println(name + "멍멍!");
	}
	//run() 메소드 : 시간을 입력 받아서 . . . m 달렸습니다.
	void run(int time) {
		System.out.println((speed*time) + "m 달림.");
	}
}
public class AnimalManage {
	public static void main(String[] args) {
		Dog dog = new Dog("smart", 10, 10);
		dog.sound();  //smart 멍멍!
		dog.sound(3); //3번 운다.
		dog.run(5);   //50m 달림.

	}

}

package lesson6;

/*
 * 생성자를 사용자가 만들면
 * 웬만하면 기본생성자도 미리 만들어 둘 
 */

public class Animal {
	private int age;
	
	public Animal() {
		
	}

	// 매개변수 생성자
	public Animal(int age) {
		super();
		this.age = age;
	}
	
	

}

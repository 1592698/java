package javaPractice.ch_10_question;


public class Test10_RobotPet extends Test10_pet {
	public Test10_RobotPet(String name, String masterName) { //생성자
		super(name, masterName); //상위 클래스의 생성자
	}
	
	public void introduce() { //자기소개
		System.out.print("저는 로봇입니다, 이름은 " + getName()+ "입니다.");
		System.out.print("  주인님은, " + getMasterName()+ "입니다.");

	}
	public void work(int sw) { //집안 일을 한다
		switch(sw) {
		case 0 : 
			System.out.println("청소를 합니다");
			break;
		case 1 : 
			System.out.println("빨래를 합니다");
			break;
		case 2 : 
			System.out.println("밥을 짓습니다");
			break;
		}
	}
}


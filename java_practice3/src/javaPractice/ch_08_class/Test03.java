package javaPractice.ch_08_class;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//같은 클래스를 가지고 만든 두 객체는 구조는 동일하지만 서로 다른 저장공간을 가짐
		
		Car mycar1=new Car(); // car 인스턴스 생성
		Car mycar2 =new Car(); // car 인스턴스 하나 더 생성
		
		mycar1.color="red"; // mycar1의 색상 빨강
		mycar2.color="black"; // mycar1의 색상 검정
		mycar1.speedUp(); //mycar1 액셀 메서드 호출
		mycar2.wiper(); //mycar2 와이퍼 메서드 호출
		
		System.out.println("mycar1의 색 : " + mycar1.color);
		System.out.println("mycar2의 색 : " + mycar2.color);
		System.out.println("mycar1의 속도 : " + mycar1.speed);
		System.out.println("mycar2의 속도 : " + mycar2.speed);
		System.out.println("mycar1의 와이퍼 작동 여부 : " + mycar1.wiperOn);
		System.out.println("mycar2의 와이퍼 작동 여부 : " + mycar2.wiperOn);
		
	}

}

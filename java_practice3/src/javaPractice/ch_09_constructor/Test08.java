package javaPractice.ch_09_constructor;

import org.w3c.dom.NameList;

public class Test08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Ŭ???? ?ۼ? ?? ????????
		 * Person ?̶??? Ŭ?????? ?ۼ??ϰ? ?׽?Ʈ ?϶?
		 * Person ?̶??? Ŭ?????? ?????? ???? ?ʵ??? ?޼??带 ??????
		 * #?ʵ?
		 * name: ?̸?(private)
		 * mobile: ?ڵ??? ??ȣ(private)
		 * office: ???? ??ȭ??ȣ(private)
		 * email: ?̸??? ?ּ? (private)
		 * 
		 * #?޼???
		 * Person(n,m,oi,e) : ?????? ?޼???
		 * toString() : ?ﰢ?? ?????? ???ڿ??? ??ȯ?ϴ? ?޼???
		 * setName(), getName()...: ?? ?Ӽ??? ???? ?????ڿ? ?????? ?޼???
		 * */
		
		Person person = new Person("?ڹڹ?","010-1234-5678","053-123-4567", "test@naver.com");
		System.out.println(person);
		//Person(name="?ڽ???", mobile="010=1234-5678", office='053-123-4567', email='test@naver.com'
		person.setEmail("test@kakao.com");
		person.setMobile("010-5678-1234");
		System.out.println(person);
		//person name=?ڹڹ?, mobile= 010-5678-1234, office = 053-123-4567, email = test@kakao.com
	}
}

class Person{
	private String name;
	private String mobile;
	private String office;
	private String email;
	
	public Person(String name, String mobile, String office, String email) {
		this.name= name;
		this.mobile = mobile;
		this.office = office;
		this.email = email;
	}
	
	public String toString() {
		return "Person name=" + name + ", mobile= " + mobile + ", office = " + office +", email = " + email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getMobile(String mobile) {
		return mobile;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public void setMobile(String mobile) {
		this.mobile=mobile;
	}
	

}

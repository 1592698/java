package javaPractice.ch_08_class.student;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*��� ������ �����ϴ� ����� 1)�ٷ����� 2) �޼��带 ���� ������ ����
		 * �Ϲ������δ� �޼��带 ���� ������ ���*/
		
		Student student1 = new Student();
		//student1.StudentName("�ȿ���");
		student1.setStudentName("�ȿ���");
		System.out.println(student1.getStudentName());
		
		Student student2 = new Student();
		//student2.StudentName("ȫ�浿");
		student2.setStudentName("ȫ�浿");
		System.out.println(student2.getStudentName());
	}

}
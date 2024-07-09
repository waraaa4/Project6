package object;

public class Quiz2 {

	// 2번.
	// 학생이 택시에 타는 과정을 구현하세요
	// 2만원을 가진 둘리가 택시를 타고 학교에 갑니다.
	// 택시요금은 1만원을 지불했습니다.
	// 단, 소지금이 만원보다 적으면 택시에 탈 수 없습니다.
	public static void main(String[] args) {
		Student student = new Student("둘리", 20000);
		
		Tax tax = new Tax("5884");
		
		student.takeTax(tax);
		
		student.showInfo();
		tax.showInfo();

	}

}







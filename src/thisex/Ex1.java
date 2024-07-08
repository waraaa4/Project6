package thisex;

public class Ex1 {

	public static void main(String[] args) {
		
		BirthDay bDay = new BirthDay();
		bDay.setYear(2000);
		System.out.println(bDay);
		bDay.printThis();

	}

}

// 생일 클래스
class BirthDay {
	int year;
	
	// 태어난 연도를 변경하는 메소드
	public void setYear(int year) {
		this.year = year;
	}
	
	// this의 값을 출력하는 메소드
	public void printThis() {
		System.out.println(this);
	}
}



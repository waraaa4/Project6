package scope;


// 인스턴스변수, 클래스변수 / 전역변수, 지역변수
// 구분에 따라 변수의 유효범위를 작성하세요.
class Person {
	
	// 인스턴스 변수는 객체를 생성한 후부터 사용 가능
	// 전역 변수는 클래스 안에서 어디서나 사용가능
	String personName; // 인스턴스 변수
	int personAge; // 인스턴스 변수 
	
	// 클래스 변수는 프로그램 실행 후 바로 사용 가능
	static char gender = 'F'; // 클래스 변수
	
	// 지역변수는 함수 안에서만 사용 가능
	public void setPersonName(String name) { // 지역 변수
		this.personName = name;
	}
	
}

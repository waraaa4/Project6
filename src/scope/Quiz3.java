package scope;

public class Quiz3 {

	public static void main(String[] args) {
		
		Person person = new Person(); // 메인함수 안에서 사용 가능
		int i = 10; // 메인함수 안에서 사용 가능
		
		if(i > 1) {
			String str = "안녕하세요"; // if문 안에서만 사용가능
		}
		
		for(int k=0; k<10; k++) { // for문 안에서만 사용가능
			System.out.println(k);
		}

	}

}

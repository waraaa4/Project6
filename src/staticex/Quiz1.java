package staticex;

public class Quiz1 {

	// 1번.
	// 카드를 발급하는 프로그램을 구현하세요.
	
	// 카드(Card)을 정의하는 클래스를 만드세요.
	// 속성: 카드번호
	// 카드번호는 100번부터 시작하고 발급할 때마다 1씩 증가합니다.
	// 카드 3장을 생성하고, 각 카드의 번호를 출력하세요. (101 102 103)
	public static void main(String[] args) {
		Card card1 = new Card();
		Card card2 = new Card();
		Card card3 = new Card();
		
		System.out.println(card1.number + " " +
				card2.number + " " +
				card3.number);
	}

}

class Card {
	static int count = 100;
	int number;
	
	public Card() {
		count++;
		number = count;
	}
}
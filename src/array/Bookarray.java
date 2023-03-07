package array;

public class Bookarray {

	public static void main(String[] args) {
	
		Book[]  library = new Book[5];  //책 5권을 만든 것이 아니라 책을 만들 5개의 주소를 나타냄.
		
		library[0] = new Book("태백산맥", "조정래");
		library[1] = new Book("데미안", "헤르만 헤세");
		library[2] = new Book("어떻게 살 것인가", "유시민");
		library[3] = new Book("토지", "박경리");
		library[4] = new Book("어린왕자", "생텍쥐페리");
		
		for(int i = 0; i<library.length; i++ ) {
			library[i].showBookInfo();
		}
		
		for(int i = 0; i<library.length; i++ ) {
			System.out.println(library[i]);
		}
		
	}

}

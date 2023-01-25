package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {

	private List<Book> books;		// 배열 인덱스가 필요 없어진다.
	private Scanner sc;
	
	public Library() {
		books = new ArrayList<Book>();
		sc = new Scanner(System.in);
	}

	private void addBook() {
		System.out.println("=== 책 추가하기 ===");
		System.out.print("isbn >>> ");
		String isbn = sc.next();
		System.out.print("title >>> ");
		String title = sc.next();
		System.out.print("author >>> ");
		String author = sc.next();
		Book book = new Book(isbn, title, author);
		books.add(book);
		System.out.println(title + " 책이 추가되었습니다.");
	}
	
	private void deleteBook() {		// RuntimeException은 Unchecked Exception이기 때문에 throws 생략해도 정상 작동한다.
		System.out.println("=== 책 삭제하기 ===");
	
			if(books.size() == 0 || books.isEmpty()) {
				throw new RuntimeException("등록된 책이 없습니다.");
			}
			System.out.println("삭제할 isbn >>> ");
			String isbn = sc.next();
			if(isbn.isEmpty() == false) {
				//	객체 기반 삭제(Book 객체간 동등 비교가 필요하기 때문에 equals 메소드를 오버라이드 해야한다.
				 for(Book book : books) {
					 if(isbn.equals(book.getIsbn())) {
						 books.remove(book);	// equals 메소드가 내부에서 사용된다.
						 System.out.println(book + " 책이 삭제되었습니다.");
						 return;
					 }
				 }
				/*	인덱스 기반 삭제
				for(int i = 0; i < books.size(); i++) {
					Book book = books.get(i);
					if(isbn.equals(book.getIsbn())) {
						Book deletedBook = books.remove(i);		// remove(i)는 삭제된 요소(Book)를 반환
						System.out.println(deletedBook + " 책이 삭제되었습니다.");
						return;
					}
				} */
			}
			throw new RuntimeException(isbn + " isbn을 가진 책이 없습니다.");
	}
	
	private void findBook() throws RuntimeException {
		System.out.println("=== 책 조회하기 ===");
		
			if(books.isEmpty()) {
				throw new RuntimeException("등록된 책이 없습니다.");
			}
			System.out.println("조회할 isbn >>> ");
			String isbn = sc.next();
			if(!isbn.isEmpty()) {		// !는 잘 안보이기 때문에 사용을 자제한다.
				for(Book book : books) {
					if(isbn.equals(book.getIsbn())) {
						System.out.println("조회 결과 : " + book);
						return;
					}
				}
			}
			throw new RuntimeException(isbn + " isbn을 가진 책이 없습니다.");
	}
	
	private void printAllBook() throws RuntimeException {
		System.out.println("=== 전체 조회하기 ===");
		
			if(books.isEmpty()) {
				throw new RuntimeException("등록된 책이 없습니다.");
			}
			for(Book book : books) {
				System.out.println(book);
			}
	}
	
	public void manage() {
		
		while(true) {
			try {
				System.out.println("1.추가 2. 삭제 3.조회 4.전체 0.종료 >>>");
				String choice = sc.next();
				switch(choice) {
				case "1":
					addBook();
					break;
				case "2":
					deleteBook();
					break;
				case "3":
					findBook();
					break;
				case "4":
					printAllBook();
					break;
				case "0":
					System.out.println("도서관리 프로그램을 종료합니다.");
					return;
				default:
					System.out.println("잘못된 입력입니다. 다시 시도하세요.");
				}
			} catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}

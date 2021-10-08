package task4;
import java.util.*;

public class Main {
	public static void main(String[] args) {

		Book b1 = new Book();
		b1.setTitle("テスト");
		b1.setPublishDate(new Date(1316622225935L));
		b1.setComment("面白い");
		System.out.println();

		Book b2 = new Book();
		b2.setTitle("テスト2");
		b2.setPublishDate(new Date(1313132755277L));
		b2.setComment("楽しい");
		System.out.println();

		ArrayList<Book> list = new ArrayList<Book>();
		list.add(b1);
		list.add(b2);

		Collections.sort(list);

//		Collections.sort(Book);
		System.out.println(list);
		System.out.println(b1.getTitle());
		System.out.println(b1.getPublishDate());
	}

}

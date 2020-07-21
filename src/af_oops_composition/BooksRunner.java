package af_oops_composition;

public class BooksRunner {

	public static void main(String[] args) {
		Book book = new Book(12, "Into to programming", "Madman");

		System.out.println(book);

		book.addReview(new Review(21, "Very good book", 5));

		System.out.println(book);

		book.addReview(new Review(22, "Very good book, rocking it", 5));
		System.out.println(book);

	}
}

package s11;

public class book extends TangibleAsset {
	String isbn;

	public book(String name, int price, String color, double weight, String isbn) {
		super(name, price, color, weight);
		this.isbn = isbn;
	}

	public String getIsbn() {
		return this.isbn;
	}

}

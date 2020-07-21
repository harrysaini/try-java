package af_oops_composition;

public class Review {
	private int id;
	private String reviewString;
	private int rating;

	public Review(int id, String reviewString, int rating) {
		this.id = id;
		this.reviewString = reviewString;
		this.rating = rating;
	}

	public String toString() {
		return "Review [id=" + id + ", reviewString=" + reviewString + ", rating=" + rating + "]";
	}

}

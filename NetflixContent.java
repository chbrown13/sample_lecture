/**
 * Class representing content on Netflix
 */
ublic class NetflixContent {

	public String title = "Test Title";
	public int rating = 0;

	public NetflixContent() {
		System.out.println("New Netflix Content added to Netflix...");
	}
	
	/**
	 * Get the Netflix Content title
	 */
	public String getTitle() {
		System.out.println(String.format("\tTitle: %s", this.title));
		return this.title;
	}
	
	/**
	 * Get the Netflix Content star rating
	 */
	public int getRating() {
		System.out.println(String.format("\tRating: %d", this.rating));
		return this.rating;
	}
}

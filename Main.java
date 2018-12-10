public class Main {
	public static void main(String[] args) {
		NetflixContent netflix = new NetflixContent();
		netflix.getTitle();
		netflix.getRating();
		System.out.println("-----");

		Show show = new Show("Stranger Things", 5, 17);
		show.getTitle();
		show.getRating();
		show.getEpisodeCount();

		System.out.println("-----");
		// Movie movie = new Movie(); TODO: Create a new movie object
		// movie.getTitle();
		// movie.getRating();
		// TODO: Implement another function for movies
	}
}

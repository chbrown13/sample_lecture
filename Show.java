/**
 * Class representing a TV show on Netflix
 */
public class Show extends NetflixContent {

	public int episodeCount;

	public Show(String title, int rating, int episodes) {
		super();
		this.title = title;
		this.rating = rating;
		this.episodeCount = episodes;
		System.out.println("* A new show " + title + " has been added to Netflix!");
	}

	/**
	 * Get the total number of show episodes
	 */
	public int getEpisodeCount() {
		System.out.println(String.format("\tNo. of episodes: %d", this.episodeCount));
		return this.episodeCount;
	}
}

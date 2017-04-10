package cinemaServachak;

public class Seance {

	private Movie movie;
	private Time startTime;
	private  Time endTime;
	
	public Seance(Movie movie, Time startTime) {
		super();
		this.movie = movie;
		this.startTime = startTime;
		
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public Time getStartTime() {
		return startTime;
	}

	public void setStartTime(Time startTime) {
		this.startTime = startTime;
	}

	public Time getEndTime() {
		return endTime;
	}

	public void setEndTime(Time endTime) {
		this.endTime = new Time(movie.getDuration().getHour() + startTime.getHour(),movie.getDuration().getMin() + startTime.getMin());
	}

	@Override
	public String toString() {
		return "Seanse [movie=" + movie + ", startTime=" + startTime + ", endTime=" + endTime + "]";
	}
	
	
	
	
}

package cinemaServachak;

import java.util.List;

public class Seance {

	private Movie movie;
	private Time startTime;
	private Time endTime;

	List<Movie> movies = new java.util.ArrayList<>();
	public Seance(){
				
	}
	
	public Seance(Movie movie, Time startTime) {
		super();
		this.movie = movie;
		this.startTime = startTime;

				int endFilmHour = movie.getDuration().getHour() + startTime.getHour();
				int endFilmMin = movie.getDuration().getMin() + startTime.getMin();
				if (endFilmMin > 60 ){
					endFilmHour = endFilmHour + ( endFilmMin / 60);
					endFilmMin = endFilmMin % 60;
				}
				this.endTime = new Time(endFilmHour, endFilmMin);


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
	
	public void setEndTime(Time endTime){
		this.endTime = endTime;
	}
	

	@Override
	public String toString() {
		return "Seanse [movie=" + movie + ", startTime=" + startTime + ", endTime=" + endTime + "]";
	}

	
}

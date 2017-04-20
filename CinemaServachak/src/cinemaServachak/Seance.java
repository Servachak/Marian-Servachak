package cinemaServachak;

public class Seance {

	private Movie movie;
	private Time startTime;
	private Time endTime;

	public Seance(){
		
		
	}
	public Seance(Movie movie, Time startTime) {
		super();
		this.movie = movie;
		this.startTime = startTime;
//		this.endTime = new Time();
				int endFilmHour = movie.getDuration().getHour() + startTime.getHour();
				int endFilmMin = movie.getDuration().getMin() + startTime.getMin();
				if (endFilmMin > 60 ){
					endFilmHour = endFilmHour + ( endFilmMin / 60);
					endFilmMin = endFilmMin % 60;
				}
				this.endTime = new Time(endFilmHour, endFilmMin);
//				this.endTime = new Time(movie.getDuration().getHour() + startTime.getHour(), movie.getDuration().getMin() + startTime.getMin());

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
				
		//		int endFilmTimeHour = movie.getDuration().getHour() + startTime.getHour();
//		int endFilmTimeMin = movie.getDuration().getMin() + startTime.getMin();
//			
//		if( endFilmTimeMin > 60){
//			endTime.setHour(endFilmTimeHour + (endFilmTimeMin / 60));
//			endTime.setMin(endFilmTimeMin % 60);
//		}
//		
		this.endTime = endTime;
	}
	
//	public void setEndTime(Time durationFilmTime, Time startFilmTime) {
//		int endFilmTimeHour = durationFilmTime.getHour() + startFilmTime.getHour();
//		int endFilmTimeMin = durationFilmTime.getMin() + startFilmTime.getMin();
//		for (int i = 0; i < 24; i++) {
//			if(endFilmTimeMin > 60){
//				endFilmTimeHour = endFilmTimeHour + (endFilmTimeMin * 60);
//				endFilmTimeMin = endFilmTimeMin % 60;
//				this.endTime = new Time(endFilmTimeHour, endFilmTimeMin);
//			}else{
//				break;
//			}
//		}
//		
//		}
	

	@Override
	public String toString() {
		return "Seanse [movie=" + movie + ", startTime=" + startTime + ", endTime=" + endTime + "]";
	}

}

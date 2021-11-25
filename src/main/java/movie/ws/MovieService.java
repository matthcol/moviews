package movie.ws;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.jws.WebService;

import movie.model.Movie;

@WebService(endpointInterface = "movie.ws.IMovieService")
public class MovieService implements IMovieService {

	@Override
	public List<Movie> getMovies() {
		List<Movie> res = new ArrayList<>();
		Collections.addAll(res, 
				new Movie(1, "Star Wars II" , 1999, 130),
				new Movie(2, "No Time To Die" , 2021, 130)
				);
		return res;
	}

	@Override
	public List<Movie> searchMovies(String partTitle, Integer year, Integer yearMin, Integer yearMax) {
		List<Movie> res = new ArrayList<>();
		Collections.addAll(res, 
				new Movie(1, "Star Wars IV" , 1999, 130),
				new Movie(4, "Star Wars V" , 2021, 130)
				);
		return res;
	}

	

}

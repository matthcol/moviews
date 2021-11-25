package movie.ws;

import java.util.List;

import movie.model.Movie;
import javax.jws.WebService;
import javax.jws.WebMethod;

@WebService
public interface IMovieService {
	
	@WebMethod
	List<Movie> getMovies();
	
	@WebMethod
	List<Movie> searchMovies(String partTitle, Integer year, Integer yearMin, Integer yearMax);

}

package movie.ws;

import java.util.List;

import movie.model.Movie;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService
public interface IMovieService {
	
	@WebMethod
	List<Movie> getMovies();
	
	@WebMethod
	List<Movie> searchMovies(
			@WebParam(name = "partTitle", partName = "partTitle") String partTitle, 
			Integer year, Integer yearMin, Integer yearMax);

}

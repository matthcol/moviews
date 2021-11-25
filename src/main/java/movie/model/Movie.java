package movie.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Movie {
	private Integer id;
	private String name;
	private Integer year;
	private Integer duration;
	
	public Movie() {
		super();
	}

	public Movie(Integer id, String name, Integer year, Integer duration) {
		super();
		this.id = id;
		this.name = name;
		this.year = year;
		this.duration = duration;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public Integer getDuration() {
		return duration;
	}
	public void setDuration(Integer duration) {
		this.duration = duration;
	}
	
	
	
	
		
}

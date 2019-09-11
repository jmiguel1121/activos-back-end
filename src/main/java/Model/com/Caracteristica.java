package Model.com;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "caracteristica")
public class Caracteristica {
	
	@Id
    private long id;
	private String peso;
	private String alto;
	private String acho;
	private String largo;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getAlto() {
		return alto;
	}
	public void setAlto(String alto) {
		this.alto = alto;
	}
	public String getAcho() {
		return acho;
	}
	public void setAcho(String acho) {
		this.acho = acho;
	}
	public String getLargo() {
		return largo;
	}
	public void setLargo(String largo) {
		this.largo = largo;
	}
	
	
}

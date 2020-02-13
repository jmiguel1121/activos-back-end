package Model.com;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "activo")
public class Activo {

	@Id
    private long id;
	private String nombre;
	private String descripcion;
	private String color;
	public long getId() {
		return id;
	}
	/* rama master*/
	public void setId(long id) {
		this.id = id;
	}
    /* rama master*/
	public String getDescripcion() {
		return descripcion;
	}
    /* rama master*/
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
    /* rama master*/
	public String getColor() {
		return color;
	}
    /* rama master*/
	public void setColor(String color) {
		this.color = color;
	}
	
	
	
	
}

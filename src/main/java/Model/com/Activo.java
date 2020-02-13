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
	/* rama preuba 3_3*/
	public void setId(long id) {
		this.id = id;
	}
    /* rama preuba 3*/
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
    /* rama preuba 2*/
	public String getColor() {
		return color;
	}
    /* rama preuba */
	public void setColor(String color) {
		this.color = color;
	}
	
	/*commit repositorio externo*/
	
	
}

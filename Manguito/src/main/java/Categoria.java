import javax.persistence.*;

@Entity
public class Categoria {
	@Id @GeneratedValue
	@Column(name="categoria_id")
	private Long id;
	@Column
	private String nombre;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

}

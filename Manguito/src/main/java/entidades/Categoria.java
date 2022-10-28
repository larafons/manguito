package entidades;
import java.util.Set;

import javax.persistence.*;

@Entity
public class Categoria {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="categoria_id")
	private Long id;
	@Column
	private String nombre;
	@ManyToMany
	private Set<Emprendimiento> emprendimientos;
	
	public Categoria() {
		super();
	}

	public Set<Emprendimiento> getEmprendimientos() {
		return emprendimientos;
	}

	public void setEmprendimientos(Set<Emprendimiento> emprendimientos) {
		this.emprendimientos = emprendimientos;
	}

	public Categoria(String nombre) {
		this.nombre = nombre;
	}
	
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

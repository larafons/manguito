import java.util.Set;

import javax.persistence.*;

@Entity
public class Categoria {
	@Id @GeneratedValue
	@Column(name="categoria_id")
	private Long id;
	@Column
	private String nombre;
	@ManyToMany
	private Set<Emprendimiento> emprendimientos;

}

import javax.persistence.*;

@Entity
public class Categoria {
	@Id @GeneratedValue
	@Column(name="administrador_id")
	private String nombre;

}

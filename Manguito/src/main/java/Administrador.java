import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Administrador {
	@Id @GeneratedValue
	@Column(name="administrador_id")
	private Long id;
	@Column
	private String usuario;
	@Column
	private String passwd;

}

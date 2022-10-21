import javax.persistence.*;

@Entity
public class Emprendedor {
	
	@Id @GeneratedValue
	@Column(name="administrador_id")
	private Long id;
	@Column
	private String passwd;
	@Column
	private String usuario;
	//?????????????
	private Emprendimiento emprendimiento;
		

}

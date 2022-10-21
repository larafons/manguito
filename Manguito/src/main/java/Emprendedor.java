import javax.persistence.*;

@Entity
public class Emprendedor {
	
	public Long getId() {
		return id;
	}
	public String getPasswd() {
		return passwd;
	}
	public String getUsuario() {
		return usuario;
	}
	public Emprendimiento getEmprendimiento() {
		return emprendimiento;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public void setEmprendimiento(Emprendimiento emprendimiento) {
		this.emprendimiento = emprendimiento;
	}
	@Id @GeneratedValue
	@Column(name="administrador_id")
	private Long id;
	@Column
	private String passwd;
	@Column
	private String usuario;
	@OneToOne
	private Emprendimiento emprendimiento;
		

}

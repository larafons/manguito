package entidades;
import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Posteo {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="posteo_id")
	private Long id;
	@Column
	private String foto; //ver como convertir en String
	@Column
	private String texto;
	@Column
	private LocalDate fecha;
	
	
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

}

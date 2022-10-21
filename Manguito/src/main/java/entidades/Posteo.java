package entidades;
import java.awt.Image;
import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Posteo {
	@Id @GeneratedValue
	@Column(name="posteo_id")
	private Long id;
	@Column
	private Image foto;
	@Column
	private String texto;
	@Column
	private LocalDate fecha;
	
	
	public Image getFoto() {
		return foto;
	}
	public void setFoto(Image foto) {
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

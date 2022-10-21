import java.awt.Image;
import java.time.LocalDate;

public class Posteo {
	
	private Image foto;
	private String texto;
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

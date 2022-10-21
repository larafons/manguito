import java.time.LocalDate;
import javax.persistence.*;

@Entity
public class Donacion extends Pago{
	
	private LocalDate fecha;
	private int cantManguitos;
	private Emprendimiento emprendimiento;
	
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public int getCantManguitos() {
		return cantManguitos;
	}
	public void setCantManguitos(int cantManguitos) {
		this.cantManguitos = cantManguitos;
	}
}

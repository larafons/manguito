import java.util.List;

public class PlanOfrecido {
	
	private String beneficio;
	private double precio;
	private boolean vigente;
	private List<PlanComprado> planesComprados;
	private Emprendimiento emprendimiento;
	
	public String getBeneficio() {
		return beneficio;
	}
	public void setBeneficio(String beneficio) {
		this.beneficio = beneficio;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public boolean isVigente() {
		return vigente;
	}
	public void setVigente(boolean vigente) {
		this.vigente = vigente;
	}
	public List<PlanComprado> getPlanesComprados() {
		return planesComprados;
	}
	public void setPlanesComprados(List<PlanComprado> planesComprados) {
		this.planesComprados = planesComprados;
	}
	
	
}

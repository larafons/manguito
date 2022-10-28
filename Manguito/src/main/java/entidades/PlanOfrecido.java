package entidades;
import java.util.List;

import javax.persistence.*;

@Entity
public class PlanOfrecido {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="plan_ofrecido_id")
	private Long id;
	@Column
	private String beneficio;
	@Column
	private double precio;
	@Column
	private boolean vigente;
	@OneToMany //????????
	private List<PlanComprado> planesComprados;
	@ManyToOne
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

import java.awt.Image;
import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class Emprendimiento {
	@Id @GeneratedValue
	@Column(name="emprendimiento_id")
	private Long id;
	@Column
	private String url;
	@Column
	private String nombre;
	@Column
	private String descripcion;
	@Column
	private Image banner; //como se almacena en la bd??
	@Column
	private boolean visualizadorManguitos;
	@Column
	private boolean visualizarDonantes;
	@Column
	private double precioManguito;
	@Column
	private Emprendedor emprendedor;
	
	@OneToMany
	private Set<String> redes;
	
	@OneToMany 
	private List<Posteo> posteo;
	
	@OneToMany
	private Set<PlanOfrecido> planesOfrecidos;
	
	@OneToMany
	private Set<Donacion> donaciones;
	
	@ManyToMany
	private Set<Categoria> categorias;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Image getBanner() {
		return banner;
	}

	public void setBanner(Image banner) {
		this.banner = banner;
	}

	public boolean isVisualizadorManguitos() {
		return visualizadorManguitos;
	}

	public void setVisualizadorManguitos(boolean visualizadorManguitos) {
		this.visualizadorManguitos = visualizadorManguitos;
	}

	public boolean isVisualizarDonantes() {
		return visualizarDonantes;
	}

	public void setVisualizarDonantes(boolean visualizarDonantes) {
		this.visualizarDonantes = visualizarDonantes;
	}

	public double getPrecioManguito() {
		return precioManguito;
	}

	public void setPrecioManguito(double precioManguito) {
		this.precioManguito = precioManguito;
	}

	public Emprendedor getEmprendedor() {
		return emprendedor;
	}

	public void setEmprendedor(Emprendedor emprendedor) {
		this.emprendedor = emprendedor;
	}

	public Set<String> getRedes() {
		return redes;
	}

	public void setRedes(Set<String> redes) {
		this.redes = redes;
	}

	public List<Posteo> getPosteo() {
		return posteo;
	}

	public void setPosteo(List<Posteo> posteo) {
		this.posteo = posteo;
	}

	public Set<PlanOfrecido> getPlanesOfrecidos() {
		return planesOfrecidos;
	}

	public void setPlanesOfrecidos(Set<PlanOfrecido> planesOfrecidos) {
		this.planesOfrecidos = planesOfrecidos;
	}

	public Set<Donacion> getDonaciones() {
		return donaciones;
	}

	public void setDonaciones(Set<Donacion> donaciones) {
		this.donaciones = donaciones;
	}

	public Set<Categoria> getCategorias() {
		return categorias;
	}

	public void setCategorias(Set<Categoria> categorias) {
		this.categorias = categorias;
	}
	

	

}

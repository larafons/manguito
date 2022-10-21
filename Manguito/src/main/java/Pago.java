
public abstract class Pago {
	
	private double precio;
	private String mensaje;
	private String nombreDonador;
	private String emailDonador;
	private String telefonoDonador;
	
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public String getNombreDonador() {
		return nombreDonador;
	}
	public void setNombreDonador(String nombreDonador) {
		this.nombreDonador = nombreDonador;
	}
	public String getEmailDonador() {
		return emailDonador;
	}
	public void setEmailDonador(String emailDonador) {
		this.emailDonador = emailDonador;
	}
	public String getTelefonoDonador() {
		return telefonoDonador;
	}
	public void setTelefonoDonador(String telefonoDonador) {
		this.telefonoDonador = telefonoDonador;
	}
	
	

}

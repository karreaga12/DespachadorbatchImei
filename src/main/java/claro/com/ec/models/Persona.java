package claro.com.ec.models;

public class Persona {

	 private String primerNombre;
	 private String segundoNombre;
	 private String telefono ;
	public String getPrimerNombre() {
		return primerNombre;
	}
	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}
	public String getSegundoNombre() {
		return segundoNombre;
	}
	public void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public Persona(String primerNombre, String segundoNombre, String telefono) {
		super();
		this.primerNombre = primerNombre;
		this.segundoNombre = segundoNombre;
		this.telefono = telefono;
	}
	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Persona [primerNombre=" + primerNombre + ", segundoNombre=" + segundoNombre + ", telefono=" + telefono
				+ "]";
	}
	 
	 
	 
	 
}
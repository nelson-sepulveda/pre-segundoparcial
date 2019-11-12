package negocio;

import java.util.Date;

public class empleado {
	
	private String nombre;
	private String cedula;
	private String codigo;
	private Date fechanacimiento;
	private Date fechaingreso;
	private Date fecharetiro;
	
	

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getCedula() {
		return cedula;
	}


	public void setCedula(String cedula) {
		this.cedula = cedula;
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public Date getFechanacimiento() {
		return fechanacimiento;
	}


	public void setFechanacimiento(Date fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}


	public Date getFechaingreso() {
		return fechaingreso;
	}


	public void setFechaingreso(Date fechaingreso) {
		this.fechaingreso = fechaingreso;
	}


	public Date getFecharetiro() {
		return fecharetiro;
	}


	public void setFecharetiro(Date fecharetiro) {
		this.fecharetiro = fecharetiro;
	}


	
	public empleado() {}
	
	
	public String toString() {
		return "empleado [nombre=" + nombre + ", cedula=" + cedula + ", codigo=" + codigo + ", fechanacimiento="
				+ fechanacimiento + ", fechaingreso=" + fechaingreso + ", fecharetiro=" + fecharetiro + "]";
	}
	
	
}


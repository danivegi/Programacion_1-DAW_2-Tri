package modelo;

import excepciones.CamposVacioException;

public class Direccion {
	
	private String calle;
	private String poblacion;
	private String provincia;
	private String codPostal;
	
	//Constructor vacío
	public Direccion() {
		
	}

	public Direccion(String calle, String poblacion, String provincia, String codPostal) throws CamposVacioException {
		super();
		this.setCalle(calle);
		this.setPoblacion(poblacion);
		this.setProvincia(provincia);
		this.setCodPostal(codPostal);
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) throws CamposVacioException{
		this.calle = calle;
		if(calle.isEmpty())
			throw new CamposVacioException("El campo Calle está vacío");
	}

	public String getPoblacion() {
		return poblacion;
	}

	public void setPoblacion(String poblacion) throws CamposVacioException{
		this.poblacion = poblacion;
		if(poblacion.isEmpty())
			throw new CamposVacioException("El campo Poblacion está vacío");
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) throws CamposVacioException{
		this.provincia = provincia;
		if(provincia.isEmpty())
			throw new CamposVacioException("El campo Provincia está vacío")
	}

	public String getCodPostal() {
		return codPostal;
	}

	public void setCodPostal(String codPostal) {
		this.codPostal = codPostal;
	}

	@Override
	public String toString() {
		return "Direccion [calle=" + calle + ", poblacion=" + poblacion + ", provincia=" + provincia + ", codPostal="
				+ codPostal + "]";
	}
	
	

}

package Sistema1;

public class Escultura extends Pieza {
    protected double Alto;
    protected double Ancho;
    protected double Profundidad;
    protected String Materiales;
    protected double Peso;
    protected String DetallesInstalacion;

	public Escultura(String titulo, int anio, String lugar_creacion, int id_pieza, Boolean disponible_valor_fijo,
			Boolean pieza_bloqueada, Boolean pieza_vendida, Double valor_minimo, Double valor_inicial, String ubicacion,double Alto,double Ancho, double Profundidad,String Materiales,double Peso, String DetallesInstalacion) {
		super(titulo, anio, lugar_creacion, id_pieza, disponible_valor_fijo, pieza_bloqueada, pieza_vendida, valor_minimo,
				valor_inicial, ubicacion);
		this.Alto=Alto;
	    this.Ancho=Ancho;
	    this.Profundidad=Profundidad;
	    this.Materiales=Materiales;
	    this.Peso=Peso;
	    this.DetallesInstalacion=DetallesInstalacion;
		
	}

	public double getAlto() {
		return Alto;
	}

	public double getAncho() {
		return Ancho;
	}

	public double getProfundidad() {
		return Profundidad;
	}

	public String getMateriales() {
		return Materiales;
	}

	public double getPeso() {
		return Peso;
	}

	public String getDetallesInstalacion() {
		return DetallesInstalacion;
	}

}

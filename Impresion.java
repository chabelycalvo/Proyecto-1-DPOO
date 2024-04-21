package Sistema1;

public class Impresion extends Pieza {
    protected double Alto;
    protected double Ancho;
    protected String Materiales;
    protected String DetallesInstalacion;

	public Impresion(String titulo, int anio, String lugar_creacion, int id_pieza, Boolean disponible_valor_fijo,
			Boolean pieza_bloqueada, Boolean pieza_vendida, Double valor_minimo, Double valor_inicial, String ubicacion,double Alto,double Ancho,String Materiales,String DetallesInstalacion) {
		super(titulo, anio, lugar_creacion, id_pieza, disponible_valor_fijo, pieza_bloqueada, pieza_vendida, valor_minimo,
				valor_inicial, ubicacion);
		this.Alto=Alto;
		this.Ancho=Ancho;
		this.Materiales=Materiales;
		this.DetallesInstalacion=DetallesInstalacion;
	
	}

	public double getAlto() {
		return Alto;
	}

	public double getAncho() {
		return Ancho;
	}

	public String getMateriales() {
		return Materiales;
	}

	public String getDetallesInstalacion() {
		return DetallesInstalacion;
	}

}

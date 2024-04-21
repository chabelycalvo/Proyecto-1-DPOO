package Sistema1;

public class Escultura extends Pieza {
    protected double Alto;
    protected double Ancho;
    protected double Profundidad;
    protected String Materiales;
    protected double Peso;
    protected String DetallesInstalacion;

	public Escultura(String Titulo, int Anio, String LugarCreacion, int IDPieza, boolean DisponibleValorFijo,
			boolean PiezaBloqueada, boolean PiezaVendida, double ValorMinimo, double ValorInicial, String Ubicacion,double Alto,double Ancho, double Profundidad,String Materiales,double Peso, String DetallesInstalacion) {
		super(Titulo, Anio, LugarCreacion, IDPieza, DisponibleValorFijo, PiezaBloqueada, PiezaVendida, ValorMinimo,
				ValorInicial, Ubicacion);
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

package Sistema1;

public class Impresion extends Pieza {
    protected double Alto;
    protected double Ancho;
    protected String Materiales;
    protected String DetallesInstalacion;

	public Impresion(String Titulo, int Anio, String LugarCreacion, int IDPieza, boolean DisponibleValorFijo,
			boolean PiezaBloqueada, boolean PiezaVendida, double ValorMinimo, double ValorInicial, String Ubicacion,double Alto,double Ancho,String Materiales,String DetallesInstalacion) {
		super(Titulo, Anio, LugarCreacion, IDPieza, DisponibleValorFijo, PiezaBloqueada, PiezaVendida, ValorMinimo,
				ValorInicial, Ubicacion);
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

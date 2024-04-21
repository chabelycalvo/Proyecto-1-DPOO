package Sistema1;

public class Fotografia extends Pieza {
    protected String Formato;
    protected String Tamanio;

	public Fotografia(String Titulo, int Anio, String LugarCreacion, int IDPieza, Boolean DisponibleValorFijo,
			Boolean PiezaBloqueada, Boolean PiezaVendida, Double ValorMinimo, Double ValorInicial, String Ubicacion,String Formato,String Tamanio) {
		super(Titulo, Anio, LugarCreacion, IDPieza, DisponibleValorFijo, PiezaBloqueada, PiezaVendida, ValorMinimo,
				ValorInicial, Ubicacion);
		this.Formato=Formato;
		this.Tamanio=Tamanio;
		
		
	}

	public String getFormato() {
		return Formato;
	}

	public String getTamanio() {
		return Tamanio;
	}

}

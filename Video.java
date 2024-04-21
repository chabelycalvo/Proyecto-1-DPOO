package Sistema1;

import java.time.Duration;

public class Video extends Pieza {
    protected Duration Duracion;
    protected String Formato;
    protected String Tamanio;

	public Video(String Titulo, int Anio, String LugarCreacion, int IDPieza, boolean DisponibleValorFijo,
			boolean PiezaBloqueada, boolean PiezaVendida, double ValorMinimo, double ValorInicial, String Ubicacion,Duration Duracion,String Formato,String Tamanio) {
		super(Titulo, Anio, LugarCreacion, IDPieza, DisponibleValorFijo, PiezaBloqueada, PiezaVendida, ValorMinimo,
				ValorInicial, Ubicacion);
		this.Duracion=Duracion;
		this.Formato=Formato;
		this.Tamanio=Tamanio;
	}

	public Duration getDuracion() {
		return Duracion;
	}

	public String getFormato() {
		return Formato;
	}

	public String getTamanio() {
		return Tamanio;
	}

}

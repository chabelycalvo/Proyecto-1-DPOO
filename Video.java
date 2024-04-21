package Sistema1;

import java.time.Duration;

public class Video extends Pieza {
    protected Duration Duracion;
    protected String Formato;
    protected String Tamanio;

	public Video(String titulo, int anio, String lugar_creacion, int id_pieza, Boolean disponible_valor_fijo,
			Boolean pieza_bloqueada, Boolean pieza_vendida, Double valor_minimo, Double valor_inicial, String ubicacion,Duration Duracion,String Formato,String Tamanio) {
		super(titulo, anio, lugar_creacion, id_pieza, disponible_valor_fijo, pieza_bloqueada, pieza_vendida, valor_minimo,
				valor_inicial, ubicacion);
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

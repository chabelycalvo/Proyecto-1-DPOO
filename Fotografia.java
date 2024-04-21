package Sistema1;

public class Fotografia extends Pieza {
    protected String Formato;
    protected String Tamanio;

	public Fotografia(String titulo, int anio, String lugar_creacion, int id_pieza, Boolean disponible_valor_fijo,
			Boolean pieza_bloqueada, Boolean pieza_vendida, Double valor_minimo, Double valor_inicial, String ubicacion,String Formato,String Tamanio) {
		super(titulo, anio, lugar_creacion, id_pieza, disponible_valor_fijo, disponible_valor_fijo, disponible_valor_fijo, valor_minimo,
				valor_inicial, ubicacion);
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

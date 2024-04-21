package Sistema1;

public class Pintura extends Pieza {
    protected double Alto;
    protected double Ancho;
    protected String Tecnica;
    protected String Materiales;

    // Constructor
    public Pintura(String titulo, int anio, String lugar_creacion, int id_pieza, Boolean disponible_valor_fijo,
			Boolean pieza_bloqueada, Boolean pieza_vendida, Double valor_minimo, Double valor_inicial, String ubicacion, double alto, double ancho, String tecnica, String materiales) {
        super(titulo, anio, lugar_creacion,id_pieza,disponible_valor_fijo,pieza_bloqueada,pieza_vendida,valor_minimo,valor_inicial,ubicacion);
        this.Alto = Alto;
        this.Ancho = Ancho;
        this.Tecnica = Tecnica;
        this.Materiales =Materiales;
    }

	public double getAlto() {
		return Alto;
	}

	public double getAncho() {
		return Ancho;
	}

	public String getTecnica() {
		return Tecnica;
	}

	public String getMateriales() {
		return Materiales;
	}}


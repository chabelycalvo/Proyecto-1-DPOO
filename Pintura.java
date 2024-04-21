package Sistema1;

public class Pintura extends Pieza {
    protected double Alto;
    protected double Ancho;
    protected String Tecnica;
    protected String Materiales;

    // Constructor
    public Pintura(String Titulo, int Anio, String LugarCreacion,int IDPieza,Boolean DisponibleValorFijo,Boolean PiezaBloqueada,Boolean PiezaVendida,Double ValorMinimo,Double ValorInicial,String Ubicacion, double alto, double ancho, String tecnica, String materiales) {
        super(Titulo, Anio, LugarCreacion,IDPieza,DisponibleValorFijo,PiezaBloqueada,PiezaVendida,ValorMinimo,ValorInicial,Ubicacion);
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


package Sistema1;
import java.lang.reflect.Field;
import java.util.ArrayList;

public abstract class Pieza {
	 protected String Titulo;
	 protected int Anio;
	 protected String LugarCreacion;
	 protected int IDPieza;
	 protected boolean DisponibleValorFijo;
	 protected boolean PiezaBloqueada;
	 protected boolean PiezaVendida;
	 protected double ValorMinimo;
	 protected double ValorInicial;
	 protected String Ubicacion;
	 
	 public Pieza(String Titulo, int Anio, String LugarCreacion,int IDPieza,boolean DisponibleValorFijo,boolean PiezaBloqueada,boolean PiezaVendida,double ValorMinimo,double ValorInicial,String Ubicacion) {
	 this.Titulo = Titulo;
	 this.Anio = Anio;
	 this.LugarCreacion = LugarCreacion;
	 this.IDPieza = IDPieza;
	 this.DisponibleValorFijo = DisponibleValorFijo;
	 this.PiezaBloqueada = PiezaBloqueada;
	 this.PiezaVendida = PiezaVendida;
	 this.ValorMinimo = ValorMinimo;
	 this.ValorInicial = ValorInicial;
	 this.Ubicacion = Ubicacion;
	 }

	public boolean isDisponibleValorFijo() {
		return DisponibleValorFijo;
	}

	public void setDisponibleValorFijo(boolean disponibleValorFijo) {
		DisponibleValorFijo = disponibleValorFijo;
	}

	public boolean isPiezaBloqueada() {
		return PiezaBloqueada;
	}

	public void setPiezaBloqueada(boolean piezaBloqueada) {
		PiezaBloqueada = piezaBloqueada;
	}

	public boolean isPiezaVendida() {
		return PiezaVendida;
	}

	public void setPiezaVendida(boolean piezaVendida) {
		PiezaVendida = piezaVendida;
	}

	public double getValorMinimo() {
		return ValorMinimo;
	}

	public void setValorMinimo(double valorMinimo) {
		ValorMinimo = valorMinimo;
	}

	public String getUbicacion() {
		return Ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		Ubicacion = ubicacion;
	}

	public String getTitulo() {
		return Titulo;
	}

	public int getAnio() {
		return Anio;
	}

	public String getLugarCreacion() {
		return LugarCreacion;
	}

	public int getIDPieza() {
		return IDPieza;
	}

	public double getValorInicial() {
		return ValorInicial;
	}

	}

	 



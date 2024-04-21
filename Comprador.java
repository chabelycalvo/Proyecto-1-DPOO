package proyecto;

public class Comprador extends Usuario {
	private boolean verificado;
	private String nombre_comprador;
	private String telefono_comprador;
	private double total_invertido;
	private double limite_compra;
	private String idiomas;

	
	public boolean isVerificado() {
		return verificado;
	}

	public void setVerificado(boolean verificado) {
		this.verificado = verificado;
	}

	public String getNombre_comprador() {
		return nombre_comprador;
	}

	public void setNombre_comprador(String nombre_comprador) {
		this.nombre_comprador = nombre_comprador;
	}

	public String getTelefono_comprador() {
		return telefono_comprador;
	}

	public void setTelefono_comprador(String telefono_comprador) {
		this.telefono_comprador = telefono_comprador;
	}

	public double getTotal_invertido() {
		return total_invertido;
	}

	public void setTotal_invertido(double total_invertido) {
		this.total_invertido = total_invertido;
	}

	public double getLimite_compra() {
		return limite_compra;
	}

	public void setLimite_compra(double limite_compra) {
		this.limite_compra = limite_compra;
	}

	public String getIdiomas() {
		return idiomas;
	}

	public void setIdiomas(String idiomas) {
		this.idiomas = idiomas;
	}

	public void ofrecerCompra(Pieza pieza, double valorOfrecido) {
        if (!pieza.isPieza_vendida() && pieza.isDisponible_valor_fijo()) {
            pieza.bloquearPieza();
            System.out.println("Oferta de compra realizada para la pieza: " + pieza.getId_pieza() +
                               " por el comprador: " + nombre_comprador +
                               " por el valor: " + valorOfrecido);
        }
        else {
            System.out.println("La pieza no está disponible para compra.");
        }
    }

	public void realizarOfertaSubasta(Pieza pieza, double oferta, Subasta subasta) {
	    if (!pieza.isPieza_vendida() && subasta != null) {
	        if (oferta >= pieza.getValor_inicial()) {
	            subasta.registrarOferta(oferta, this);
	        } else {
	            System.out.println("La subasta no está activa o la oferta es menor al valor inicial.");
	        }
	    } else {
	        System.out.println("La pieza ya ha sido vendida o no tiene una subasta asociada.");
	    }
	}

	public void verificarCompra(Pieza pieza) {
	    if (pieza.isPieza_vendida()) {
	        System.out.println("Compra verificada para la pieza: " + pieza.getId_pieza());
	    } else {
	        System.out.println("La compra no ha sido verificada.");
	    }
	}




}

package proyecto;
import java.util.HashMap;
import java.util.Map;

public class Subasta {
	private String titulo;
	private String fecha_hora_inicio;
	private String fecha_hora_fin;
	private String lugar;
	private String descripcion;
	private String modalidad;
	private String condiciones;
	private String contacto;
    private Pieza piezaEnSubasta; 
    private Map<Comprador, Double> ofertas; 
    
    public Subasta() {
        this.ofertas = new HashMap<>();
    }

    public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getFecha_hora_inicio() {
		return fecha_hora_inicio;
	}
	public void setFecha_hora_inicio(String fecha_hora_inicio) {
		this.fecha_hora_inicio = fecha_hora_inicio;
	}
	public String getFecha_hora_fin() {
		return fecha_hora_fin;
	}
	public void setFecha_hora_fin(String fecha_hora_fin) {
		this.fecha_hora_fin = fecha_hora_fin;
	}
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getModalidad() {
		return modalidad;
	}
	public void setModalidad(String modalidad) {
		this.modalidad = modalidad;
	}
	public String getCondiciones() {
		return condiciones;
	}
	public void setCondiciones(String condiciones) {
		this.condiciones = condiciones;
	}
	public String getContacto() {
		return contacto;
	}
	public void setContacto(String contacto) {
		this.contacto = contacto;
	}
	public Pieza getPiezaEnSubasta() {
		return piezaEnSubasta;
	}
	public void setPiezaEnSubasta(Pieza piezaEnSubasta) {
		this.piezaEnSubasta = piezaEnSubasta;
	}
	public Map<Comprador, Double> getOfertas() {
		return ofertas;
	}
	public void setOfertas(Map<Comprador, Double> ofertas) {
		this.ofertas = ofertas;
	}
	public void registrarOferta(double oferta, Comprador comprador) {
        if (oferta < piezaEnSubasta.getValor_inicial()) {
            System.out.println("La oferta debe ser al menos igual al valor inicial.");
            return;
        }
        if (ofertas.containsKey(comprador)) {
            System.out.println("Ya has realizado una oferta para esta subasta.");
            return;
        }
        ofertas.put(comprador, oferta);
        System.out.println("Oferta de " + oferta + " registrada para " + comprador.getNombre_comprador());
    }
    public void iniciarSubasta() {
        System.out.println("Subasta iniciada para la pieza: " + piezaEnSubasta.getTitulo());
        System.out.println("Valor inicial: " + piezaEnSubasta.getValor_inicial());    
}
}
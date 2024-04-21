package proyecto;
import java.util.HashMap;
import java.util.Map;

	public class Operador extends Usuario{
	private int id_operador;
	private String nombre_operador;
	private String permisos;
	private Map<Integer, Subasta> subastasActivas;
	

	public Operador(int id_operador, String nombre_operador, String permisos, Map<Integer, Subasta> subastasActivas, String login, String password) {
	    this.id_operador = id_operador;
	    this.nombre_operador = nombre_operador;
	    this.permisos = permisos;
	    this.subastasActivas = subastasActivas;
	}
	public int getId_operador() {
		return id_operador;
	}


	public void setId_operador(int id_operador) {
		this.id_operador = id_operador;
	}


	public String getPermisos() {
		return permisos;
	}


	public void setPermisos(String permisos) {
		this.permisos = permisos;
	}


	public Map<Integer, Subasta> getSubastasActivas() {
		return subastasActivas;
	}


	public void setSubastasActivas(Map<Integer, Subasta> subastasActivas) {
		this.subastasActivas = subastasActivas;
	}


	public Operador(int id, String nombre, String permisos) {
        this.id_operador = id;
        this.nombre_operador = nombre;
        this.permisos = permisos;
        this.subastasActivas = new HashMap<>();
        
       
}
	
	
	public String getNombre_operador() {
		return nombre_operador;
	}


	public void setNombre_operador(String nombre_operador) {
		this.nombre_operador = nombre_operador;
	}

    public void piezaSubasta(Pieza pieza) {
        if (!subastasActivas.containsKey(pieza.getId_pieza())) {
            Subasta nuevaSubasta = new Subasta();
            nuevaSubasta.setPiezaEnSubasta(pieza);
            subastasActivas.put(pieza.getId_pieza(), nuevaSubasta);
            System.out.println("La pieza se ha añadido a subasta.");
        } else {
            System.out.println("La pieza ya está en subasta.");
        }
    }

    public void registrarOferta(Pieza pieza, double oferta, Comprador comprador) {
        if (!subastasActivas.containsKey(pieza.getId_pieza())) {
            System.out.println("La pieza no está en subasta.");
            return;
        }

        Subasta subastaActual = subastasActivas.get(pieza.getId_pieza());
        subastaActual.registrarOferta(oferta, comprador);
        System.out.println("Oferta registrada por " + comprador.getNombre_comprador() + ": " + oferta + " para la pieza con ID: " + pieza.getId_pieza());
    }
}
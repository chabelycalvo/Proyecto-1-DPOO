package Usuario;

public abstract class Usuario {
    protected String id;
    protected String nombre;
    protected String contacto; // Esto podría expandirse a más detalles como teléfono, email, etc.

    public Usuario(String id, String nombre, String contacto) {
        this.id = id;
        this.nombre = nombre;
        this.contacto = contacto;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getContacto() {
        return contacto;
    }

    // Método abstracto que podría implementarse en subclases si se requiere algún comportamiento específico
    public abstract void mostrarDetalles();
}
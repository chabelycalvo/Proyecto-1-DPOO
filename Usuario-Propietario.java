package Usuario;

public class Propietario extends Usuario {
    public Propietario(String id, String nombre, String contacto) {
        super(id, nombre, contacto);
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Propietario: " + nombre + " - Contacto: " + contacto);
    }

    // Métodos específicos para propietarios pueden ser añadidos aquí
}

public class Comprador extends Usuario {
    private double limiteCredito;

    public Comprador(String id, String nombre, String contacto, double limiteCredito) {
        super(id, nombre, contacto);
        this.limiteCredito = limiteCredito;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Comprador: " + nombre + " - Contacto: " + contacto + " - Límite de crédito: " + limiteCredito);
    }

    // Métodos específicos para compradores pueden ser añadidos aquí
}

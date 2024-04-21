package Usuario;

public abstract class Empleado extends Usuario {
    protected String departamento;

    public Empleado(String id, String nombre, String contacto, String departamento) {
        super(id, nombre, contacto);
        this.departamento = departamento;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Empleado: " + nombre + " - Departamento: " + departamento);
    }
}

public class Administrador extends Empleado {
    public Administrador(String id, String nombre, String contacto, String departamento) {
        super(id, nombre, contacto, departamento);
    }

    // Métodos específicos para administradores
}

public class Operador extends Empleado {
    public Operador(String id, String nombre, String contacto, String departamento) {
        super(id, nombre, contacto, departamento);
    }

    // Métodos específicos para operadores
}

public class Cajero extends Empleado {
    public Cajero(String id, String nombre, String contacto, String departamento) {
        super(id, nombre, contacto, departamento);
    }

    // Métodos específicos para cajeros
}

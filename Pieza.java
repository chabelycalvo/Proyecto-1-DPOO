package proyecto;

public abstract class Pieza {
    protected String titulo;
    protected int ano;
    protected String lugar_creacion;
    protected String id_pieza;
    protected boolean disponible_valor_fijo;
    protected boolean pieza_bloqueada;
    protected boolean pieza_vendida;
    protected double valor_minimo;
    protected double valor_inicial;
    protected String ubicacion;
    
    // Métodos getters y setters
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getLugar_creacion() {
        return lugar_creacion;
    }

    public void setLugar_creacion(String lugar_creacion) {
        this.lugar_creacion = lugar_creacion;
    }

    public String getId_pieza() {
        return id_pieza;
    }

    public void setId_pieza(String id_pieza) {
        this.id_pieza = id_pieza;
    }

    public boolean isDisponible_valor_fijo() {
        return disponible_valor_fijo;
    }

    public void setDisponible_valor_fijo(boolean disponible_valor_fijo) {
        this.disponible_valor_fijo = disponible_valor_fijo;
    }

    public boolean isPieza_bloqueada() {
        return pieza_bloqueada;
    }

    public void setPieza_bloqueada(boolean pieza_bloqueada) {
        this.pieza_bloqueada = pieza_bloqueada;
    }

    public boolean isPieza_vendida() {
        return pieza_vendida;
    }

    public void setPieza_vendida(boolean pieza_vendida) {
        this.pieza_vendida = pieza_vendida;
    }

    public double getValor_minimo() {
        return valor_minimo;
    }

    public void setValor_minimo(double valor_minimo) {
        this.valor_minimo = valor_minimo;
    }

    public double getValor_inicial() {
        return valor_inicial;
    }

    public void setValor_inicial(double valor_inicial) {
        
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    
    // Métodos adicionales
    
    public void bloquearPieza() {
        if (disponible_valor_fijo && !pieza_bloqueada && !pieza_vendida) {
            pieza_bloqueada = true;
            System.out.println("Pieza bloqueada exitosamente.");
        } else {
            System.out.println("La pieza no puede ser bloqueada en este momento.");
        }
    }

    public void desbloquearPieza() {
        if (pieza_bloqueada) {
            pieza_bloqueada = false;
            System.out.println("Pieza desbloqueada exitosamente.");
        } else {
            System.out.println("La pieza no está bloqueada.");
        }
    }

    public void marcarComoVendida() {
        if (disponible_valor_fijo && !pieza_vendida && !pieza_bloqueada) {
            pieza_vendida = true;
            disponible_valor_fijo = false;
            System.out.println("Pieza vendida exitosamente.");
        } else {
            System.out.println("La pieza no puede ser vendida en este momento.");
        }
    }

    public void actualizarDisponibilidad(boolean disponible) {
        this.disponible_valor_fijo = disponible;
        if (!disponible) {
            pieza_bloqueada = false;
            pieza_vendida = false;
        }
    }
}


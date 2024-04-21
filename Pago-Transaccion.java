package Pagos;

import java.util.Date;

public class Transaccion {
    private String idTransaccion;
    private String idPieza;
    private String idComprador;
    private double precio;
    private Date fecha;

    public Transaccion(String idTransaccion, String idPieza, String idComprador, double precio, Date fecha) {
        this.idTransaccion = idTransaccion;
        this.idPieza = idPieza;
        this.idComprador = idComprador;
        this.precio = precio;
        this.fecha = fecha;
    }

    public String getIdTransaccion() {
        return idTransaccion;
    }

    public String getIdPieza() {
        return idPieza;
    }

    public String getIdComprador() {
        return idComprador;
    }

    public double getPrecio() {
        return precio;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setIdTransaccion(String idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    public void setIdPieza(String idPieza) {
        this.idPieza = idPieza;
    }

    public void setIdComprador(String idComprador) {
        this.idComprador = idComprador;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Transacción ID: " + idTransaccion +
                "\nPieza ID: " + idPieza +
                "\nComprador ID: " + idComprador +
                "\nPrecio: $" + precio +
                "\nFecha: " + fecha.toString();
    }
}
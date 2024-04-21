package Pagos;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Subasta {
    private String idSubasta;
    private Date fechaInicio;
    private Map<String, Double> ofertas; // Mapa de ID de pieza a oferta actual
    private Map<String, String> compradores; // Mapa de ID de pieza a ID de comprador

    public Subasta(String idSubasta, Date fechaInicio) {
        this.idSubasta = idSubasta;
        this.fechaInicio = fechaInicio;
        this.ofertas = new HashMap<>();
        this.compradores = new HashMap<>();
    }

    public void registrarOferta(String idPieza, String idComprador, double oferta) {
        Double ofertaActual = ofertas.get(idPieza);
        if (ofertaActual == null || oferta > ofertaActual) {
            ofertas.put(idPieza, oferta);
            compradores.put(idPieza, idComprador);
        }
    }

    public double getOfertaActual(String idPieza) {
        return ofertas.getOrDefault(idPieza, 0.0);
    }

    public String getCompradorActual(String idPieza) {
        return compradores.get(idPieza);
    }

    public Map<String, Double> getOfertas() {
        return new HashMap<>(ofertas);
    }

    public Map<String, String> getCompradores() {
        return new HashMap<>(compradores);
    }
}
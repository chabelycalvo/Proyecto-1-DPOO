package Pagos;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private List<Pieza> piezas;

    public Inventario() {
        this.piezas = new ArrayList<>();
    }

    public void agregarPieza(Pieza pieza) {
        piezas.add(pieza);
    }

    public boolean eliminarPieza(String idPieza) {
        return piezas.removeIf(p -> p.getId().equals(idPieza));
    }

    public Pieza buscarPieza(String idPieza) {
        for (Pieza p : piezas) {
            if (p.getId().equals(idPieza)) {
                return p;
            }
        }
        return null;
    }

    public List<Pieza> getPiezas() {
        return new ArrayList<>(piezas); // Devuelve una copia para proteger la integridad del inventario
    }
}

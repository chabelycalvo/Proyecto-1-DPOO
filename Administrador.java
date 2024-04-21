package proyecto;

public class Administrador extends Usuario {

    public boolean permiso_ingrezo_pieza;
    private boolean confirmacion_ventas;
    private boolean devolucion_pieza;

    public void verificarComprador(Comprador comprador) {
        if (!comprador.isVerificado()) {
            comprador.setVerificado(true);
            System.out.println("Comprador " + comprador.getNombre_comprador() + " verificado exitosamente.");
        } else {
            System.out.println("El comprador ya está verificado.");
        }
    }

    public void actualizarSubasta(Subasta subasta, String fechaInicio, String fechaFin, double valorInicial) {
        subasta.setFecha_hora_inicio(fechaInicio);
        subasta.setFecha_hora_fin(fechaFin);
        subasta.getPiezaEnSubasta().setValor_inicial(valorInicial); // Asignamos el valor inicial a la pieza en la subasta
        System.out.println("Subasta actualizada.");
   
    }
    public void confirmarVenta(Pieza pieza, Comprador comprador) {
        if (comprador.isVerificado() && !pieza.isPieza_vendida() && confirmacion_ventas) {
            pieza.setPieza_vendida(true);
            System.out.println("Venta de la pieza " + pieza.getTitulo() + " confirmada.");
        } else {
            System.out.println("No se puede confirmar la venta en este momento.");
        }
    }
    public void procesarDevolucion(Pieza pieza) {
        if (pieza.isPieza_vendida()) {
            if (devolucion_pieza) {
                pieza.setPieza_vendida(false);
                System.out.println("Devolución de la pieza " + pieza.getTitulo() + " procesada con éxito.");
            } else {
                System.out.println("Devolución de piezas no permitida actualmente.");
            }
        } else {
            System.out.println("La pieza no ha sido vendida, no se puede procesar la devolución.");
        }
    }

    public void bloquearPieza(Pieza pieza) {
        pieza.setPieza_bloqueada(true);
        System.out.println("Pieza " + pieza.getId_pieza() + " bloqueada.");
    }

    public void desbloquearPieza(Pieza pieza) {
        pieza.setPieza_bloqueada(false);
        System.out.println("Pieza " + pieza.getId_pieza() + " desbloqueada.");
    }
}
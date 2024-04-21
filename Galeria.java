package Sistema1;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Galeria {
    public Date FechaFinConsignacion;
    public String ModalidadAdquisicion;
    public HashMap<Integer,ArrayList<Object>> HistorialPiezas;
	public Galeria(Date FechaFinConsignacion, String ModalidadAdquisicion,
			HashMap<Integer, ArrayList> HistorialPiezas) {
		super();
		FechaFinConsignacion = FechaFinConsignacion;
		ModalidadAdquisicion = ModalidadAdquisicion;
		HistorialPiezas = HistorialPiezas;
	}
	public Date getFechaFinConsignacion() {
		return FechaFinConsignacion;
	}
	public void setFechaFinConsignacion(Date fechaFinConsignacion) {
		FechaFinConsignacion = fechaFinConsignacion;
	}
	public String getModalidadAdquisicion() {
		return ModalidadAdquisicion;
	}
	public void setModalidadAdquisicion(String modalidadAdquisicion) {
		ModalidadAdquisicion = modalidadAdquisicion;
	}
	public HashMap<Integer, ArrayList<Object>> getHistorialPiezas() {
		return HistorialPiezas;
	}
	public void setHistorialPiezas(HashMap<Integer, ArrayList<Object>> HistorialPiezas) {
		this.HistorialPiezas = HistorialPiezas;
	}
        
    public static ArrayList<Object> descomponerPieza(Pieza pieza) {
        ArrayList<Object> piezaEnLista = new ArrayList<>();
        Class<?> clasePieza = pieza.getClass(); // Obtiene la clase de la instancia de Pieza

        try {
            Field[] campos = clasePieza.getDeclaredFields(); // Obtiene todos los campos de la clase Pieza
            for (Field campo : campos) {
                campo.setAccessible(true); // Hace accesible el campo, incluso si es privado
                Object valor = campo.get(pieza); // Obtiene el valor del campo para esta instancia de Pieza
                piezaEnLista.add(valor); // Lo agrega al ArrayList
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return piezaEnLista;
    }
    public void RegistrarPieza(Pieza pieza) {
        try {
            if (!HistorialPiezas.containsKey(pieza.getIDPieza())) {
                HistorialPiezas.put(pieza.getIDPieza(), Galeria.descomponerPieza(pieza));
            } else {
                throw new IllegalArgumentException("Esta Pieza ya está registrada");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error al registrar la pieza: " + e.getMessage());
         
        }
    }

            	
	}
	


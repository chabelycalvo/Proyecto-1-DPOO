package Pagos;

import java.io.;

public class GestorDeDatos {
    
    // Método para guardar cualquier objeto en un archivo
    public static void guardarObjeto(Object objeto, String nombreArchivo) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(nombreArchivo))) {
            out.writeObject(objeto);
        } catch (IOException e) {
            System.err.println("Error al guardar el objeto: " + e.getMessage());
        }
    }

    // Método para cargar cualquier objeto desde un archivo
    public static Object cargarObjeto(String nombreArchivo) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(nombreArchivo))) {
            return in.readObject();
        } catch (FileNotFoundException e) {
            System.err.println("Archivo no encontrado: " + e.getMessage());
            return null;
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
            return null;
        } catch (ClassNotFoundException e) {
            System.err.println("Clase no encontrada: " + e.getMessage());
            return null;
        }
    }
}
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Archivos {

    public static void guardarArregloDeEstudiantes(ArrayList<Estudiante> estudiantes, String nombreArchivo) {
        try {
            FileOutputStream fileOut = new FileOutputStream(nombreArchivo);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(estudiantes);
            out.close();
            fileOut.close();
            System.out.println("Arreglo de estudiantes guardado como: " + nombreArchivo);
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    public static List<Estudiante> leerArchivo(String nombre) throws IOException, ClassNotFoundException {
        List<Estudiante> objetosLeidos = new ArrayList<>();

        try {
            FileInputStream archivo = new FileInputStream(nombre);
            ObjectInputStream lectura = new ObjectInputStream(archivo);

            while (true) {
                Estudiante objeto = (Estudiante) lectura.readObject();
                objetosLeidos.add(objeto);
            }

        } catch(EOFException exception) {
            exception.printStackTrace(System.out);
        } catch (IOException error) {
            error.printStackTrace(System.out);
        }
        return objetosLeidos;
    }


}

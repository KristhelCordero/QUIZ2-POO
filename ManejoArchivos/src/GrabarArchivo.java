
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class GrabarArchivo {

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

    public static List<Object> leerArchivo(String nombre) throws IOException, ClassNotFoundException {
        List<Object> objetosLeidos = new ArrayList<>();

        try (FileInputStream archivo = new FileInputStream(nombre);
             ObjectInputStream lectura = new ObjectInputStream(archivo)) {

            while (true) {
                Object objeto = lectura.readObject();
                objetosLeidos.add(objeto);
            }

        } catch(EOFException exception) {
            exception.printStackTrace(System.out);
        } catch (IOException error) {
            error.printStackTrace(System.out);
        }
        return objetosLeidos;
    }

    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("pepe",23);

        Estudiante estudiante2 = new Estudiante("pepe",23);

        Estudiante estudiante3 = new Estudiante("pepe",23);

        String nombreArchivo = "ArregloEstudiantes:3";
        ArrayList<Estudiante> listaEstudiantes = new ArrayList<>(Arrays.asList(estudiante1,estudiante2,estudiante3));

        guardarArregloDeEstudiantes(listaEstudiantes, nombreArchivo);
    }
}
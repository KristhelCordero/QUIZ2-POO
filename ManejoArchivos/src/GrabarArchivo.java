
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;


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

    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("pepe",23);

        Estudiante estudiante2 = new Estudiante("pepe",23);

        Estudiante estudiante3 = new Estudiante("pepe",23);

        String nombreArchivo = "ArregloEstudiantes:3";
        ArrayList<Estudiante> listaEstudiantes = new ArrayList<>(Arrays.asList(estudiante1,estudiante2,estudiante3));

        guardarArregloDeEstudiantes(listaEstudiantes, nombreArchivo);
    }
}
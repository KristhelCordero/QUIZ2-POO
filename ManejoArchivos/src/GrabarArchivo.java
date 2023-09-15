
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.List;




public class GrabarArchivo {

    public static void guardarArregloDeEstudiantes(List<Estudiante> estudiantes, String nombreArchivo) {
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
        Estudiante objeto = new Estudiante(42, "Hola, mundo!");
        String nombreArchivo = "objeto.ser";

        guardarObjetoSerializado(objeto, nombreArchivo);
    }
}
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Archivos {

    public static List<Estudiante> leerArchivo(String nombre) throws IOException, ClassNotFoundException {
        List<Estudiante> objetosLeidos = new ArrayList<>();

        try (FileInputStream archivo = new FileInputStream(nombre);
             ObjectInputStream lectura = new ObjectInputStream(archivo)) {

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

import java.io.*;

public class Archivos {

    public void leerArchivoB(String nombre){
        Estudiante estudiante;
        try {
            FileInputStream archivo = new FileInputStream(nombre);
            ObjectInputStream objetoLeido = new ObjectInputStream(archivo);

            while (true)



        } catch (IOException error) {
            error.printStackTrace(System.out);
        }
    }
}

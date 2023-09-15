import java.io.*;

public class Archivos {

    public void leerArchivoB(String nombre) throws ClassNotFoundException{
        Estudiante estudiante;
        try {
            FileInputStream archivo = new FileInputStream(nombre);
            ObjectInputStream lectura = new ObjectInputStream(archivo);

            while (true){
                estudiante = (Estudiante) lectura.readObject();
                estudiante.toString();
            }

        } catch(EOFException exception) {
            return;
        } catch (IOException error) {
            error.printStackTrace(System.out);
        }
    }
}

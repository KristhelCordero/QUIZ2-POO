import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ManejarArchivos {
    public static void main(String[] args) throws Exception {
        Estudiante estudiante1 = new Estudiante("pepe",23);

        Estudiante estudiante2 = new Estudiante("pepe",23);

        Estudiante estudiante3 = new Estudiante("pepe",23);
        
        List<Estudiante> arregloEstudiantes = new ArrayList<>();
        String nombreArchivo = "ArregloEstudiantes:3";
        ArrayList<Estudiante> listaEstudiantes = new ArrayList<>(Arrays.asList(estudiante1,estudiante2,estudiante3));

        Archivos.guardarArregloDeEstudiantes(listaEstudiantes, nombreArchivo);

        arregloEstudiantes=Archivos.leerArchivo(nombreArchivo);

        for (Estudiante estudiante:arregloEstudiantes){
            estudiante.toString();
        }
    }
}

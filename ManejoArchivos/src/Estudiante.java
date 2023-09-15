public class Estudiante {
    String nombre;
    int carnet;

    public Estudiante(){

    }
    public Estudiante(String pNombre, int pCarnet){
        nombre=pNombre;
        carnet=pCarnet;
    }
        public String toString(){
        return "Nombre: "+nombre+"\nCarnet: "+carnet;
    }
}

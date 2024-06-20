public class Estudiante extends Persona {
    private String matricula;  
    public String carrera;
    
    public Estudiante(String nombre, int edad, String matricula, String carrera) {
        super(nombre, edad);
        this.matricula = matricula;
        this.carrera = carrera;
    }
    
    public void estudiar() {
        System.out.println("La estudiante " + nombre + " está estudiando.");
    }
}


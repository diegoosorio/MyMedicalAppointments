// Clases:
public class Doctor {
    // Atributos:
    int id;
    String name;
    String speciality;

    // Método Constructor:
    Doctor(/* parámetros */) {
        // Instrucciones que se ejecutan al crear/instanciar
        // un nuevo objeto con la clase Doctor...
        System.out.println("Construyendo el objeto doctor");
    }

    Doctor(String name){
        System.out.println("El nombre del doctor es: " + name);
    }

    // Comportamientos (métodos):
    public void showName() {
        // Instrucciones...
        System.out.println(name);
    }
}
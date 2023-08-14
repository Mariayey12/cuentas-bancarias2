package cuentaC;

public class Persona {
    private String nombre;
    private int edad;
    private String identificacion;

    public Persona(String nombre,int edad,String identificacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.identificacion=identificacion;
    }
    // Getters y setters
    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public String getIdentificacion() {
        return identificacion;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEdad(int edad) {
        this.edad = edad;
        if (edad >= 0) {
            this.edad = edad;
        } else {
            System.out.println("La edad no puede ser negativa.");
        }
    }
    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    // Método para mostrar los datos de la persona

    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Identificación: " + identificacion);
    }
    
    // Método para verificar si es mayor de edad
    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

}
//Clase Persona y Clase Cuenta:
//Relación: Asociación
//Descripción: Cada objeto de la clase Cuenta está asociado con un objeto de la clase Persona que es el titular de esa cuenta.
//Tipo de Relación: Asociación
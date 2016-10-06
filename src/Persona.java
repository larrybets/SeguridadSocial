/**
 * Created by DAM on 21/9/16.
 */
public class Persona {


    // SS ES NUMERO DE SEGURIDAD SOCIAL
    private String Dni;
    private String ss;
    private String nombre;
    private String apellidos;
    private int edad;
    private double salario;

    public Persona(String Dni,String ss,String nombre,String apellidos, int edad, double salario){
        this.Dni = Dni;
        this.ss = ss;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.salario = salario;
    }

    public String getDNI() {
        return Dni;
    }

    public void setDNI(String DNI) {
        this.Dni = DNI;
    }

    public String getSs() {
        return ss;
    }

    public void setSs(String ss) {
        this.ss = ss;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
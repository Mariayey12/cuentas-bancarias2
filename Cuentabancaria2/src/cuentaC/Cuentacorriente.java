package cuentaC;
import java.util.Random;
public class Cuentacorriente {
    private  Persona  titular;
    private double  saldoDeCuenta;

    private long  numeroDeCuenta;

    private CCC cuentas;

    public Cuentacorriente( Persona titular,double saldoDeCuenta, long numeroDeCuenta ) {

        this.titular=titular;
        this.saldoDeCuenta = saldoDeCuenta;
        this.numeroDeCuenta = numeroDeCuenta;

    }

    //Metodo que me genera numero de cuenta
    public long getNumeroDeCuenta() {
        return numeroDeCuenta;
    }
    //Metodo que permitira asignar un número de cuenta corriente, de tipo long, de forma aleatoria

    private long generarNumeroDeCuenta() {
        Random random = new Random();
        long numeroGenerado = random.nextLong();

        if (numeroGenerado < - 0) {
            System.out.println("Número negativo generado. No se creará la cuenta.");
            return -1;  // Retorna un valor negativo para indicar que no se debe crear la cuenta.
        } else {
            return Math.abs(numeroGenerado);
        }
    }

    //Método setIngreso:
    //Este método recibe un valor llamado ingreso como parámetro.
    // Lo primero que hace es verificar si ingreso es mayor que cero, lo cual es necesario para realizar un ingreso válido.
    // Si ingreso es mayor que cero, aumenta el saldo de la cuenta (saldoDeCuenta) sumando el valor de ingreso.
    // Luego, muestra un mensaje indicando que se ha realizado un ingreso a la cuenta con la cantidad específica.
    //Si ingreso no es mayor que cero, muestra un mensaje de error informando que el ingreso debe ser mayor que cero.
    public void setIngreso(double ingreso) {
        if (ingreso > 0) {
            saldoDeCuenta += ingreso;
            System.out.println("Se ha ingresado " + ingreso + " a la cuenta.");
        } else {
            System.out.println("El ingreso debe ser mayor que cero.");
        }
    }

  //Método setReintegro:
  //Similar al método anterior, este método recibe un valor llamado reintegro como parámetro.
  // Al igual que antes, verifica si reintegro es mayor que cero. Si es mayor que cero,
  // verifica si el saldo actual de la cuenta (saldoDeCuenta) es suficiente para realizar el reintegro.
  // Si es suficiente, resta el valor de reintegro al saldo de la cuenta.
  // Si no es suficiente, muestra un mensaje indicando que los fondos son insuficientes.
  //Si reintegro no es mayor que cero, muestra un mensaje de error informando que el reintegro debe ser mayor que cero.
    public void setReintegro(double reintegro) {
        if (reintegro > 0) {
            if (saldoDeCuenta >= reintegro) {
                saldoDeCuenta -= reintegro;
                System.out.println("Se ha realizado un reintegro de " + reintegro + " de la cuenta.");
            } else {
                System.out.println("Fondos insuficientes.");
            }
        } else {
            System.out.println("El reintegro debe ser mayor que cero.");
        }
    }
//Metodo Get  para obtener el Saldo de la Cuenta corriente
    public double getSaldoCuenta() {
        return saldoDeCuenta;
    }
    // Otros métodos y propiedades de Cuenta Bancaria de tipo Persona
    public Persona getTitular() {
        return titular;
    }
//Metodo que permite obtener los datos generales
    public String getDatosCuenta() {
        return
                "\nNúmero de cuenta: " + numeroDeCuenta +
                "\nSaldo: " + saldoDeCuenta;
    }
    public CCC getCuentas() {
        return cuentas;
    }

    public void setCuentas(CCC cuentas) {
        this.cuentas = cuentas;
    }
}

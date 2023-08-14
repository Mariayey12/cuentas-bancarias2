package cuentaC;
import java.util.ArrayList;
import java.util.List;
public class CCC {

    private   List<Cuentacorriente> cuentas;

    public CCC() {
        cuentas = new ArrayList<>();
    }
//Se agrega cada cuenta al objeto ccc usando el método agregarCuenta.
    //Este método, agregarCuenta, es utilizado para añadir una instancia de Cuentacorriente
// a la lista de cuentas en un objeto de la clase CCC.
    //cuenta: Es el parámetro del método y representa la instancia de Cuentacorriente que deseas agregar a la lista.
//cuentas: Es el atributo privado de la clase CCC que almacena la lista de cuentas.
// Fue inicializado en el constructor con una nueva instancia de ArrayList.
//Lo que hace el método agregarCuenta es simplemente agregar la instancia de Cuentacorriente
// que se pasó como parámetro a la lista de cuentas (cuentas).
// Esto permite que el objeto CCC mantenga un registro de las cuentas que contiene.
//Supongamos que tienes un objeto de la clase CCC llamado ccc y
// tienes una instancia de Cuentacorriente llamada cuenta1.
// Puedes usar el método agregarCuenta para agregar la cuenta al objeto ccc:
    //De esta manera, la cuenta1 se añadirá a la lista de cuentas en el objeto ccc,
// lo que te permitirá gestionar múltiples cuentas dentro del objeto ccc.
    public void agregarCuenta(Cuentacorriente cuenta) {
        cuentas.add(cuenta);
    }

   //Se realiza una transferencia de dinero entre las cuentas
   // usando el método realizarTransferencia.
    public void realizarTransferencia(Cuentacorriente origen, Cuentacorriente destino, double monto) {
        if (cuentas.contains(origen) && cuentas.contains(destino)) {
            if (origen.getSaldoCuenta() >= monto) {
                origen.setReintegro(monto);
                destino.setIngreso(monto);
                System.out.println("Transferencia realizada con éxito.");
            } else {
                System.out.println("Saldo insuficiente en la cuenta de origen.");
            }
        } else {
            System.out.println("Una o ambas cuentas no son válidas en CCC.");
        }
    }
    //Se realizan operaciones de ingreso y reintegro en las cuentas// utilizando los métodos setIngreso y setReintegro
//Este método recibe como parámetros un objeto de tipo Cuentacorriente (equivalente a Cuenta)
// y un valor monto que representa el monto a ingresar en la cuenta.
// Primero, verifica si la lista cuentas de la clase CCC contiene la cuenta proporcionada.
// Si la cuenta está en la lista, llama al método setIngreso de la cuenta, pasando el monto como parámetro.
// Esto permite realizar el ingreso en la cuenta específica.
//Si la cuenta no se encuentra en la lista, muestra un mensaje indicando que la cuenta no es válida en el contexto de CCC
    public void setIngreso(Cuentacorriente cuenta, double monto) {
        if (cuentas.contains(cuenta)) {
            cuenta.setIngreso(monto);
        } else {
            System.out.println("La cuenta no es válida en CCC.");
        }
    }
//Método setReintegro en la clase CCC:
//Similar al método anterior, este método también recibe un objeto de tipo Cuentacorriente y un valor monto como parámetros.
// Verifica si la cuenta proporcionada está en la lista de cuentas.
// Si la cuenta es válida, llama al método setReintegro de la cuenta para realizar el reintegro del monto especificado.
//Si la cuenta no es válida, muestra un mensaje similar indicando que la cuenta no es válida en el contexto de CCC.
    public void setReintegro(Cuentacorriente cuenta, double monto) {
        if (cuentas.contains(cuenta)) {
            cuenta.setReintegro(monto);
        } else {
            System.out.println("La cuenta no es válida en CCC.");
        }
    }


}
//Clase CCC y Clase Cuenta:
//Relación: Composición
//Descripción: La clase CCC contiene y
// gestiona una lista de objetos de la clase Cuenta.
// La existencia de las cuentas está directamente relacionada con la existencia del objeto CCC.
//Tipo de Relación: Composición
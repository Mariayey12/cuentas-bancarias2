/* Crear una clase que permita crear cuentas bancarias. La clase ha de tener los siguientes
requisitos:
• Nombre: Cuenta.
• Tendrá las siguientes propiedades:
§ saldoDeCuenta,	de	tipo double.
§ nombreDelTitular,	de	tipo String.
§ numeroDeCuenta,	de	tipo long.
• Constructor de la clase con dos parámetros:
§ nombreDelTitular,	de	tipo String.
§ saldoDeCuenta,	de	tipo double.
• Métodos de la clase:
§ Se	crearán	dos setters,	uno	para	hacer ingresos (setIngreso)	y	otro	para
hacer reintegros (setReintegro).	Se	crearán	en	un	objeto	de	tipo CCC.
§ Se	crearán	dos getters,	uno	permitirá obtener el saldo (getSaldoCuenta)	de	la
cuenta	corriente	y	el	otro obtendrá los datos generales (getDatosCuenta)	de
una Cuenta .
El constructor de la clase Cuenta será el encargado de establecer:
• Un nombre para el titular de la cuenta corriente
• Un saldo inicial para la cuenta corriente.
• Asignará un número de cuenta corriente, de tipo long, de forma aleatoria.
Luego se necesita crear la siguiente clase con su relación respectiva.
• Nombre: Banco.
• Tendrá las siguientes propiedades:
§ cuenta1,	de	tipo Cuenta.
§ cuenta2,	de	tipo Cuenta.
• Constructor de la clase con dos parámetros (cuenta1, cuenta2):
• Métodos de la clase:
§ Se	creará	un método (RealizarTransferencia Entre Cuentas) para permitir	realizar
transferencias	de	dinero	de	una	cuenta	a	otra	(de	una Cuenta a	otra),	por	lo	tanto
debe	de	recibir
§ Se	creará	un método (ImprimirNumeroCuentas) el	cual	debe	de	imprimir	el	numero
de	la	cuenta1	y cuenta2.	*/

package cuentaC;


import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();//Metodo que me permite carga numero  aleatorio en la creacion de la cuenta corriente
        // Crear persona
        Persona persona1 = new Persona("Juan Pérez", 25, "123456789");
        Persona persona2 = new Persona("Maria Juarez", 35, "10202233");
        //Se crean dos objetos de tipo Cuentacorriente (equivalente a Cuenta)
        // llamados cuenta1 y cuenta2
        // Mostrar los datos de la cuenta1
        System.out.println("\nDatos de la cuenta1:");
        Cuentacorriente cuenta1 = new Cuentacorriente(persona1,999.0, random.nextLong());
        System.out.println("Cuenta Corriente" + cuenta1.getDatosCuenta());
        // Mostrar los datos de la persona y la cuenta
        persona1.mostrar();
        System.out.println("\nDatos de la cuenta2:");
        Cuentacorriente cuenta2 = new Cuentacorriente(persona2,98098569.0, random.nextLong());
        // Mostrar Datos de la Cuenta
        System.out.println("Cuenta Corriente" + cuenta2.getDatosCuenta());
        persona2.mostrar();

        //Se crea un objeto CCC llamado ccc.
        CCC ccc = new CCC();

       // Se agrega cada cuenta al objeto ccc usando el método agregarCuenta.Mando a invocarla
        System.out.println("\nDatos para agregar la cuenta1:");
        ccc.agregarCuenta(cuenta1);
        ccc.agregarCuenta(cuenta2);
        ccc.setIngreso(cuenta1, 500.0);//cuenta1
        ccc.setReintegro(cuenta1, 200.0);//cuenta1
        ccc.realizarTransferencia(cuenta1, cuenta2, 200.0);
        System.out.println("Saldo de cuenta1 después de operaciones: " + cuenta1.getSaldoCuenta());
        System.out.println("\nDatos para agregar la cuenta2:");
        ccc.setIngreso(cuenta2, 500.0);//cuenta2
        ccc.setReintegro(cuenta2, 200.0);//cuenta2
        ccc.realizarTransferencia(cuenta2, cuenta1, 200.0);
        //Se imprime el saldo de las cuentas después de las operaciones.
        System.out.println("Saldo de cuenta2 después de operaciones: " + cuenta2.getSaldoCuenta());

        Banco banco = new Banco(cuenta1, cuenta2);
        banco.imprimirNumeroCuentas();
    }




}

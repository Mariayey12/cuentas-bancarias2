package cuentaC;

public class Banco {
    private Cuentacorriente cuenta1;
    private Cuentacorriente cuenta2;
    public Banco(Cuentacorriente cuenta1, Cuentacorriente cuenta2) {
        this.cuenta1 = cuenta1;
        this.cuenta2 = cuenta2;
    }
    public void imprimirNumeroCuentas() {
        System.out.println("Número de cuenta de cuenta1: " + cuenta1.getNumeroDeCuenta());
        System.out.println("Número de cuenta de cuenta2: " + cuenta2.getNumeroDeCuenta());
    }
}

//Clase Banco:
//Esta clase representa un banco y tiene dos atributos privados cuenta1 y cuenta2, que son instancias de la clase Cuentacorriente
// (o Cuenta según la equivalencia que hayas establecido).
//El constructor Banco recibe dos parámetros: cuenta1 y cuenta2.
// Cuando creas un objeto de la clase Banco, debes pasar dos instancias de cuentas de corriente para asociarlas con ese banco en particular.
//Método imprimirNumeroCuentas:

//Este método no recibe parámetros y simplemente se encarga de imprimir los números de cuenta de las cuentas asociadas al banco (cuenta1 y cuenta2).
//Utiliza los métodos getNumeroDeCuenta de las instancias de Cuentacorriente para obtener y mostrar los números de cuenta.


//Clase Banco y Clase Cuenta:
//Relación: Agregación
//Descripción: La clase Banco tiene referencias a objetos de la clase Cuenta.
// Las cuentas existen independientemente del objeto Banco, pero el objeto Banco las contiene y las gestiona.
//Tipo de Relación: Agregación
public class cuentaBancaria {
    private int numeroCuenta;
    private double saldo;
    private String tipoCuenta;


    public cuentaBancaria() {
        tipoCuenta = "Ahorro";
    }

    public cuentaBancaria(int numeroCuenta, String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
        this.numeroCuenta = numeroCuenta;
    }

    public cuentaBancaria(int numeroCuenta, double saldo, String tipoCuenta) {
        this(numeroCuenta, tipoCuenta);
        this.saldo = saldo;


    }


    public void mostrarDetalles(){
        System.out.println("Usuario: "+numeroCuenta+" Tipo de Cuenta: "+tipoCuenta+" Saldo Disponible: "+saldo+"");
    }


    //metodo "innecesario" para el ejercicio, pero necesario para lo que pienso hacer.
    public String toString(){
        return "Usuario: "+numeroCuenta+" Tipo de Cuenta: "+tipoCuenta+" Saldo Disponible: "+saldo+"";
    }



}

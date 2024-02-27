package cuentas;

/**
 * Clase sobre una cuenta
 * @author chuco
 */
public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    public CCuenta()
    {
    }
 
    
    
    public String getNombre() {
		return nombre;
	}







	public void setNombre(String nombre) {
		this.nombre = nombre;
	}







	public String getCuenta() {
		return cuenta;
	}







	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}







	public double getSaldo() {
		return saldo;
	}







	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}







	public double getTipoInterés() {
		return tipoInterés;
	}







	public void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}







	public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
	/**
	 * Devuelve el estado de la cuenta
	 * @return saldo en cuenta
	 */

    public double estado()
    {
        return saldo;
    }
    /**
     * Ingresa cantidad en cuenta
     * @param cantidad que se ingresa
     * @throws Exception si es negativa la cantidad
     */

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }
    /**
     * Retira una cantidad de la cuenta
     * @param cantidad que se retira
     * @throws Exception  si la cantidad 0 o inferior
     */

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}

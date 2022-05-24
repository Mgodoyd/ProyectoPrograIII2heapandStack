/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author josec
 */
public class Main2 {

    private String nombre;
    private String apellido;
    private int edad;
    private char sexo;
    private String marca;
    private String modelo;
    private int asientos;
    private String transmision;
    private String motor;
    private double precio;

    public Compra(){
    }

    public Compra(String nombre, int edad, char sexo){
        this.nombre = nombre;
        this.nombre = apellido;
        this.edad = edad;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Auto(){
    }

    public Auto(String marca, String modelo, double precio,int asientos, String transmision, String motor){
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.asientos = asientos;
        this.motor = motor;
        this.transmision = transmision;
        
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getAsientos() {
        return asientos;
    }

    public void setAientos(int asientos) {
        this.asientos = asientos;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getTransmision() {
        return transmision;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }

    public static void main(String[] args) {

        Compra Comprador = new Compra();
        // Datos comprador
        Comprador.setEdad(19);
        Comprador.setNombre("Luis");
        Comprador.setApellido("Rodriguez");
        Comprador.setSexo('M');

        // Datos Vehiculo a comprar
        Auto auto = new Auto();

        auto.setMarca("Honda");
        auto.setModelo("Año 2014");
        auto.setPrecio(55000.00);
        auto.setAientos(5);
        auto.setMotor("1800 cc");
        auto.setTransmision("Automatico");

        System.out.println("Importadora Guatemalteca");
        System.out.println("Orden de Compra");
        System.out.println("Datos Comprador");
        System.out.println("Nombre: " + Comprador.getNombre());
        System.out.println("Apellido: " + Comprador.getApellido());
        System.out.println("Edad: " + Comprador.getEdad() + "  Sexo: " + Comprador.getSexo());
        System.out.println("Datos vehiculo");
        System.out.println("Marca: " + auto.getMarca() + "  Modelo: " + auto.getModelo());
        System.out.println("No. Asientos: " + auto.getAsientos() + "  Motor: " + auto.getMotor() + "  Transmision: "
                + auto.getTransmision());
        System.out.println("Total a cancelar al recibir el vehiculo: " + auto.getPrecio());
    }

}

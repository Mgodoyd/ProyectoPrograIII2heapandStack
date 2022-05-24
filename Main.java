/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author josec
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        private String raza;
        private String nombre;
        private int edad;
        private String nombre;
        private String apellido;
        private int edad;
        private char sexo;
    
        
        public Mascota(){
        }
        
        public Mascota(String raza, String nombre, int edad){
            this.raza = raza;
            this.nombre = nombre;
            this.edad = edad;
            
        }
        
        public String getRaza() {
            return raza;
        }
        public void setRaza(String raza) {
            this.raza = raza;
        }
        public String getNombre() {
            return nombre;
        }
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        public int getEdad() {
            return edad;
        }
        public void setEdad(int edad) {
            this.edad = edad;
        }

        
    
        
        public Adopcion(){
        }
        
        public Adopcion(String nombre, int edad, char sexo){
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
     
        Adopcion persona = new Adopcion();
        // Datos persona que adopta
        persona.setEdad(35);
        persona.setNombre("Mariana");
        persona.setApellido("Lopez");
        persona.setSexo('F');
        
        //Datos mascota a comprar
        Mascota mascota = new Mascota();
        
        mascota.setRaza("Husky Siberiano");
        mascota.setNombre("Zeus");
        mascota.setEdad(3);
    
        System.out.println("Adopcion de perros Huellitas Felices");
        System.out.println("Datos solicitud de adopcion");
        System.out.println("Nombre: "+persona.getNombre());
        System.out.println("Apellido: "+persona.getApellido());
        System.out.println("Edad: "+persona.getEdad()+"  Sexo: "+persona.getSexo());
        System.out.println("Datos Mascota");
        System.out.println("Nombre de tu nueva Mascota: "+mascota.getNombre());
        System.out.println("Tu nueva Mascota es un : "+mascota.getRaza());
        System.out.println("Con una edad de : "+mascota.getEdad()+ " años");
        System.out.println("Gracias por darle un nuevo hogar =)");
    }

}

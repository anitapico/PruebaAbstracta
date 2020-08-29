/*
Diseñe e implemente un algoritmo el cual conste de una clase denominada Motor, 
el cual contenga los siguientes atributos: tipoAlimentacion de tipo cadena, 
tipoCombustible de tipo cadena, potencia de tipo entero, velocidadEncendido de 
tipo entero,  y rmpMaxima de tipo entero, aplicando los métodos de set y get.
Ademas, incluir las clases MotorDiesel y MotorOtto, las cuales son heredadas 
de la clase Motor.
 */
package tareapruebaabstracta;

/**
 *
 * @author Jonathan Aguaiza, Anita Pico
 */


abstract  class Motor
{
    private String tipoAlimentacion;
    private String tipoCombustible;
    private int potencia;
    private int velocidadEncendido;
    private int rpmMaxima;
    
    public Motor(String tipoAlimentacion, String tipoCombustible, int potencia, 
            int velocidadEncendido, int rpmMaxima){
        
        this.tipoAlimentacion = tipoAlimentacion;
        this.tipoCombustible = tipoCombustible;
        this.potencia = potencia;
        this.velocidadEncendido = velocidadEncendido;
        this.rpmMaxima = rpmMaxima;
    } 
    public double EncendeMotor(){
        System.out.println("CARACTERÍSTICAS AL MOMENTO DEL ENCENDIDO DE UN MOTOR");
        return 0.0;
    }
    public void VelocidadEncendido(){
        System.out.println("Encender Motor de tipo de alimentacion "
                + this.tipoAlimentacion + " con su tipo de combustible"
                        + " " + this.tipoCombustible);
    }
    public String toString(){
        return tipoAlimentacion +" " + tipoCombustible +" " + potencia +" "+ velocidadEncendido
                +" "+ rpmMaxima ;
    }       
    public String getTipoAlimentacion(){
        return tipoAlimentacion;
    }        
    public String getTipoCombustible(){
        return tipoCombustible;
    }        
    public int getPotencia(){
        return potencia;
    }
    public int getVelocidadEncendido(){
        return velocidadEncendido;
    }
    public void setVelocidadEncendido(int nuevo){
        velocidadEncendido=nuevo;
    }
    public int getRpmMaxima(){
        return rpmMaxima;
    }
} 
class MotorDiesel extends Motor{
    private double cantidadConsumoDiesel;
    public MotorDiesel(String tipoAlimentacion, String tipoCombustible ,int potencia,
            int velocidadEncendido, int rpmMaxima, double cantidadConsumoDiesel){
        super(tipoAlimentacion,tipoCombustible,potencia,velocidadEncendido,rpmMaxima);
        setCantidadConsumoDiesel(cantidadConsumoDiesel);
    }        
    public void VelocidadEncendido(){
        System.out.println("CARACTERÍSTICAS AL MOMENTO DEL ENCENDIDO DE UN MOTOR DIESEL");
        System.out.println("La velocidad de encendido es de " +getVelocidadEncendido()+" "
                + "segundo al momento de encenderlos: "
                + " con "+getRpmMaxima()+" revoluciones máximas con una potencia de "
                        +getPotencia()+" CV.");
        System.out.println("\nIntegrando los datos de encendido: ");
    }
        public double getCantidadConsumoDiesel(){
            return cantidadConsumoDiesel;
        }        
        public void setCantidadConsumoDiesel(double nuevo){
        if(nuevo >= 3.0)
            cantidadConsumoDiesel=nuevo;
    }        
    public double EncenderMotor(){
        System.out.println("El torque del motor con la revolución estándar de " +getRpmMaxima()+" es de:");
        return (140*727)/3000;
    }             
}
class MotorOtto extends Motor{
    private double cantidadConsumoOtto;
    public MotorOtto(String tipoAlimentacion, String tipoCombustible ,int potencia,
            int velocidadEncendido, int rpmMaxima, double cantidadConsumoOtto){
        super(tipoAlimentacion,tipoCombustible,potencia,velocidadEncendido,rpmMaxima);
        setCantidadConsumoOtto(cantidadConsumoOtto);
    }        
    public void VelocidadEncendido(){
        System.out.println("CARACTERÍSTICAS AL MOMENTO DEL ENCENDIDO DE UN MOTOR OTTO");
        System.out.println("La velocidad de encendido es de " +getVelocidadEncendido()+
                " segundo al momento de encenderlos: "
                + " con"
                + " "+getRpmMaxima()+" revoluciones máximas con una potencia de "
                        +getPotencia()+" CV.");
        System.out.println("\nIntegrando los datos de encendido: ");
    }
        public double getCantidadConsumoOtto(){
            return cantidadConsumoOtto;
        }        
        public void setCantidadConsumoOtto(double nuevo){
        if(nuevo >= 3.0)
            cantidadConsumoOtto=nuevo;
    }        
    public double EncenderMotor(){
        System.out.println("El torque del motor con la revolución estándar de " +getRpmMaxima()+" es de:");
        return (140*727)/4000;
    }             
}
public class TareaPruebaAbstracta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                System.out.println("\t\tUNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE-L");
        System.out.println("MATERIA: PROGRAMACIÓN");
        System.out.println("CARRERA: INGENIERÍA AUTOMOTRIZ");
        System.out.println("NRC: 7450");
        System.out.println("Integrantes: \n"
                + "- Aguaiza Jonathan\n"
                + "- Pico Anita");
        System.out.println(" ");
        System.out.println("\t\tTAREA: Prueba Abstracta");
        ////////////////////////////////////////////////////////////////////////
        Motor motor1 = new MotorDiesel("Sistema de Alimentación","Combustibles fosiles",150,1,3000,5000);
        MotorDiesel motor2 = new MotorDiesel("Alimentación con bomba de presión","Diesel",130,2,3000,3000.0);
        MotorOtto motor3 = new MotorOtto("Inyección electrónica","Gasolina ",160,1,4000,4000.0);

        System.out.println("\n           Integrando los datos para el encendido de un motor: \n");
        motor1.VelocidadEncendido();
        System.out.println("         ***Obtención de datos para el encendido de un Motor Diesel***");
        motor2.VelocidadEncendido();
        System.out.println("        ***Obtención de datos para el encendido de un Motor Otto***");
        motor3.VelocidadEncendido();  
    }
    
}

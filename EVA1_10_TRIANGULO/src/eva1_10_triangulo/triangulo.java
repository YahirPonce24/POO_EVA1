/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_10_triangulo;

/**
 *
 * @author invitado
 */
public class triangulo {
    private double base;
    private double altura;
    
    
    public triangulo(){
    
        base= -1;
        altura= -1;      
                
    }
    
    public void setBase (double valor){
    base = valor;
    }
    public void setAltura (double valor){
    altura = valor;
    }
    
    public double getBase (){
    return base;
    }
    public double getAltura (){
    return altura;
    }
    
    private double calcularArea(){
        return (base + altura) / 2 ;
    }
    
    /*private double calcularHipotenusa(){
        double hipo;
        double hipo1 = (base * base)+(altura * altura);
        hipo = Math.sqrt(hipo1);
        return hipo;
    }*/
    private double calcularPeri(){
        double peri;
        peri = base + altura + Math.sqrt((base*base)+(altura*altura));
        
        return peri;
    }   
    
    
    
    
    public void imprimirDatos(){
    
        System.out.println("El área del triangulo es: " + calcularArea());
        System.out.println("El perimetro del triangulo es: " + calcularPeri());
        System.out.println("La base es: "+base);
        System.out.println("La altura es: "+altura);
    }
    
    
}

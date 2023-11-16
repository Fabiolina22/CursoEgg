/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

/**
 *
 * @author USER
 */
public class DivisionNumero {
    private int num1;
    private int num2;

    public DivisionNumero() {
    }

    public DivisionNumero(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    public double Division (){
        double rpt = 0;
        try{
            if (num2!=0) {
                rpt = num1/num2;
             System.out.println("la division de los numeros es: "+rpt); 
             
            }
        
        }catch(ArithmeticException e){
            System.out.println("ERROR! no se puede dividir por cero");
        }
        return rpt;
    }
        
}

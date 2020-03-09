/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler5;

/**
 *
 * @author Fernando Baladi
 */
public class ProjectEuler5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean r=true;
        int num1=10, aux=1, i=1;
        for (int j = 20; j!=0; j--) {
            for (int k = 20; k!=0; k--) {
                if (j%k==0) {
                    aux *= k; 
                }
            }
        }
        
        /*while(num1%i==0){
            num1 /= i;
            i++;
            System.out.println("Este es i"+i);
            System.out.println("Este es num1"+num1);
        }*/
        System.out.println(num1); //Este sout debería ser 232.792.560
    }
}

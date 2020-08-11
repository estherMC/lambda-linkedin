/*
 * 
 */
package lambdas_01_04;

/**
 *
 * @author MFisher
 */
public class Lambdas_01_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //example of passing multiple values to a method using lambda 
        //notice that I do NOT have to specify the data type of a and b
    	//Se puede especificar el tipo por ejemplo de la siguiente manera: 
    	//Calculate add=(int a, int b) -> a+b;
        Calculate add =(a,b)-> a + b;
        Calculate difference = (a,b) -> Math.abs(a-b);
        Calculate divide =(a,b)-> (b != 0 ? a/b : 0);
        Calculate multiply =(c,d)-> c*d;
        
        System.out.println(add.calc(3,2));
        System.out.println(difference.calc(5,10));
        System.out.println(divide.calc(5, 0));
        System.out.println(multiply.calc(2, 4));
    }
    
}

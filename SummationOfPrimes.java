/*
 * Author   : Zwelibanzi Gumede
 * Date     : 13/02/2024
 * Code description:    Find the sime of all primes below n
 */

public class SummationOfPrimes{
    public static void main(String args[]){
        int sumOfPrimes=0;
        int number = 1000;
        if(number==1){
            System.out.println("1 is not a prime number");
        }else{
            for (int i=2; i<=number; i++){
                for(int j=2; j<=i; j++){
                    if(i%j==0 && i!=j){
                        break;
                        
                    }else if(i%j==0 && i==j){
                        sumOfPrimes+=i;
                        
                    }else{continue;}
                }
            }
            System.out.println(sumOfPrimes);
        }
    }
}
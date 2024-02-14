/*
 * Author   : Zwelibanzi Gumede
 * Date     : 13/02/2024
 * Code description:    Find the sime of all primes below n
 */
public class FactorialDigitSum{
    int fact = 1;
    int val=0;
    public int factorial(int num){
        if (num==0){
            return factSum(fact);
        }else{
            fact *=num; 
            return factorial(num-1);
        }
    }
    public int factSum(int ans){
        System.out.println(ans);
        String  str = String.valueOf(ans);
        String[] sum = str.split("");
        for (String item: sum){
            val += Integer.parseInt(item);
        }
        return val;
    }

    public static void main(String args[]){
        FactorialDigitSum x = new FactorialDigitSum();
        System.out.println(x.factorial(15));
    }
}
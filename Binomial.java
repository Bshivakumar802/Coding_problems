public class Binomial {
    public static int factorial (int f){
        int fact = 1;
        for(int i=1;i<=f;i++){
            fact*=i;
            
        }
        return fact;
    }
    public static void main(String agrs[]){
        int n= 5;
        int r=2;
        int b_c = factorial(n)/(factorial(r)*factorial(n-r));
        System.out.println(b_c);

    }
}

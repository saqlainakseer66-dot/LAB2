public class UtilityMethod {
    public static void main(String[] args){
        int a=15,b=2,c=3;
        System.out.println("addition:"+add(a,b));
        System.out.println("subtration:"+sub(a,b));
        System.out.println("division:"+div(a,b));
        System.out.println("multiplication:"+mul(a,b));
        System.out.println("Max:"+max(a,b,c));
        System.out.println("Isprime:"+isprime(a));
    }


    //ADD
    public static int add(int a, int b){
        int sum=a+b;
        return sum;
    }
//SUB
    public static int sub(int a, int b){
        int sub=a-b;
        return sub;
    }
//MUL
    public static long mul(int a, int b){
        int mul=a*b;
        return mul;
    }
//DIV
    public static double div(int a, int b) {
        if (b == 0) {
            System.out.println("Not Divisoible");
        }
        double div = (double)a / b;
        return div;
    }
    public static int max(int a,int b,int c){
        if(a>=b && a>=c)
            return a;
        else if (b>=a&&b>=c) {
            return b;
        }else
            return c;

        }
        public static boolean isprime(int a){
       int count =0;
        for(int i=2; i<a/2; i++){
            if(a % i == 0)
                return false;
        }
        return true;
        }
}

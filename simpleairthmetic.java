

class simpleairthmetic{
    public static int add(int a,int b) {
        return (a+b);
    }
    public static int subtract(int a,int b) {
        return (a-b);
    }
    public static int multiply(int a,int b) {
        return (a*b);
    }
    public static int divide(int a,int b) {
        return (a/b);
    }
    public static void main(String args[]) {
        int p = 2 ; 
        int q = 7;
        int j;
        j = add(p,q) ;
        System.out.println(" sum of " + p +"  and "+ q +"  is  "+ j +"\n\n" ) ;
        j = subtract(p,q) ;
        System.out.println(" subtraction of " + p +"  and "+ q +"  is  "+ j +"\n\n" ) ;
        j = multiply(p,q) ;
        System.out.println(" product of " + p +"  and "+ q +"  is  "+ j +"\n\n" ) ;
        j = divide(p,q) ;
        System.out.println(" dividation of " + p +"  and "+ q +"  is  "+ j +"\n\n" ) ;
        
    }
}
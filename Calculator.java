public class Calculator
{
    public static int square(int x){
	return x*x;
    }

    public static int sum(int x, int y){
	return x+y;
    }

    public static int power(int x, int n){
	int res = 1;
	for(;n>0;n--)
	    res = res*x;
        return res;
    }

    public static boolean isEven(int x){
	return x%2 == 0;
    }
	
    public static void aMethod(){
	System.out.println("A method is inserted");
    }
	
    public static void sayHello(){
	System.out.println("Hello all...");
    }
}

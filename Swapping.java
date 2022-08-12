// Swapping two variables mutually exchanging the values of the variables


class Swapping{
	public static void main(String[] args){
	System.out.println("The numbers are:");
	int a =10;                                    //initializing the 1st variable
	int b= 20;                                    //initializing the 2nd variable
        System.out.println("Before swap");            //before swapping the values are
	System.out.println("a = "+a);
	System.out.println("b = "+b);
	
	                                 
	 int temp = a;                   //declaring a variable temp where stored
	 a=b;
	 b=temp;
	
	System.out.println("After swapping");           //after swapping the values are
	System.out.println("a = "+a);
	System.out.println("b = "+b);
	
	
	

	
	
}
}
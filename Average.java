/*Write a program in Java to calulate and print the average of five numbers*/

class Average{
	public static void main(String[] args){
	System.out.println("The five numbers are");       
	int a=10;           			//initializing variables                            
	int b=20;				//     "
	int c=30;				//     "
	int d=40;				//	"
	int e=50;				//	"
	System.out.println("The first number is:"  +a);            //values in output screen
	System.out.println("The second number is:"  +b);		//         "
	System.out.println("The third number is:"  +c);			//         "
	System.out.println("The fourth number is:"  +d);		// 	   "
	System.out.println("The fifth number is:"  +e);			//         "


	int average= (a+b+c+d+e)/5;                         //logic for average
	System.out.println("The average is:"  +average);         // output
}
}

/* Use the following definition of an IP address:
IP address is a string in the form "A.B.C.D", where the value of A, B, C, and D may range from 0 to 255. Leading zeros are allowed. The length of A, B, C, or D can't be greater than 3.
In this problem you will be provided strings containing any combination of ASCII characters. You have to write a regular expression to find the valid IPs.
Just write the MyRegex class which contains a String . The string should contain the correct regular expression.
(MyRegex class MUST NOT be public)
Sample Input
000.12.12.034
121.234.12.12
23.45.12.56
00.12.123.123123.123
122.23
Hello.IP
*/
package String;


import java.util.Scanner;

class Line {
	String num = "([01]?\\d{1,2}|2[0,4]\\d[25[0-5])";
	String pattern = num + "." + num + "." + num + "." + num;
}
public class MyRegex  {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter the IP address to check :  ");
		while (in.hasNext()) {
			String IP = in.next();
			System.out.println(IP.matches(new Line().pattern));
		}
	}

}



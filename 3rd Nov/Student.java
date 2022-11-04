package lab3rdnov;

public class Student {
	java.lang.Long studentid;
	java.lang.Character studentGrade;
	java.lang.Double MonthlyFees;
	java.lang.Boolean isScholarshipEligible;
	java.lang.Double fees;
	void calculateFeeStruture(java.lang.Character studentGrade, 
	java.lang.Double MonthlyFees, long studentid) {
	// creating method with argument
	if (studentGrade == 'A') {// cheking if grade is equal
	isScholarshipEligible = true;			//if grade a then scholership true
	fees = MonthlyFees - MonthlyFees * 10 / 100;		//calculating fees
	System.out.println("Scholarship status " +isScholarshipEligible);		//printing all details
	System.out.println("Student id is " + studentid + " is " + "10% fees is exempted,the calculated fees is " + fees);	//print all
	} else if (studentGrade == 'B') {		//if grade b
	isScholarshipEligible = true;		//scholarship available for that grade
	fees = MonthlyFees - MonthlyFees * 8 / 100;		//calculating fees
	System.out.println("Student id is " + studentid + "is" + "Scholarship status " + isScholarshipEligible);	//print details
	System.out.println("8% fees is exempted,the calculated fees is " + fees);
	} else if (studentGrade == 'C') {			//if grade c
	isScholarshipEligible = true;			//scholarship available for that grade
	fees = MonthlyFees - MonthlyFees * 6 / 100;				//calculate fees
	System.out.println("Student id is " + studentid + " is " + "Scholarship status " + isScholarshipEligible);		//print details
	System.out.println("6% fees is exempted,the calculated fees is " + fees);
	} else if (studentGrade == 'D') {				//if grade d
	isScholarshipEligible = true;				//scholarship availavle forthat grade
	fees = MonthlyFees - MonthlyFees * 4 / 100;
	System.out.println("Student id is " + studentid + " is " + "Scholarship status " + isScholarshipEligible);
	System.out.println("4% fees is exempted,the calculated fees is " + fees);
	} else {
	isScholarshipEligible = false;			//no scholarship available for that grade
	fees = MonthlyFees;				//print the as usual monthly fees no deduction 
	System.out.println("Student id is " + studentid + " is " + "Not Eligible for Exempotion");
	}
	}
	//problem 2
	void comparemarks(long Maths, double english) {			//compare marks method
	Integer M = new Integer((int) Maths);// converting long  to integer typecast
	Integer E = new Integer((int) english);// converting Double to Integer
	if (M < E) {		//if english marks is higher than maths
	System.out.println("English is higher than math");
	} else if (M > E) {				//if maths marks is higher than english
	System.out.println("Math is higher than english");
	} else {
	System.out.println("both are Equals");
	}
	}
	//problem 3
	void validateFees(double fees) {
	if (fees > 10000000) {				//if fees is greater than 1lak 
	System.out.println("Fees is Infinite");
	} else {
	System.out.println("the byte value of fee is " + (byte) fees);
	}
	}
	public static void main(String[] args) {// main mthod
	Student s1 = new Student();// creating oject of student 
	Student s2 = new Student();// creating oject 
	Student s3 = new Student();// creating oject 
	s1.calculateFeeStruture('C', 600.0, 234);// passing test case 
	s2.calculateFeeStruture('B', 905.5, 115);// passing test case
	s3.calculateFeeStruture('G', 1810.0, 980);// passing test case 
	s1.comparemarks(85, 65);// passing test case 
	s2.comparemarks(56, 98);// passing test case 
	s3.comparemarks(84, 84);// passing test case 
	s1.validateFees(5555);
	s2.validateFees(100000000);
	
	}

}

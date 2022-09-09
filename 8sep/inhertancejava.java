package classandobj;
class Employee{
    long employeeId;					//declaring  the instance variable
    String employeeName;				//			""
    String employeeAddress;				//			""
    long employeePhone;
    double basicSalary;					//			""
    double specialAllowance=250.80;		//initializing and declaring instance
    double HRA=1000.50;
        Employee(long id, String name,String address, long phone ){
        this.employeeId=id;
        this.employeeName=name;
        this.employeeAddress=address;
        this.employeePhone =phone;
    }
        public void TransportAllowance(double basicSalary) {
    		double allowance = (15*basicSalary /100);
    		System.out.println("The transportation allowance for the employee is  :"  +allowance);
    	}

}

class manager extends Employee{					//derived class extending
    double basicSalary;
    	manager(long id, String name,String address, long phone, double basicSalary){
        super(id,name,address,phone);				//calling parent class constructor to set the values
        this.basicSalary=basicSalary;				//set the basic salary to this class
        }
    	public void  salaryy() {
        	//calculate salary of all the manager
        	double salary = basicSalary + ( basicSalary * specialAllowance/100) + ( basicSalary *
        			HRA/100);
        	System.out.println("The salary of the manager is:  " +salary);
        }
    
    	public void TransportAllowance() {
    		double Allowance= 15*basicSalary /100;		//we are calculating the allowance for the manager
    		System.out.println("the transportation allowance for the manager is:"  +Allowance);
    	}
}


class trainee extends Employee{
	double basicSalary;
    trainee(long id, String name,String address, long phone, double basicSalary){
    super(id,name,address,phone);				//calling super class constructor  to set the values
    this.basicSalary=basicSalary;
    }
    public void  salaryy() {
    	this.basicSalary=basicSalary;			//calculate salary of all the trainee
    	double salary = basicSalary + ( basicSalary * specialAllowance/100) + ( basicSalary *
    			HRA/100);
    	System.out.println("The salary of the employee is:  " +salary);
    	super.TransportAllowance(basicSalary);			//calling super class for Transportallowance
    }
}

public class inhertancejava {
	public static void main(String[] args) {
	manager obj = new manager(10, "Sarbojit","Dumdum Birati",1000,100);		//object creation and manager
	obj.salaryy();
	obj.TransportAllowance();
	trainee obj1 = new trainee(29846, "Jack","Mumbai",442085,45000);
	obj1.salaryy();
	
	}
}

/*4…Consider a scenario where Bank is a class that provides functionality to get the rate 
of interest. However, the rate of interest varies according to banks. For example, SBI, 
ICICI and AXIS banks could provide 8%, 7%, and 9% rate of interest*/
class Bank{
	int getRateOfInterest() {		//returning the rate of interest value of various bank
		return 0;
	}
}
class SBI extends Bank{
	int getRateOfInterest() {		//return interest of sbi
		return 8;
	}
}
class ICICI extends Bank{
	int getRateOfInterest() {	//return interest of ICICI
		return 7;
	}
}
class AXIS extends Bank{
	int getRateOfInterest() {		//return interest of AXIS
		return 9;
	}
}
public class Bank1 {
	public static void main(String[] args) {
		SBI s =new SBI();
		ICICI b =new ICICI();
		AXIS a =new AXIS();
			System.out.println("SBI rate of interest  " +s.getRateOfInterest());
			System.out.println("ICICI rate of interest  " +b.getRateOfInterest());
			System.out.println("AXIS rate of interest   " +a.getRateOfInterest());
			
		
		
	}
}

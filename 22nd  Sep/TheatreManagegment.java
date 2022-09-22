/*Movie Theatre Management System, where you can create two classes one is main another one is movie, 
movie class can have two methods setMovie, getMovie where you can create movieName, movieStartTime, movieEndTime, MovieTicketPrice as instance variables.
 */
package demo;

import java.util.Scanner;

class movie{
	String movie_Name;
	double movie_start_time;
	double movie_end_time;
	double movie_ticket_price;
	
	
	public void setMovie_Name(String movie_Name) {
		this.movie_Name = movie_Name;
	}

	public void setMovie_start_time(double movie_start_time) {
		this.movie_start_time = movie_start_time;
	}

	public void setMovie_end_time(double movie_end_time) {
		this.movie_end_time = movie_end_time;
	}

	public void setMovie_ticket_price(double movie_ticket_price) {
		this.movie_ticket_price = movie_ticket_price;
	}

	public String getMovie_Name() {			//returning the movie name getter
		return movie_Name;
	}
	
	public double getMovie_start_time() { //returning the movie start time
		return movie_start_time;
	}
	
	public double getMovie_end_time() {		//returning the movie end time
		return movie_end_time;
	}
	
	public double getMovie_ticket_price() {
		return movie_ticket_price;
	}
	}
public class TheatreManagegment {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String m_Name;
		double m_strt_time;
		double m_end_time;
		double m_ticket_price;
				
		System.out.println("Enter the movie name :");
		m_Name = s.nextLine();
		System.out.println("Enter the start time :");
		m_strt_time= s.nextDouble();
		System.out.println("Enter the end time :");
		m_end_time= s.nextDouble();
		System.out.println("Enter your movie ticket price :");
		m_ticket_price= s.nextDouble();
		
		movie obj=new movie();
		//creating object and sending values
		
		obj.setMovie_Name(m_Name);
		obj.setMovie_start_time(m_strt_time);
		obj.setMovie_end_time(m_end_time);
		obj.setMovie_ticket_price(m_ticket_price);
		System.out.println("The movie name is  " +obj.movie_Name);
		System.out.println("The movie start time is " +obj.movie_start_time);
		System.out.println("The movie end time is" +obj.movie_end_time);
		System.out.println("The movie ticket price is" +obj.movie_ticket_price);
		
	}

}

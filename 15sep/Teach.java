/*2… In this example, you have a base class Teacher and a sub class ITTeacher. Since 
class ITTeacher extends the designation and college properties and work () method from 
base class, we need not to declare these properties and method in sub class.
Here we have college Name, designation and work () method which are common to all the 
teachers so we have declared them in the base class, this way the child classes like Math 
Teacher, Music Teacher and PhysicsTeacher do not need to write this code and can be used 
directly from base class*/

class Teacher{
	static String college_name=" College = Regent";			//we declare static bcz common for all teacher
	static String designation="Designation = @Teacher";	//common for all teacher
	static void work() {
		System.out.println("Teacher will teach students and guide them for ther better future");
	}
}
class ITTeacher extends Teacher{
	static String  c= "I am an ITTeacher of" +college_name;
}
class MathTeacher extends Teacher{
	static String c= "I am an MathTeacher of" +college_name;
}
class Music_Teacher extends Teacher{
	static String c= "I am an MusicTeacher of" +college_name;
}
class Physics_Teacher extends Teacher{
	static String c= "I am an Physics_Teacher of" +college_name;
}
public class Teach {
public static void main(String[] args) {
	
	System.out.println(Teacher.college_name);		//common for all teacher 
	System.out.println(Teacher.designation);		//common for all teacher
	
	System.out.println(ITTeacher.c);
	

	System.out.println(MathTeacher.c);
	
	
	System.out.println(Music_Teacher.c);
	

	System.out.println(Music_Teacher.c);
	Teacher.work();
	}
}
//output 
/*College = Regent
Designation = @Teacher
I am an ITTeacher of College = Regent
I am an MathTeacher of College = Regent
I am an MusicTeacher of College = Regent
I am an MusicTeacher of College = Regent
Teacher will teach students and guide them for ther better future */
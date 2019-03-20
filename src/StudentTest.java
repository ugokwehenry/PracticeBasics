import java.util.ArrayList;
import java.util.Collection;


public class StudentTest {
public static void main(String []args){
	
	int [] studentIds = new int []{1001,1002,1003, 1004};
	char [] grades = new char []{'A','C','D'};

	/*
	//creating first student object and setting its state
	Student student1 = new Student(studentIds[0], "Tochukwu", grades[0], "male");
	//creating second student object and setting its state
	Student s2 = new Student(studentIds[2], "Chibuzor",  grades[0],"male");
	//creating third student object and setting its state
	Student s3 = new Student(studentIds[2], "Ogechukwu", grades[0],"male");
*/
	//AUTO-GENERATING STUDENT ID
	//creating first student object and setting its state
	Student student1 = new Student( "Tochukwu", grades[0], "male");
	//creating second student object and setting its state
	Student s2 = new Student( "Chibuzor",  grades[0],"male");
	//creating third student object and setting its state
	Student s3 = new Student("Ogechukwu", grades[0],"male");

	Student s4 = new Student.Builder(studentIds[3], "Ikechukwu").build();
	
	ArrayList<Student> list = new ArrayList<>();
	list.add(s4);
	
	//Print each student's name
	System.out.println("Name of student1: "+student1.getName()+ "Object value of S4: "+list);

	System.out.println("Name of student2: "+s2.getName());
	System.out.println("Name of student3: "+s3.getName());
	
	System.out.println("# of students created so far: "+Student.getStudentCount());

	//System.out.println("Old value is: "+s3.updatedProfile(s3.name));
	student1.updateProfile("Ugokwe");
	System.out.println("Updated name of student3: "+student1.getName());
	
	Student student4 = student1;
	System.out.println("Name of student4: "+student4.getName());
	
	student4.setName("Mike");
	System.out.println("Name of student1: "+student1.getName());
	
	student4 = s2;
	System.out.println("Name of student4: "+student4.getName());
	
	s2 = student1;
	System.out.println("Name of student4: "+student4.getName());
	System.out.println("Name of student2: "+s2.getName());
	
	student4 = new Student.Builder(1004, "Alex").Grades(grades[0]).build();
	
	System.out.println("Name of student4: "+student4.getName() +" Printing the student4 object: "+student4);
	System.out.println("Name of student2: "+s2.getName());
	System.out.println("Name of student1: "+student1.getName());
}
}

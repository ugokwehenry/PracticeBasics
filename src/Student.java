public class Student {

	//Static variable 
	private static int  studentCount;
	private static int IDInitializer = 1000;
	
	private final int  id;
	public int getId() {
		return id;
	}

	private String name;
	private String gender = "Male";
	private char grades;
	
	public  static int getStudentCount() {
		return studentCount;
	}

	public static void setStudentCount(int studentCount) {
		Student.studentCount = studentCount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
private Student(Builder builder){
	this.gender = builder.gender;
	this.id = builder.id;
	this.name = builder.name;
	this.grades = builder.grades;
}
	
	public Student(int id, String name) {
		this.name = name;;
		this.id = id;
		return ;
	}


	public Student(String name, char grades, String gender) {
		this.name = name;
		this.grades = grades;
		this.gender = gender;
		
		this.id = ++ IDInitializer;
		System.out.println("The student name "+name+" ID is " +id);
		
		studentCount++;
		
		
	}
	boolean updateProfile(String name) {
		this.name = name;
		return true;
	}
	static class Builder{
		int id;
		String name;
		String gender = "Male";
		char grades;

		public Builder(int id, String name) {
			super();
			this.id = id;
			this.name = name;
		}
		
		public Builder Gender(String gender){
			this.gender = gender;
			return this;
		}
		
		public Builder Grades(char grades){
			this.grades = grades;
			return this;
		}
		
		public Student build(){
			return new Student(this);
		}
	}
	
	String updatedProfile(String name){
		String oldValue = this.name;
		this.name = name;
		return oldValue;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", gender=" + gender
				+ ", grades=" + grades + "]";
	}
	
	
}

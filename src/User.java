
public class User {
int id;
String name;
int salary;

User(int userId, String userName){
id = userId;
name = userName;
}

String lastName  = "Ugokwe";
User(int userId, String userName, int userSalary){
	this(userId, userName);
	salary = userSalary;
}

public static void main(String[] args){
	User instructor = new User(10000, "Henry", 20000);
	System.out.println("Name: "+instructor.name);
}

}

package om.henry.ugokwe.oop.hms.biling;

public class User {
private long id;
private String firstName;
private String gender;
private String email;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public void printUserType(){
	System.out.println("User");
}
public void saveWebLink(){
	System.out.println("User: saveWebLink");
	postAReview();
}
public void postAReview() {
	// TODO Auto-generated method stub
	System.out.println("User: postAReview");
}

}

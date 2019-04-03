package com.henry.ugokwe.oop.hms;

public class User {
public  long id;
private String firstName;
private String gender;
private String email;

public String userType = "User";

public User() {
	System.out.println("User Constructor");
}
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
	postAReview("");
}
public Review postAReview(String reviewText) {
	// TODO Auto-generated method stub
	System.out.println("User: postAReview");
	Review review = new Review(reviewText);
	return review;
}
//Method binding demo
public static void staticMethod(){
	
}
public void instanceMethod(double d){
	System.out.println("User: instanceMethod");
}
public void instanceMethod(User u){
	System.out.println("User: instanceMethod");
}
public  void testStatic(int x){
	System.out.println("User Static");
	
}
}

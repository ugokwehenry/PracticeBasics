package com.henry.ugokwe.oop.hms;

public class Staff extends User{
	private long staffId;
	private int yearsOfExperience;
	private String description;
	private double salary;
	public  int id = 2;
	
	public void printId(){
		System.out.println("id: "+id);
		System.out.println("super.id: "+super.id);
	}
	public long getStaffId() {
		return staffId;
	}
	public void setStaffId(long staffId) {
		this.staffId = staffId;
	}
	public int getYearsOfExperience() {
		return yearsOfExperience;
	}
	public void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void printUserType(){
		System.out.println("Staff");
	}
	public Review postAReview(String reviewText){
		System.out.println("Staff: postAReview");
		Review review = super.postAReview(reviewText);
		review.setApproved(true);
		return review;
	}
	
	public void instanceMethod(int d){
		System.out.println("Staff: instanceMethod");
	}
	public void instanceMethod(Staff d){
		System.out.println("Staff: instanceMethod");
	}
	public Staff(){
		 userType = "Staff";
		System.out.println("Staff Constructor 1");
	}
	public Staff(int id){
		this();
		this.id  = id;
		System.out.println("Staff Constructor 2");
	}
	public  void testStatic(int x){
	System.out.println("Staff testStatic");
	}
}

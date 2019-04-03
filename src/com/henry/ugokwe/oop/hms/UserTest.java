package com.henry.ugokwe.oop.hms;

public class UserTest {
public void printUserType(User u){
	u.printUserType();
}
public static void main(String[] args){
	//part 1
	/*User user = new User();
	User staff = new Staff();
	User editor = new Editor();
	
	UserTest ut = new UserTest();
	ut.printUserType(user);
	ut.printUserType(staff);
	ut.printUserType(editor);
	
	//part 2
	//editor.postAReview();
	//editor.saveWebLink();
	
	//Casting & instanceOf demo
	UserTest ut1 = new UserTest();
	//ut1.approveReview(new Staff());
	ut1.approveReview(new Editor());
	*/
	
	User staff = new Staff();
	staff.testStatic(3);
}

public void approveReview(Staff s){
	//s.approveReview();
	//((Editor)s).approveReview();
	if(s instanceof Editor){
		((Editor)s).approveReview();
	}else{
		System.out.println("Invalid object passed");
	}
}
}

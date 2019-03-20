import java.io.FileOutputStream;
import java.util.Arrays;

public class CurrencyConverter {
	
	public static void main(String[] args) {
		
		/* MoneyTransferService transferService = new MoneyTransferService();



          double transferAmount = transferService.computeTransferAmount(0, 1000);

          double transferFee = transferService.computeTransferFee(0, 1000);



          System.out.println("Transfer Amount: " + transferAmount);

          System.out.println("Transfer Fee: " + transferFee);

		
		CurrencyConverter cc = new CurrencyConverter();
		double[] rate = { 63.0, 3.0, 3.0, 595, 18, 107, 2 };
		cc.setExchangeRate(rate);
		cc.printCurrencies();
				
		rate = new double [] { 64.0, 4.0, 3.50, 595, 18, 107, 2 };		
		cc.setExchangeRate(rate);
		cc.printCurrencies();		
		
		cc.updateExcahangeRates(2, 275);
		cc.setExchangeRate(rate);
		cc.printCurrencies();	

		double amount = 	cc.computeTransferAmount(2, 20000);
		System.out.println("/n Compute Transfer Amount.."+amount);*/
		
		/*
		 * cc.threeDimensionlArrays(); int [] x = {1,3,4,5,56,6,4}; boolean y =
		 * cc.search(x, 4); System.out.println("Value of y is; "+y); int [] ints
		 * = {1,2,4,5,6,7,8,9,10};
		 * System.out.println("Missing numbers is: "+getMissingNumber(ints,
		 * 10));
		 
          
          int array[] = {1,2};
          go(array);
          System.out.println("Array[1]: "+array[1] );
         
          int num = 93;
         System.out.println("Value: "+getNum(num));
         varargsOverLoad(true, 1,2,3);
         varargsOverLoad(true, 1,2,3,4,5,6,7,8);
         varargsOverLoad(true);
         */
         // preAndPost();
		//compoundArithemeticAssignment();
		
		//charTypePromotion();
		
		//comparisonOperators();
		//logicalOperators();
		//bitwiseOperators();
		//switchExpression();
		//System.out.println("Min: "+min);
		
		//labeledBreak();
		//labeledContinue();
		//CurrencyConverter cc = new CurrencyConverter();
		//cc.foo();
		//stringExamples();
		//stringPool();
		
		//stringConcatenation();
		//excapeSequence();
		
		//mathFunctiion();
		//CurrencyConverter cc = new CurrencyConverter(2);
		//long start = System.nanoTime();
		//veryExpensive();
		//System.out.println("Elapsed time: "+((System.nanoTime() - start)/1000000.0)+ " mseconds");
		
		//compareBoxPrimitives();
		//unbelievable();
	}
	FileOutputStream file;
	 // Currency exchange rates of different currencies relative to 1 US dollar

   double[] exchangeRates = new double[] {63.0, 3.0, 3.0, 595.5, 18.0, 107.0, 2.0};

	//double[] exchangeRates;

	void threeDimensionlArrays() {
		System.out.println("\n Inside threeDimensionalArrays");
		int[][][] unitSold = new int[][][] {

				{// New York
				{ 0, 0, 0, 0, 0 }, // Jan
						{ 0, 0, 0, 0, 0 }, // Feb
						{ 0, 0, 0, 0, 0 }, // Mar
						{ 0, 850, 0, 0, 0 } // Apr
				},
				{// San Francisco
				{ 0, 0, 0, 0, }, // Jan
						{ 0, 0, 0, 0, 0 }, // Feb
						{ 0, 0, 0, 0, 0 }, // Mar
						{ 0, 0, 0, 0, 0 } // Apr
				},
				{ { 0, 0, 0, 0, }, { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 },
						{ 0, 0, 0, 0, 0 } },

		};
		System.out.println("unitSold[0][3][1]: " + unitSold[0][3][1]);
	}

	void setExchangeRate(double [] rate) {
		 exchangeRates = rate;
	}
	double getExchangeRate(int countryIndex) {
		return exchangeRates[countryIndex];
	}
	void updateExcahangeRates(int countryIndex, double newVal){
		exchangeRates[countryIndex] = newVal;
	}
	double computeTransferAmount(int countryIndex, double amount){
		return amount *  getExchangeRate(countryIndex);
	}

	void printCurrencies() {
		System.out.println("\nrupee: " + exchangeRates[0]);
		System.out.println("dirham: " + exchangeRates[1]);
		System.out.println("real: " + exchangeRates[2]);
		System.out.println("chilean_peso: " + exchangeRates[3]);
		System.out.println("mexican_peso: " + exchangeRates[4]);
		System.out.println("_yen: " + exchangeRates[5]);
		System.out.println("$australian: "
				+ exchangeRates[exchangeRates.length - 1]);
	}

  private static void excapeSequence() {
		String s = "Hello \"Mr\". John, \n\thow are you?\\";
		System.out.println(s);
		char[] excapeSeq = {'\'','e','l','l','o'};
		System.out.println(excapeSeq);
		
	}

private static void stringConcatenation() {
		String s = "hello " + " world!";
		System.out.println("s: "+s);
		
		//StringBuilder sb = new StringBuilder(s); //Faster if Synchronization is not needed
		StringBuffer sb = new StringBuffer(s);
		
		sb.append(" good").append(" morning :)");
		System.out.println("sb: "+sb.toString());
		System.out.println("sb.length: "+sb.length());
		sb.delete(1, 5);
		System.out.println("sb: "+sb.toString());
		System.out.println("sb.length: "+sb.length());
		sb.insert(1,"ey");
		System.out.println("sb: "+sb.toString());
		System.out.println("sb.length: "+sb.length());
		
		
		
	}

private static void stringPool() {
		System.out.println("\nInside stringPool...");

		String s1 = "hello!";
		String s2 = "hello!";
		String s3 = "hello!";
		
		String s4 = new String("hello!");
		String s5 = "lo!";	
		System.out.println("s1 == s2:");
		System.out.println(s1 == s2);
		System.out.print("s1 == s3: " );
		System.out.println(s1 == s3);
		System.out.print("s1 == s4: " );
		System.out.println( s1 == s4);
		System.out.print("s1 == s4.intern(): ");
		System.out.println(s1 == s4.intern());
		System.out.println("s1 == \"hel\"+\"lo!\": " +s1 == "hel" + "lo!" );
		System.out.println("s1 == \"hel\"+ s5: " +s1 == "hel" + s5 );
		

		
	}

private static void stringExamples() {
		System.out.println("\nInside stringExamples...");
		String s = "Hello World!";
		System.out.println("s: " +s);
		
		/*System.out.println("\ns.length(): "+s.length());
		System.out.println("\ns.isEmpty(): "+s.isEmpty());*/
		
		//Comparison
		System.out.println("\ns.equals(\"HELLO WORLD!\"): " +s.equals("HELLO WORLD!"));
		System.out.println("s.equalsIgnoreCase(\"HELLO WORLD!\"): "+s.equalsIgnoreCase("HELLO WORLD!") );
		System.out.println("s.compareTo(\"HELLO WORLD!\"): "+s.compareTo("HELLO WORLD!") );
		
		//Searching
		System.out.println("\ns.contains(\"HELLO WORLD!\"): "+ s.contains("HELLO WORLD!"));
		System.out.println("s.contains(\"world!\"): "+ s.contains("world!"));
		System.out.println("s.startsWith(\"HELLO WORLD!\"): "+ s.startsWith("HELLO WORLD!"));
		System.out.println("s.startsWith(\"hello world!\"): "+ s.contains("hello world!"));
		System.out.println("s.endsWith(\"!\"): "+ s.contains("!"));
		System.out.println("s.indexOf(\"lo\"): "+ s.indexOf("lo"));
		System.out.println("s.indexOf(\"o\"): "+ s.indexOf("o"));
		System.out.println("s.lastIndexOf(\"o\"): "+ s.lastIndexOf("o"));
		
		//Examining individual characters
		System.out.println("\ns.charAt(4): " +s.charAt(4));
		
		//Extracting substrings
		System.out.println("\ns.substring(4): "+s.substring(4));
		System.out.println("s.substring(4, 9): "+s.substring(4, 9));
		
		//Case conversions (Note: String is immutable. So, only a copy is returned)
		System.out.println("\ns.toUpperCase(): " +s.toUpperCase());
		System.out.println("s.toLowerCase(): " +s.toLowerCase());
		
		System.out.println("\ns.trim(): "+s.trim());
		
		//Replace (eg., replace commas with white-space)
		System.out.println("\ns.replaceAll(\"o\",\"r\"): "+s.replace("o", "r"));
		
		//Split (e.g., split a document into words or split a line of text by tab or comma or whitespace)
		System.out.println("\ns.split(\"o\"):");
		String[] sa = s.split("o");
		for(String temp: sa){
			System.out.println(temp);
		}
		//Static method (includes overloaded methods)
		System.out.println("\nString.valueOf(1.3): "+String.valueOf(1.3));
 }
int x = 10;
	 private  void foo() {
		int x = 0;
		x++;
		
		
		System.out.println("x: "+x);
		this.x++;
		System.out.println("this.x: "+this.x);
	}

	private static void labeledContinue() {
		System.out.println("\nInside labeledContinue...");
		int num =0;
		
		outermost:for(int i =0; i < 10; i++){
			for(int j = 0; j < 10; j++){
				if(i ==5 && j ==5){
					continue outermost;
				}
				num++;
			}
		}
		System.out.println("num: "+num); //print 95
		
		
	}

	private static void labeledBreak() {
		System.out.println("\nInside labeledBreak...");
		int num =0;
		
		outermost:for(int i =0; i < 5; i++){
			for(int j = 0; j < 5; j++){
				if(i ==2 && j ==2){
					break outermost;
				}
				num++;
			}
		}
		System.out.println("num: "+num);
		
	}

	private static int min(int i, int j) {
		int result = (i < j) ? i : j;
		return result;
		
	}

	private static void switchExpression() {
		System.out.println("\nInside switchExpression...");
		int month = 4;
		switch(month){
		case 1: 
			System.out.println("January");
			break;
		case 2: 
			System.out.println("February");
			break;
		case 3:
			System.out.println("March");
			break;
			default: System.out.println("April");
			break;
		}
	}

	private static void bitwiseOperators() {
		System.out.println("/nInside bitwiseOperators...");
		int x = 1;
		int y = 3;
		
		System.out.println("x & y: "+ (x & y));
		System.out.println("x | y: "+ (x | y));
		System.out.println("x ^ y: "+ (x ^ y));
		System.out.println("~x  "+ (~x));
		System.out.println("true & false: "+ (true & false));
		
		char c1 = 'a'; //U+0061 --> 0110 0001
		char c2 = 'b'; //U+0062 --> 0110 0010
		System.out.println("c1 | c2: " +(c1 | c2)); // 0110 0011 --> 99 in decimal);
				//Since bitwise work only on Integer types, following will not compile
				//double d1 = 3.14;
		// double d2 = 5.15;
	//System.out.println("d1 | d2: "+(d1 | d2));
	}

	private static void logicalOperators() {
	System.out.println("\nInside logicalOperators...");
	int age = 37;
	int salary = 85000;
	boolean hasBadCredit = false;
	//1. Core (AND, OR, NOT & Operator Chaining)
	if((age > 35 && salary > 90000) || (!hasBadCredit)){
		System.out.println("Loan Approved!");
	}else{
		System.out.println("Loan Not Approved!");
	}
	
	// 2. 
	//(a) Left-associative ~ Order of grouping
	// (b) Associativity (a && b) && c = a && (b && c)
	
	// 3. 
	// (a) Operator precedence of Logical of Operators: Helps with ONLY grouping operations. Not order of execution. (! > && > ||)
	// Other Examples: A && B || C && D = (A && B) || (C && D)
	//				   A && B && C || D = ((A && B) && C) || D
	
	// (b) Operator Precedence across logical, comparison and arithmetic
	//! > arithmetic > comparison > &&, ||
		
	}// ALWAYS USE PARENTHESIS for READABILITY. Not everyone is aware of precedence
	
	// 4. Use && to avoid NullPointerException

	private static boolean update(Student std, String name) {
		//parameter validation
		int studentId = std.getId();
		if(std!= null && studentId > 1000){
			std.setName(name);
			return true;
		}
		return false;
	}

	private static void comparisonOperators() {
		
	}

	private static void charTypePromotion() {
	System.out.println("\nInside charTypePromotion..");
		char char1 = 50; //Will be assigned corresponding UTF16 value 2
		System.out.println("char1:" +char1);
		System.out.println("(73 - char1)" +(73 - char1)); //char1 gets promoted to int, i.e. decimal equivalent 5 in UTF16 is used
		System.out.println("(char1 - '3')" + (char1 - '3')); //char1 & '3' are promoted to ints
		System.out.println("('a' + 'b')" + ('a' + 'b')); //'a' & 'b' are promoted to ints and the respective equivalents 97 & 98 are added
	System.out.println("a: "+('c' + 0));
		System.out.println("1 divided by 2: " + (float) 1/2);
		System.out.println("1 + 2 = " + 2 + 2);
		

int x = 5;
int y = 10;
int z = ++x * y--;
System.out.println("x"+ ++x + "y: "+y--);
System.out.println("z:" +'a' / 5.0);
	}

	private static void compoundArithemeticAssignment() {
		int x = 100;
		System.out.println("x += 5: "+ (x += 5));
		System.out.println("x -= 5: "+ (x -= 5));
		System.out.println("x *= 5: "+ (x *= 5));
		System.out.println("x /= 5: "+ (x /= 5));
		System.out.println("x %= 5: "+ (x %= 5));
	}

	private static int getNum(int i) {
		int x = 23;
		  System.out.println("Number: "+i );
		  i = x;	
		  return x;
	}

	private static void go(int[] array) {
		System.out.println("Array[0]: "+array[0] );
		System.out.println("Array[1]: "+array[1] );
		array[1] = 22;
	}

	static void varargsOverLoad(boolean b, int i, int j, int k){
		System.out.println("\nInside varargsOverload without varags ...");
	}
	static void varargsOverLoad(boolean b, int...list){
		System.out.println("\nInside varargsOverload with varags ...");
		System.out.println("List.lenght: "+list.length);
	}
	boolean search(int[] list, int key) {
		return (binarySearch1(list, key) > -1);
	}
	

	// Like public version, but without range checks.
	private static int binarySearch0(int[] a, int fromIndex, int toIndex,
			int key) {
		int low = fromIndex;
		int high = toIndex - 1;

		while (low <= high) {
			int mid = (low + high) >>> 1;
			int midVal = a[mid];

			if (midVal < key)
				low = mid + 1;
			else if (midVal > key)
				high = mid - 1;
			else
				return mid; // key found
		}
		return -(low + 1); // key not found.
	}

	public static int binarySearch1(int[] a, int key) {
		return binarySearch0(a, 0, a.length, key);
	}

	public static int getMissingNumber(int[] numbers, int totalCount) {
		int expectedSum = totalCount * ((totalCount + 1) / 2);
		int actualSum = 0;
		for (int i : numbers) {
			actualSum += i;
		}
		return expectedSum - actualSum;
	}

	static void preAndPost(){
		System.out.println("/nInside preAndPost ...");
		//int x = 5;
		//++x;
		
		//System.out.println("x: "+x);
		//int y = ++x;
		//int y = --x;
		//int y = x--;
		//int y = ++x;
		
		//System.out.println("y: "+y+",x: "+x);
		
		int index =0;
		int[] array = new int [3];
		//array[++index] = 10;
		//array[++index] = 20;
		//array[++index] = 30;
		System.out.println("Index: "+ ++index);
		System.out.println("Index: "+index);
	}
	
	public void printMonth(){
		int month = 3;
		if(month ==1){
			System.out.println("January");
		}else if(month == 2){
			System.out.println("February");
		}else if(month == 3){
			System.out.println("March");
		}else{
			System.out.println("April");
		}
	}
	
	public static void mathFunctiion(){
		System.out.println(0.0/0.0);
		System.out.println(Math.sqrt(-2.0));
		System.out.println((int) (Math.random() * 10) );
		System.out.println(Math.round(21.5));
		System.out.println(Math.floor(21.1));
		System.out.println(Math.min(10, 2));
		System.out.println(Math.max(10, 2));
	}
	public CurrencyConverter(){
		System.out.println("Inside no-arg constructor...");
	}
	public CurrencyConverter(int id){
		System.out.println("Inside constructor with a parameter...");
	}
	{
		System.out.println("Inside instance initializer...");
	}

	public void switchExample(){
		System.out.println("\nInside switchExample...");
		final byte month2 = 2;
		byte month = 3;
		switch(month){
		case 1: System.out.println("January");
		break;
		case month2: System.out.println("February");
		break;
		case 3: System.out.println("March");
		break;
		default: System.out.println("April");
		}
	}
	static void veryExpensive(){
		System.out.println("\nInside veryExpensive");
		long sum = 0L;
		for(long i=0; i < Integer.MAX_VALUE; i++){
			sum = sum + i;
		}
	}
	
	static void compareBoxPrimitives(){
		System.out.println("\nInside compareBoxPrimitives ...");
		Integer num1 = new Integer(0);
		Integer num2 = new Integer(0);
		System.out.println("(num1 == num2): " +(num1 == num2));
		
		//Solutions
		System.out.println("(num1.intValue() == num2.intValue() ): "+(num1.intValue() == num2.intValue()));
		System.out.println("(um1.equals(num2)): "+ (num1.equals(num2)));
		
		Integer num3 = new Integer(1);
		System.out.println("(num1 < num3): "+ (num1 < num3)); //"<" does un-boxing first
	}
	
	static Integer i;
	static void unbelievable(){
		System.out.println("\nInside unbelievable ...");
		if(i == 0){
			System.out.println("Weird!");
		}
	}
}


public class StudentUtil {
	enum GradeScale{
		A,B,C,D
	}
	public static int getGradeScale(char grade){
		int gradeScale = 0;
		if (grade == 'A'){
			gradeScale = 4; 
		}else if (grade == 'B'){
			gradeScale = 3; 
		}else if (grade == 'C'){
			gradeScale = 2; 
		}
		return gradeScale;
	}

	 public static double[] calculateGPA(int[] studentIdList, char[][] studentsGrades) {
	       int numberOfCourses;
	       int computeScale = 0;
	       
	       double average = 0;
	       double sum = 0;
	       double[] arrayGrades = new double [studentsGrades.length];
	       for(int row = 0; row < studentsGrades.length; row++){   	
    	   for(int col=0; col < studentsGrades[row].length; col++){   		
    		    computeScale = getGradeScale(studentsGrades[row][col]); 
	    		
    		    numberOfCourses = studentsGrades[row].length;
    		    
    		   System.out.print(studentsGrades[row][col]+" ");
    		   sum = sum + computeScale;
    		    
    		   average = sum/numberOfCourses;
	    	   }
	       System.out.println("sum: "+sum);
	       System.out.println("Average: "+average);
	       arrayGrades[row] = average;
    	   System.out.println();
    	   sum = 0;
	       }
	   return arrayGrades;    
	    }
	    
	    public static int[] getStudentsByGPA(double lower, double higher, int[] studentIdList, char[][] studentsGrades) {
	    	if(lower < 0 ||  higher < 0 || studentIdList.length == 0 || studentsGrades.length == 0 || (lower > higher)){
	    		return null;
	    	}
	        // perform parameter validation. Return null if passed parameters are not valid
	        
	        // invoke calculateGPA
	        
	        // construct the result array and return it. You would need an extra for loop to compute the size of the resulting array
	    	return null;
	    }
	    
	    public static void main(String [] args){
	    	int[] studentList= {1001,1002};
	    	char [][] studentGrades = {{'A','A','A','B'},{'A','B','B'}};
	    	calculateGPA(studentList, studentGrades);
	    	double [][] num = {{4, 4, 4, 3},{4,3,3}};
	    	//System.out.println( sum2d(num));
	    }
	    
	    public static double sum2d (double[ ][ ] array2d)  
	    {
	        double sum = 0;
	        for (int row=0; row < array2d.length; row++)
	        {
	            for (int col=0; col < array2d[row].length; col++)
	            {
	            	System.out.print(array2d [row][col] + " ");
	                sum = sum + array2d [row][col];
	            }
	         //   System.out.println();
	        	System.out.println("Sum of row; "+ sum);
	        	sum = 0;	              
	        }

	        return sum;
	    }
}

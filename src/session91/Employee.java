/**
 * Employee.java  1.1 28-Aug-2017
 *
 */
//package declaration

package session91;
/**
 * This class illustrate Employee details corresponding to each Employee which identifies an Employee.
 * 
 * @author chhaya yadav
 * 
 * version 1.1
 * 
 * dated 28-Aug-2017
 *
 */
//public class declaration

public class Employee {
	
//member variable declaration pertaining to Employee class
	
	private int empCode ;
	
	private String empName ;
	
//parameterized constructor declaration pertaining to Employee class
	
public Employee(int empCode , String empName){
	
	this.empCode = empCode ;
	
	this.empName = empName ;
}

//get method to retrieve empCode attribute of an Employee object

public int getEmpCode() {
	
	return empCode;
}

//set method to set the value of empCode attribute of an Employee object

public void setEmpCode(int empCode) {
	
	this.empCode = empCode;
}

//get method to retrieve empName attribute of an Employee object

public String getEmpName() {
	
	return empName;
}

//set method to set the value of empName attribute of an Employee object

public void setEmpName(String empName) {
	
	this.empName = empName;
}



}

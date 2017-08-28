/**
 * HashMapDemo.java 1.1 28-Aug-2017
 */
//package declaration

package session91;

//importing java.util package to use HashMap class and Map interface of Collection framework

import java.util.* ;

/**
 * This class illustrate to store Employee objects in HashMap class.
 * 
 * HashMap class extends AbstractMap class and implements Map interface for Collection Framework
 * which contains only unique elements and maintains no order.
 * 
 * @author chhaya yadav
 * 
 * version 1.1
 * 
 * dated 28-Aug-2017
 *
 */

//public class declaration

public class HashMapDemo {

//Main method declaration for object declaration and instantiation
	
	public static void main(String[] args) {
		
//Instantiation of HashMap class object with keys as EmpCode and Values as Employee object.
		
		Map<Integer, Employee> mp = new HashMap<Integer, Employee>();
		
//Employee class instantiation		
		
		Employee e1 = new Employee(194298,"Chhaya Yadav");
		
		Employee e2 = new Employee(194248,"Shruti Singh");
		
		Employee e3=  new Employee(194218,"Manoj Yadav");
		
		Employee e4 = new Employee(194288,"Chhaya Sharma");
		
	    Employee e5 = new Employee(194238,"Shruti Arora");
				
	    Employee e6=  new Employee(194228,"Manoj Singh");
		
//populating values in HashMap where key is EmpCode and Value is an instance of Employee class.
		
		mp.put(e1.getEmpCode(), e1);
		
		mp.put(e2.getEmpCode(), e2);
		
		mp.put(e3.getEmpCode(), e3);
		
		mp.put(e4.getEmpCode(), e4);
		
		mp.put(e5.getEmpCode(), e4);
		
		mp.put(e6.getEmpCode(), e6);
		
		
		
		System.out.println("Display the Employee Names stored in Hashmap Class while traversing through it.");
		
		System.out.println("____________________________________________________________________________________");
		
//Traversing through the Map  to print only Employee Names via for loop.
		
//entrySet returns a collection view of the mappings contained in this map.		
	
//Entry is the sub interface of Map. So we will be accessed it by Map.Entry name. It provides methods to get key and value.
		
		for(Map.Entry<Integer,Employee> entry:mp.entrySet()){
			
//Printing only employee names	
			
//entry.getValue returns the value stored in Map corresponding to key.
			
			System.out.println(" Employee Name :"+ entry.getValue().getEmpName());
			

		}

}}
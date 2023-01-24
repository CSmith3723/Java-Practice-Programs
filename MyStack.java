package javacourse.cop2805;
//import Java utilities
import java.util.*;

//MyStack class implementing Cloneable
public class MyStack implements Cloneable {
	
	//main method suppressing warning
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws CloneNotSupportedException {
		
		//MyStack object
		MyStack stack1 = new MyStack();
		
		//add 2 elements to the ArrayList using push method
		stack1.push(4);
		stack1.push(5);		
		
		//second MyStack object to create clone
		MyStack stack2 = (MyStack)stack1.clone();
		
		//Output first and second ArrayList to show that they are identical 
		
		System.out.println(stack1.toString());
		System.out.println(stack2.toString());
		
		//add 2 elements to second ArrayList using push method
		stack2.push(6);
		stack2.push(99);		
		
		//Output both ArrayLists to show that the ArrayLists are different
		System.out.println(stack1.toString());
		System.out.println(stack2.toString());
		
		//remove element from copied ArrayList
		stack2.pop();
		
		//Output second ArrayList 
		System.out.println(stack2.toString());
		
		//use isEmpty method to check if both ArrayLists are empty
		System.out.println(stack1.isEmpty());
		System.out.println(stack2.isEmpty());
}
	
	//clone method
	public Object clone() {
		try {
		// Perform a shallow copy
		MyStack stackClone = (MyStack)super.clone();
		// Deep copy on list
		stackClone.list = (ArrayList<Integer>)(list.clone());
		return stackClone;
		}
		catch (CloneNotSupportedException ex) {
		return null;
		}
	}
 
	//declare ArrayList named list
  public ArrayList<Integer> list = new ArrayList<>(); 

  //create cloned list listClone using clone method
  @SuppressWarnings("unchecked")
  public ArrayList<Integer> listClone = (ArrayList<Integer>) list.clone();

  //no-arg MyStack constructor
  public MyStack() {
  }
  
  //isEmpty boolean method
  public boolean isEmpty() {
    return list.isEmpty();
  }

  //getList method to return list
  public ArrayList<Integer> getList(){
	  return list;
  }
  
  //getSize method to return size of ArrayList
  public int getSize() {
    return list.size();
  }

  //peek method
  public Object peek() {
    return list.get(getSize() - 1);
  }

  //pop method to remove one element
  public Object pop() {
    Object o = list.get(getSize() - 1);
    list.remove(getSize() - 1);
    return o;
  }

  //push method to add an element
  public void push(Integer o) {
    list.add(o);
  }

  //overridden toString method to output ArrayList
  @Override /** Override the toString in the Object class */
  public String toString() {
	
    return "Stack: " + getList();
  }
}

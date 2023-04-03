import java.util.Iterator;
import java.util.LinkedList;


public class Demo {

	
	public static void main(String args[]){  
		LinkedList<String> lst=new LinkedList<String>();
		
		lst.add("Pranav");
		lst.add("Ritish");
		lst.add("Saurabh");
		lst.add("Vandanda");
		lst.add("Uttarksha");
		
		Iterator<String> itr=lst.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		lst.pop();
		System.out.println("After Deleting element...");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	
	}
	
}

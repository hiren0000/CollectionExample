package collectionExample;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* two ways to fetch the value from colllection obj
 * Iterator
 * Enhanced For Loop
 */

/*<E> that makes sure out collection is type safe
 * and it is called as Generic
 */

public class Collection1Exa {

	public static void main(String[] args) {
		
		//Collection is the collection of object
		
	//here we have used object we can also use all the types of generic
		Collection<Object> coll = new ArrayList<>();
		coll.add(2);
		coll.add("Hiren"); 
		coll.add(2.2);
		coll.remove(2);
		
		/* we can not add element in between any elements because 
		 * collection is not supporting key value pair or 
		 * index system
		 */
		
		
		// Iterator
		Iterator<Object> i = coll.iterator();
		
		while(i.hasNext()) 
		{
			System.out.println(i.next());
		}
		
		System.out.println("");
		
		// Enhanced for loop
		for(Object o : coll)
		{
			System.out.println(o);
		}

		System.out.println("");
	
// we r going to use Integer Generic so that will make sure we can only 
	                                               //add integer values
		
		Collection<Integer> s = new ArrayList<>();
		s.add(1);
		s.add(2);
	
		for(Integer o : s)
		{
			System.out.println(o);
		}
	}

}

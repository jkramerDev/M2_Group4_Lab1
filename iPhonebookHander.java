package template;
import java.util.List;

public interface iPhonebookHander {
	
	//bubble sort / merge sort would do it
	public List<Contact> sortByName();
	
	/*
	 * To implement searchByName using binary search, we need to make sure that the
	 * phonebook is sorted by names. Here's the modified sortByKeys method using
	 * Merge Sort, followed by the implementation of searchByName using binary
	 * search:
	 */
	public List<PhonebookEntry> binarySearch(List<Contact> sortedContacts, String name);

	//iterate over the contacts.  
	//no sorting here, just display
	public void display(List<Contact> sortedContacts);
}

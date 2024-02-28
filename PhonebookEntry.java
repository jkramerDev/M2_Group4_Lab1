package template;

/**
 *   model a PhonebookEntry 
 *   
 *   PhonebookEntry has a phoneNumber and type
 *   
 *   
 *   
 */

class PhonebookEntry{
	long phoneNumber;
	String type;

	public PhonebookEntry(long phoneNumber, String type) {
		this.phoneNumber = phoneNumber;
		this.type = type;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}




	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof PhonebookEntry))
			return false;

		PhonebookEntry phonebookentry = (PhonebookEntry) obj;

		return phonebookentry.getPhoneNumber() == this.getPhoneNumber()
				&& phonebookentry.getType() == this.getType();
	}

}
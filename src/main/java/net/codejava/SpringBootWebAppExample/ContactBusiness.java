package net.codejava.SpringBootWebAppExample;

import java.util.ArrayList;
import java.util.List;

public class ContactBusiness {
	public List<Contact> getContactList() {
		List<Contact> listContact = new ArrayList<>();
		
		listContact.add(new Contact("Ramesh Naidu", "Ramesh.Naidu@gmail.com", "India"));
		listContact.add(new Contact("Saad Toseef", "Saad.Toseef@outlook.com", "Pakistan"));
		listContact.add(new Contact("Jones Nathan", "Nathan.Jones@yahoo.com", "UK"));
		listContact.add(new Contact("Paul Ryan", "Paul.Ryan@gmail.com", "Australia"));
		
		return listContact;
	}
}

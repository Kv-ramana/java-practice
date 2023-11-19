import java.util.HashMap;
import java.util.Map;

class Contact {
  private String name;
  private int phoneNumber;
  private String email;
  public Contact(String name,int phoneNumber, String email) {
    this.name = name;
    this.phoneNumber = phoneNumber;
    this.email= email;
  }
  public String getName() {
    return name;
  }
  public void setPhoneNumber(int phoneNumber) {
    this.phoneNumber = phoneNumber;
  }
  public void setEmail(String email) {
    this.email = email;
  }
  public int getPhoneNumber() {
    return phoneNumber;
  }
  public String getEmail() {
    return email;
  }
  public String toString() {
    return "Name: " + name + ", Phone number: " + phoneNumber + ", Email: " + email;
  } 
}
class AddressBook {
  private Map<String, Contact> contacts;

  public AddressBook() {
    contacts = new HashMap<>();
  }
  public void addContact(String name, int phoneNumber, String email) {
    Contact contact = new Contact(name, phoneNumber, email);
    contacts.put(name, contact);
  }
  public void editContact(String name, int newPhoneNumber, String newEmail) {
    if(contacts.containsKey(name)) {
      Contact contact = contacts.get(name);
      contact.setPhoneNumber(newPhoneNumber);
      contact.setEmail(newEmail);
      System.out.println("Contact updated successfully ");
    }
    else {
      System.out.println("Contact not found");
    }
  }
  public void deleteContact(String name) {
    if(contacts.containsKey(name)) {
      contacts.remove(name);
      System.out.println("Contact deleted successfully");
    } else {
      System.out.println("Contact not found");
    }
  }
  public Contact searchContact(String name) {
    return contacts.get(name);
  }
  public void displayContacts() {
    System.out.println("Contacts in the address book:");
    for(Contact contact : contacts.values()) {
      System.out.println(contact);
    }
  }
}
public class AddressBookExample {
  public static void main(String args[]) {
    AddressBook addressBook = new AddressBook();

    addressBook.addContact("venky", 123456, "abc@gmail.com");
    addressBook.addContact("ven", 234567, "def@gmail.com");

    addressBook.displayContacts();

    addressBook.editContact("venky", 112233,"xyz@gmail.com");
    addressBook.displayContacts();
    addressBook.deleteContact("ven");
    addressBook.displayContacts();
    Contact contact = addressBook.searchContact("venky");
    if(contact != null) {
      System.out.println("Contact found: " + contact);
    }
    else {
      System.out.println("Contact not found");
    }

  }
}
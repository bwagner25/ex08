import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ContactInfo John = new ContactInfo("John","johnjohn@johnmail.john");
        BusinessContactInfo Jame = new BusinessContactInfo("Jame","jamejame@jamemail.jame",1234567890);
        ContactList contactList = new ContactList(new ArrayList<>());
        contactList.addContact(John);
        contactList.addContact(Jame);
        contactList.listContacts();
    }
}
import java.util.ArrayList;
public class ContactList {
    private ArrayList<ContactInfo> cList;
    public ContactList(ArrayList<ContactInfo> contactList) {
        cList = contactList;
    }
    public ArrayList<ContactInfo> getContactList() {
        return cList;
    }
    public void setContactList(ArrayList<ContactInfo> contactList) {
        cList = contactList;
    }
    public void addContact(ContactInfo a){
        cList.add(a);
    }
    public void listContacts(){
        for(ContactInfo c:cList){
            c.display();
        }
    }
}


public class BusinessContactInfo extends ContactInfo{
    private int phoneNumber;
    public BusinessContactInfo(String name, String email, int phoneNumber) {
        super(name, email);
        this.phoneNumber = phoneNumber;
    }
    public int getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    @Override
    public void display() {
        System.out.println(getName() + "'s email is " + getEmail() + " and their phone number is " + phoneNumber + ".");
    }
}
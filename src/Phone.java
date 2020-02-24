import java.io.Serializable;

public class Phone {@SuppressWarnings("serial")

class Person implements Serializable {



    private String firstName;

    private String lastName;

    private String contactNumber;

    private String anotherContactNumber;

    private String e_mailAddress;

    private Person next;

    public Person() {

        next = null;

    }



    public String getFirstName() {

        return firstName;

    }



    public void setFirstName(String firstName) {

        this.firstName = firstName;

    }



    public String getLastName() {

        return lastName;

    }



    public void setLastName(String lastName) {

        this.lastName = lastName;

    }



    public void setContactNumber(String contactNumber) {

        this.contactNumber = contactNumber;

    }


    public void setAnotherContactNumber(String anotherContactNumber) {

        this.anotherContactNumber = anotherContactNumber;

    }



    public void setE_mailAddress(String e_mailAddress) {

        this.e_mailAddress = e_mailAddress;

    }



    public Person getNext() {

        return next;

    }



    public void setNext(Person next) {

        this.next = next;

    }



    // toString method @Override



    public String toString() {

        return "\nFirst Name: " + firstName + "\nLast Name: " + lastName + "\nContact Number: " + contactNumber + " , " + anotherContactNumber + "\nEmail Address: " + e_mailAddress;

    }

}
}

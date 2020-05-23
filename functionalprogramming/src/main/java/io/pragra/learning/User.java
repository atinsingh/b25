package io.pragra.learning;

public class User {
    private String firstName;
    private String lastName;
    private int age;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) throws UserDataException {
        if(firstName.length()<8){
            throw new UserDataException("First Name should be atleast 8 chars");
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) throws UserDataException {
        if(lastName.length()<8){
            throw new UserDataException("Last Name should be atleast 8 chars");
        }
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws UserDataException {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}

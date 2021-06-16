public class Person
{
    private String firstName;
    private String lastName;

    public Person(String fullName)
    {
        String[] names = fullName.split(" ");
        firstName = names[0];
        lastName = names[1];
    }

    public Person(String fName, String lName)
    {
        firstName = fName;
        lastName = lName;
    }

    public String getFullName()
    {
        return firstName + " " + lastName;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }    
}

public class person implements Comparable<person> {
    private String lastName;
    private String firstName;

    public person (String firstname, String lastname) {
        this.firstName = firstname;
        this.lastName = lastname;
    }

    public String getFirstname () { return firstName; }
    public String getLastname () { return lastName; }

    public int compareTo (person o) {
        if (lastName.equals (o.getLastname ())) {
            return firstName.compareTo (o.getFirstname ());
        } else {
            return lastName.compareTo (o.getLastname ());
        }
    }

    public static void main (String[] args){
        person firstPerson = new person("Dave", "Shingleton");
        person secondPerson = new person("Bill", "Ainslie");
        person thirdPerson = new person("Sandy", "Shingleton");
        person forthPerson = new person("Bill", "Ainslie");

        System.out.println(firstPerson.compareTo(secondPerson));
        System.out.println(secondPerson.compareTo(forthPerson));
        System.out.println(thirdPerson.compareTo(forthPerson));
        System.out.println(forthPerson.compareTo(firstPerson));

    }
}

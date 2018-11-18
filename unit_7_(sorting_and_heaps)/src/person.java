public class person implements Comparable<person> {
    private String lastname;
    private String firstname;

    public person (String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getFirstname () { return firstname; }
    public String getLastname () { return lastname; }

    public int compareTo (person o) {
        if (lastname.equals (o.getLastname ())) {
            return firstname.compareTo (o.getFirstname ());
        } else {
            return lastname.compareTo (o.getLastname ());
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

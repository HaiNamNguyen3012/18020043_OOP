public class Person implements Comparable<Person> {
    private String name;
    private int age;
    private String address;

    Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    Person() {

    }
    public void setName(String name) {
        this.name=name;
    }
    public String getName() {
        return this.name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }


    public int compareTo(Person a) {
        if (this.name.compareTo(a.name) < 0) return -1;
        else if (this.name.compareTo(a.name) > 0) return 1;
        else {
            if (this.age > a.age) return 1;
            else if (this.age < a.age) return -1;
            else return 0;
        }
    }
}

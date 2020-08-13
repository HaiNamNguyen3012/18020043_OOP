public class Person {
    private String name;
    private String address;

    public Person(String name,String address){
        this.name = name;
        this.address = address;
    }
    public String getName(){
        return this.name;
    }
    public String getAddress(){
        return this.address;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String toString(){
        return "Person[name=" + this.name + ",address=" + this.address + "]";
    }
    public static void main(String[] args){
        Person x = new Person("Thanh Tam", "Tay Ho");
        String s = x.toString();
        System.out.println(s);
    }
}

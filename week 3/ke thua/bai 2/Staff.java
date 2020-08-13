public class Staff extends Person{
    private  String school;
    private double pay;

    public Staff(String name, String address,String school,double pay){
        super(name,address);
        this.pay = pay;
        this.school = school;
    }
    public String getSchool(){
        return this.school;
    }
    public void setSchool(String school){
        this.school = school;
    }
    public double getPay(){
        return  this.pay;
    }
    public void setPay(double pay){
        this.pay = pay;
    }
    @Override
    public String toString(){
        return "Staff[" + super.toString() + ",school=" +this.school + ",pay=" + this.pay +"]";
    }

    public static void main(String[] args){
        Staff x = new Staff("Hai Nam", "Cau Giay", "UET",10000.65);
        String s = x.toString();
        String s1 = x.getSchool();
        double y = x.getPay();
        System.out.println(s1);
        System.out.println(s);
        System.out.println(y);
    }
}

public class Student extends Person {
    private String program;
    private int year;
    private double fee;
    public Student(String name ,String address, String program,int year, double fee){
        super(name,address);
        this.fee =fee;
        this.program = program;
        this.year = year;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public String toString(){
        return "Student[" + super.toString() + ",program=" + this.program + ",year=" + this.year + ",fee=" + this.fee + "]";
    }

    public static void main(String[] args){
        Student a = new Student("Nguyen Hai Nam", "Cau Giay", "Something", 2018, 1500000);
        String s = a.getProgram();
        int x = a.getYear();
        double y = a.getFee();
        String s1 = a.toString();
        System.out.println(s);
        System.out.println(s1);
        System.out.println(x);
        System.out.println(y);
    }
}

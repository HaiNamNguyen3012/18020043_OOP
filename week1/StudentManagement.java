public class StudentManagement {

    Student[] students = new Student[100];
    int length = 0;

    String[] allGroup = new String[100];
    int lengthAllGroup = 0;
    int biendem;

    public static boolean sameGroup(Student s1, Student s2){
        return s1.getGroup().equals(s2.getGroup());
    }

    public void addStudent(Student newStudent){
        students[length++] = newStudent;
    }

    public String studentsByGroup(){
        String sol = "";
        for(int i=0; i<length-1;i++){
            if(i==0)
                allGroup[lengthAllGroup] = students[i].getGroup();
            biendem = 0;
            for(int j=0; j<=lengthAllGroup; j++){
                if(students[i].getGroup()==allGroup[i]){
                    biendem++;
                }
            }
            if(biendem == 0){
                lengthAllGroup++;
                allGroup[lengthAllGroup] = students[i].getGroup();
            }
        }
        for(int i=0; i<=lengthAllGroup; i++){
            sol = sol + allGroup[i] + "\n";
            for(int j=0; j<length-1; j++){
                if(allGroup[i] == students[j].getGroup())
                    sol = sol +students[j].getInfo() + "\n";
            }
        }
        return sol;
    }

    public void removeStudent(String id){
        for(int i=0; i<length; i++){
            if(students[i].getId().equals(id)){
                length--;
                for(int j=0; j<length; j++){
                    i++;
                    students[j] = students[i];
                    break;
                }
            }
        }
    }

    public static void main(String[] args){

    }
}

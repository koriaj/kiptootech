class Sttudent{
    public int rollno;
    public String name;
    public String course;
    public int m1,m2,m3;

    public double total(){
        return m1+m2+m3;
    }
    public double average(){
        return total()/3;
    }
    public String grade(){
        if (average()>=80)
            return "A";
        else if (average()>=50&&average()<80)
            return "B";
        else return "C";
        }
    }




public class OOPStudent {
    public static void main(String[] args) {
    Sttudent std=new Sttudent();
    std.rollno=001;
    std.name="Korir";
    std.m1=23;
        std.m2=73;
        std.m3=45;
        System.out.println("Student"+std.rollno+" Name: "+std.name+"Total marks: "+std.total()+"The Average score is "+std.average()+" and the grade is "+std.grade());
    }
}

 class Student {
    private String rollNo;
    private String name;
    private String department;
    private String subject;
    public Student(String rollNo,String name,String department,String subject){
        this.rollNo=rollNo;
        this.name=name;
        this.department=department;
        this.subject=subject;
    }

     public String getRollNo() {return rollNo;}
     public String getName() {return name;}
     public String getDepartment() {return department;}
     public String getSubject() {return subject;}

     public void setDepartment(String department) {
         this.department = department;
     }

     public void setSubject(String subject) {
         this.subject = subject;
     }
     public String toString() {
         return rollNo + " - " + name + " - " + department + " - " + subject;
     }
 }
 public class Students{
     public static void main(String[] args) {
         Student[] std =new Student[3];
         std[0]= new Student ("st001", "Korir", "IT Depart", "Computer Sci");
         std[1]= new Student ("st002", "Kiptoo", "IT Depart", "Information Engineeringi");
         std[2]= new Student ("st003", "Benard", "Education", "Education");
         for (Student s: std ) {
             System.out.println(s);

         }

     }
 }

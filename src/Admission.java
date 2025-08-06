import java.util.Date;

class StudentAdm
{
    private String rollNo;

    private static int count=1;

    private String assignRollNo()
    {
        Date d=new Date();

        String rno="Univ-"+(d.getYear()+1900)+"-"+count;
        count++;
        return rno;
    }
    StudentAdm()
    {
        rollNo=assignRollNo();
    }
    public String getRollNo()
    {
        return rollNo;
    }

}
public class Admission {
    public static void main(String[] args) {

                StudentAdm s1=new StudentAdm();
                StudentAdm s2=new StudentAdm();
                StudentAdm s3=new StudentAdm();

                System.out.println(s1.getRollNo());
                System.out.println(s2.getRollNo());
                System.out.println(s3.getRollNo());

            }
        }



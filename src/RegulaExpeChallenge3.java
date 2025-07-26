public class RegulaExpeChallenge3 {
    public static void main(String[] args) {
        //Remove Special Characters from a string
        String str="a!b@c1G%";
        String s=str.replaceAll("[^a-zA-Z0-9]","");//ReplaceAll() method
        System.out.println(s);
        //Remove extra spaces from string
        String ss="abc   jfh d            sf";
        System.out.println(ss);
        System.out.println(ss.replaceAll("\\s+"," "));

        //Find number of words-splitmethod
        String sas="abc   jfh d            sf";
        String noSpace=sas.replaceAll("\\s+"," ");
        String words[]=noSpace.split("\\s");
        System.out.println(words.length);
    }
}

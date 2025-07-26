public class RegularExpChallenge {
    public static void main(String[] args) {
        //Find if the email id is on gmail
        String str="korirkiptoo41@gmail.com";
        System.out.println(str.contains("@gmail"));
        //Find username and domain name from an email
        int indexOfAt=str.indexOf("@");
        String username=str.substring(0,indexOfAt);
        System.out.println("Username is "+username);
        String domain=str.substring(indexOfAt+1,str.length());
        System.out.println("Domain is "+domain);
        System.out.println(domain.startsWith("gmail"));
    }
}

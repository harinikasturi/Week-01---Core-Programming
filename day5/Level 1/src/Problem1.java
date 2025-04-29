import java.util.Scanner;
    class Problem1 {
        public static boolean Comparision(String str1, String str2){
            if (str1.length()!=str2.length()) return false;
            for (int i=0; i< str1.length();i++){
                if(str1.charAt(i)!=str2.charAt(i)) return false;
            }
            return true;
        }
        public static void main(String[] args){
            Scanner sn =new Scanner(System.in);
            System.out.println("Enter the first String:");
            String str1=sn.next();
            System.out.print("Enter second string: ");
            String str2 = sn.next();

            boolean resultcharAt=Comparision(str1,str2);
            boolean resultequals=str1.equals(str2);

            System.out.println("Using charAt(): " + resultcharAt);
            System.out.println("Using equals(): " + resultequals);
            System.out.println("Results match: " + (resultcharAt == resultequals));
        }
}

import java.util.*;
    class Problem3{
        public static char[] getCharacters(String text){
            char[] chars=new char[text.length()];
            for (int i=0;i<text.length();i++){
                chars[i]=text.charAt(i);
            }
            return chars;
        }

        public static boolean compareArrays(char[] arr1,char[] arr2){
            return Arrays.equals(arr1,arr2);

        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a string: ");
            String text = sc.next();

            char[] manualArray = getCharacters(text);
            char[] builtInArray = text.toCharArray();
            System.out.println("Manual array: " );
            for (int i=0;i<manualArray.length;i++) {
                char text1 = manualArray[i];
                System.out.println(text1);

            }
            System.out.println("Built-in array: ");
            for (int i=0;i<builtInArray.length;i++) {
                char text1 = builtInArray[i];
                System.out.println(text1);
            }
            System.out.println("Are equal: " + compareArrays(manualArray, builtInArray));
        }
    }

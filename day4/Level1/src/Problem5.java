import java.util.*;

class Problem5 {
    public int checkNumber(int num){
        if(num>0){
            return 1;
        }else if (num<0){
            return -1;
        }else{
            return 0;
        }
    }
        public static void main(String[] args){
        Scanner sn=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num=sn.nextInt();
        Problem5 p5=new Problem5();
        int checkNumber=p5.checkNumber(num);
        System.out.println(checkNumber);
    }
}

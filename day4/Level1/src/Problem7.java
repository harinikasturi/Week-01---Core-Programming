import java.util.*;
    class Problem7 {
        public int sumofnum(int num){
            int sum=0;
            for (int i=0;i<=num;i++){
              sum+=i;
            }
            return sum;
        }
        public static void main(String[] args){
            Scanner sn=new Scanner(System.in);
            System.out.println("Enter the number: ");
            int num=sn.nextInt();

            Problem7 p7=new Problem7();
            int sumofnum=p7.sumofnum(num);
            System.out.println(sumofnum);
        }
}

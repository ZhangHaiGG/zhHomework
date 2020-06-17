package day01;
//求100以内的质数和
public class Demo02 {
    public static void main(String[] args) {
        int sum=0;
        for(int i = 2;i<=100;i++){
            if (i%2!=0&&i%3!=0&&i%5!=0&&i%7!=0)
            sum=sum+i;
        }
        System.out.println(sum+2+3+5+7);

    }
}

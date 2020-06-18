package day03;
//等腰三角形
public class Demo01 {
    public static void main(String[] args) {
        int max=5;
        for (int i= 0;i<=5;i++){
            for (int j=0;j<=max-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<i*2-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

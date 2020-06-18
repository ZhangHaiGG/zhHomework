package day04;

import java.util.ArrayList;
import java.util.Scanner;

public class ZhTest {
    public static void main(String[] args) {
        System.out.println("请输入8个数字：");
        ZhTest zh=new ZhTest();
        zh.method();

    }

    public void method(){
        Scanner sc=new Scanner(System.in);
        int[] num=new int[8];
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        for (int i = 0; i < num.length; i++) {
            num[i]=sc.nextInt();
            System.out.print(num[i]+" ");
            if (num[i]%2==0){
                list1.add(num[i]);
            }else {
                list2.add(num[i]);
            }
        }
        System.out.println("\n");
        System.out.println("偶数数组"+list1);
        System.out.println("奇数数组"+list2);
        if (list1.size()>list2.size()){
            for (int i = 0; i < list2.size(); i++) {
                System.out.print(list2.get(i)+" "+list1.get(i)+" ");

            }
            for (int j =list2.size(); j <=list1.size()-1 ; j++) {
                System.out.print(list1.get(j)+" ");
            }
        }else {
            System.out.println("\n");
            for (int i = 0; i < list1.size(); i++) {
                System.out.print(list1.get(i)+" "+list2.get(i)+" ");
            }
            for (int j = list1.size(); j <=list2.size()-1; j++) {
                System.out.print(list2.get(j)+" ");
            }
            System.out.println("\n");
        }



    }
}

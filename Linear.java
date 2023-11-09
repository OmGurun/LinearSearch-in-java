import java.util.Scanner;

public class Linear {
    public static void main(String[] args) {
        Scanner target=new Scanner(System.in);
        int num[]={5,7,9,11,13};
        System.out.println("Enter Odd Number:-");
        int r=target.nextInt();
       // int target=11;
        int result=linearSearch(num,r);

        if (result!= -1)
        System.out.println("Element found at index:-"+result);
        else
            System.out.println("Elenment not found");
     }

    public static int linearSearch(int[] num, int target) {
        for (int i = 0; i < num.length; i++)
            if (num[i] == target)
                return i;

        return -1;
    }

}

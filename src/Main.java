import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so luongj phần tử");
        n= scanner.nextInt();
        int array[] = new int[n];
        for (int i=0;i<n;i++){
            System.out.println("nhap giá trị phần tử : "+i);
            array[i] = scanner.nextInt();
        }
        for (int i=0;i<n;i++){
            if (array[i]<0){
                array[i]=0;
            }
        }
        for (int i=0;i<n;i++) {
            System.out.println(array[i]);
        }
    }
}
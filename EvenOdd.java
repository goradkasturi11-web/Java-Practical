import java.util.Scanner;
class EvenOdd{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int even=0,odd=0,n;
        System.out.println("Enter the size of array:");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter array elemnts:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(a[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("Count of even no.:"+even);
        System.out.println("Count of odd no.:"+odd);
    }
}
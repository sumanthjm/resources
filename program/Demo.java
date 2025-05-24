import java.util.Scanner;;
public class Demo {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1,n2,last=0;
        
        System.out.println("enter value for n1 and n2");
        n1=sc.nextInt();
        n2=sc.nextInt();
        int aryn1[]=new int[n1];
        int aryn2[]=new int[n2];
        System.out.println(" enter array 1 elementes");
        for(int i=0;i<aryn1.length;i++)
        {
            aryn1[i]=sc.nextInt();
        }
        System.out.println(" enter array 2 elementes");

        for(int i=0;i<aryn2.length;i++)
        {
            aryn2[i]=sc.nextInt();
        }
        for(int i=0;i<aryn1.length;i++){
            int count=0;
            for(int j=0;j<aryn2.length;j++){
                if (aryn1[i]==aryn2[j]) {
                    count++;
                }
                
            }
            if (count==0) {
                System.out.print(aryn1[i]+" ");
                last=aryn1[i];
            }
            
        }
        for(int j=0;j<aryn2.length;j++)
        {
            if (aryn2[j]>last) {
                System.out.print(aryn2[j]+" ");
            }
        }
        sc.close();
    }
}







// import java.util.Scanner;

// public class Demo {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n1, n2;

//         System.out.println("Enter values for n1 and n2:");
//         n1 = sc.nextInt();
//         n2 = sc.nextInt();

//         int aryn1[] = new int[n1];
//         int aryn2[] = new int[n2];

//         System.out.println("Enter elements of array 1:");
//         for (int i = 0; i < aryn1.length; i++) {
//             aryn1[i] = sc.nextInt();
//         }

//         System.out.println("Enter elements of array 2:");
//         for (int i = 0; i < aryn2.length; i++) {
//             aryn2[i] = sc.nextInt();
//         }

//         System.out.println("Elements in array 1 not found in array 2:");
//         for (int i = 0; i < aryn1.length; i++) {
//             int count = 0;
//             for (int j = 0; j < aryn2.length; j++) {
//                 if (aryn1[i] == aryn2[j]) {
//                     count++;
//                 }
//             }
//             if (count == 0) {
//                 System.out.print(aryn1[i] + " ");
//             }
//         }

//         sc.close();
//     }
// }

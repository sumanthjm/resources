// import java.util.Scanner;;
// public class Demo {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n1,n2,last=0;
        
//         System.out.println("enter value for n1 and n2");
//         n1=sc.nextInt();
//         n2=sc.nextInt();
//         int aryn1[]=new int[n1];
//         int aryn2[]=new int[n2];
//         System.out.println(" enter array 1 elementes");
//         for(int i=0;i<aryn1.length;i++)
//         {
//             aryn1[i]=sc.nextInt();
//         }
//         System.out.println(" enter array 2 elementes");

//         for(int i=0;i<aryn2.length;i++)
//         {
//             aryn2[i]=sc.nextInt();
//         }
//         for(int i=0;i<aryn1.length;i++){
//             int count=0;
//             for(int j=0;j<aryn2.length;j++){
//                 if (aryn1[i]==aryn2[j]) {
//                     count++;
//                 }
                
//             }
//             if (count==0) {
//                 System.out.print(aryn1[i]+" ");
//                 last=aryn1[i];
//             }
            
//         }
//         for(int j=0;j<aryn2.length;j++)
//         {
//             if (aryn2[j]>last) {
//                 System.out.print(aryn2[j]+" ");
//             }
//         }
//         sc.close();
//     }
// }







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
            if(aryn1[i]%2==0){
            int count=0;
            for(int j=0;j<aryn2.length;j++){
                if (aryn1[i]==aryn2[j]) {
                    count++;
                }
                
            }
            if (count>=1) {
                System.out.print(aryn1[i]+" ");
                last=aryn1[i];
            }
        }
        }
        
        sc.close();
    }
}





import java.util.Scanner;

interface Calculator {
    void add();
    void sub();
}

class MyCalculator1 implements Calculator {
    @Override
    public void add() {
        int a = 200;
        int b = 100;
        System.out.println(a+b);
    }

    @Override
    public sub() {
        int a = 200;
        int b = 100;
        System.out.println(a-b);
    }
}

class MyCalculator2 implements Calculator {
    @Override
    public void add() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = scan.nextInt();
        System.out.println("Enter the second number");
        int b = scan.nextInt();
        System.out.println(a+b);
    }

    @Override
    public sub() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = scan.nextInt();
        System.out.println("Enter the second number");
        int b = scan.nextInt();
        System.out.println(a-b);
    }
}



class MyCalculator3 implements Calculator {
    @Override
    public void add() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = scan.nextInt();
        System.out.println("Enter the second number");
        int b = scan.nextInt();
        if (a == 0 || b == 0) {
            System.out.println("Invalid Input");
        } else {
            System.out.println(a + b);
        }
    }

    @Override
    public void sub() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = scan.nextInt();
        System.out.println("Enter the second number");
        int b = scan.nextInt();
        if (a == 0 || b == 0) {
            System.out.println("Invalid Input");
        } else {
            System.out.println(a - b);
        }
    }
}

public class Demo {
    public static void main(String[] args) {
        MyCalculator1 mc1 = new MyCalculator1();
        MyCalculator2 mc2 = new MyCalculator2();
        MyCalculator3 mc3 = new MyCalculator3();

        mc1.add();
        mc1.sub();
        mc2.add();
        mc2.sub();
        mc3.add();
        mc3.sub();
    }
}

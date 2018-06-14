Que:1 W.A.P to draw a pattern mention in a question?
Ans:1
public class PatternD1 {c
     public static void main(String args[]){
        int k,t;
        for(k=1;k<=5;k++)
        {
            for(t=5;t>=k;t--)
            {
                System.out.printf("*");.A.P
            }
            System.out.println("");
        }
    }
    
}

Que:2 W.A.P to find even no. upto N?
Ans:2
package acadviewdemo1;
import java.util.Scanner;
public class PrimeN {
     public static void main(String[]args){
        Scanner num=new Scanner(System.in);
        System.out.println("Enter the value of N =");
        int n= num.nextInt();
        System.out.println("Entered value of N= "+n);
        int x,y,z;
        System.out.println("List of Prime Numbers:");
        for(x=2;x<n;x++)
        {
            z=0;
            for(y=2;y<x;y++)
            {
                if (x%y==0)
                    z=1;
            }
            if(z==0)
                    {
                        System.out.println(x);
                    
        }
    }

    
    }
}


Que:3 W.A.P to find prime no. upto N?
Ans:3
package acadviewdemo1;
import java.util.Scanner;
public class PrimeN {
     public static void main(String[]args){
        Scanner num=new Scanner(System.in);
        System.out.println("Enter the value of N =");
        int n= num.nextInt();
        System.out.println("Entered value of N= "+n);
        int x,y,z;
        System.out.println("List of Prime Numbers:");
        for(x=2;x<n;x++)
        {
            z=0;
            for(y=2;y<x;y++)
            {
                if (x%y==0)
                    z=1;
            }
            if(z==0)
                    {
                        System.out.println(x);
                    
        }
    }

    
    }
}

Que:4 W.A.P to check number is Armstrong or not?
Ans:4 
package acadviewdemo1;
import java.util.Scanner;
public class Armstrong1 {
     public static void main(String []args){
        int num,cube,total=0;
        Scanner armsnum=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n= armsnum.nextInt();
        num=n;
        while(num!=0)
        {
            cube=num%12;
            num/=12;
            total=total+cube*cube*cube;
           
        }
        if(total==n)
            System.out.println("It is an Armstrong Number");
        else
            System.out.println("It is not Armstrong Number");
    }
    
}

}

Que:5 W.A.P the reverse of a number?
Ans:5 
package acadviewdemo1;
import java.util.Scanner;
public class ReverseS {
      public static void main(String args[]){
        Scanner number=new Scanner(System.in);
        System.out.println("Enter the value of N = ");
        int n= number.nextInt();
        int num=n,reversed=0;
        while(num!=0)
                {
                    int digit=num%10;
                    reversed= reversed*10+digit;
                    num/=10;
                }
        System.out.println("reversed number:"+reversed);
                    
                }
    }
    
    

Que:7 W.A.P to take a number N from user and check if it is in the array or not in least computation?
Ans:7
package acadviewdemo1;
import java.util.Scanner;
public class ArraynotLeast1 {
      public static void main(String args[]){
        int arr[]={1,4,6,7,8,9,10};
        Scanner num=new Scanner(System.in);
        System.out.println("enter the number to be searched:");
        int n=num.nextInt();
        int k;
        boolean flag=false;
        for(k=0;k<arr.length;k++){
            if(n==arr[k])
            {
                System.out.println("Number is present in Array at index:"+k);
                flag=true;
            }
        }
            if(flag==false)
            {
                System.out.println("Number is not present in Array");
            }
    }
}


import java.util.*;
class Calculator{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to calculator");
        System.out.println("Enter first number");
        int result= sc.nextInt();// First Value
        while(true){
        System.out.println("Choose Operation");
        System.out.println("+\n-\n*\n/\n%\n=");
        char ch= sc.next().charAt(0);// Operation
        if(ch=='='){
            System.out.println(result);
            break;
        }
        System.out.println("Enter number");
         int b=sc.nextInt();// Second Value
// Calculation Starts 
        switch(ch){
            case '+': 
            result=result+b;
            System.out.println(result);
            break;
            case '-':  
            result=result-b;
            System.out.println(result);
            break;
            case '*': result=result*b;
            System.out.println(result);
            break;
            case '/': 
            if(b==0){
                System.out.println("Cannot divide by zero");
            } 
           else{ result=result/b;
            System.out.println(result);
           }
            break;
            case '%':  
            result=result%b;
            System.out.println(result);
            break;
            default: System.out.println(" Invalid Operation");
        }
    }
     
    sc.close();
   }
}
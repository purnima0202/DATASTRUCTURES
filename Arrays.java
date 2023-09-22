//Arrays
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //int[]marks =new int[3];


      marks [0]=34;//phy
        marks[1]=78;//his
        marks[2]=70;//geo



        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);*//*

        Scanner sc= new Scanner(System.in);
        int size=sc.nextInt();
        int numbers[]=new int[size];
        //input
        for(int i=0;i<numbers.length;i++)
        {
            numbers[i]=sc.nextInt();
        }
        int x=sc.nextInt();


        //output
        for(int i=0;i<numbers.length;i++){
            if(x == numbers[i])
            System.out.println("x is found;" + i);
        }
    }


}
//stacks

import java.util.Stack;

public class Main
{
    public static void main(String[] args) {
        Stack<String> hello=new Stack<String>();
        hello.push("hola");
        hello.push("salut");
        hello.push("salaam vaalekum");
        hello.push("namaste");
       //System.out.println(hello.empty());
       hello.pop();//pop will always pop the last object because it follows the approach of LIFO(last in first out)
        hello.pop();
        hello.pop();//as we pop the last element we can see that hola is removed but can still see the stack with square brackets
        hello.pop();//as the number of elements were three but we did it for the fourth time so now it will show an exception of an empty stack

        //to remove the top most element you can assign it to a variable
        String typeHello=hello.pop();
        System.out.println(typeHello);

        //the peek method: It just sees the last element of the stack without  removing the element
        System.out.println(hello.peek());
        System.out.println(hello);

        //search an element,using search method will return the position starting from the top most element(as 1 not 0 like arrays)
        System.out.println(hello.search("salaam vaalekum"));//passing the argument as salaam vaalekum




    }
}

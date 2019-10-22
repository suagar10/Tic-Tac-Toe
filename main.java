import java.util.*;
import java.io.*;
import java.awt.*;
public class TicTacToe
{
    public static void main()
    {
        int f;
        Scanner ob=new Scanner(System.in);
        System.out.println("Hello World");
        System.out.println("Welcome to Suyash's TicTacToe");
        System.out.println("\n\t\tREAD THE INSTRUCTIONS CAREFULLY");
        System.out.println("The main objective is to make a line of crosses or circles \neither vertically,horizontaly or diagonally");
        System.out.println("This is your grid of 3x3");
        System.out.println("1|2|3");
        System.out.println("-----");
        System.out.println("4|5|6");
        System.out.println("-----");
        System.out.println("7|8|9");
        System.out.println("Your sign(X or O) will be alloted to you automaticaly");
        System.out.println("The first one to start will be the one who has been alloted 'X'");
        System.out.println("To input position in this game,you will have to \ninput the number corresponding in the grid");
        System.out.println("For example:To input a sign in the center you will press '5' and \nyou will press '1' to input a sign in the top left corner");
        System.out.println("This game has an inbuilt AUTO-CORRECT feature and\nworks if you input two same player names");
        System.out.println("press enter key to start");
        String key=ob.nextLine();
        System.out.println("Now lets start----->");
        System.out.println("Enter your name");
        String nm=ob.nextLine();
        System.out.println("Enter your opponent's name");
        String opp=ob.nextLine();
        if(nm.equals(opp))
        {
            opp=opp+"01";
        }
        System.out.println(nm+" has been alloted 'X' and "+opp+" has been alloted 'O'.");
        System.out.println("Ok,are you ready???");
        System.out.println();
        String tto[]={"Three","\t","Two","\t","One"};
        for(int i=0;i<5;i++)
        {
            if(i%2!=0)
            {
                try
                {
                    Thread.sleep(500);
                }
                catch(InterruptedException ex)
                {
                }
                System.out.print(tto[i]);
            }
            else
                System.out.print(tto[i]);
        }
        System.out.println();
        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupted();
        }
        System.out.println("GO!!!!!!!!!!!!");
        System.out.println("\f");
        String a[]=new String [10];
        int b[]=new int [10];
        int i,j,flag=0,chance;
        System.out.println("1|2|3");
        System.out.println("-----");
        System.out.println("4|5|6");
        System.out.println("-----");
        System.out.println("7|8|9");
        for(j=1;j<10;j++)
        {
            if(j%2==0)
                System.out.println("Your turn "+opp);
            else
                System.out.println("Your turn "+nm);
            chance=ob.nextInt();
            for(f=1;f<10;f++)
            {
                if(chance==b[f])
                {
                    System.out.println("Wrong number entered,already occupied,enter again");
                    chance=ob.nextInt();
                    f=0;
                }
                while(chance>9||chance<1)
                {
                    System.out.println("Number out of bounds,enter again");
                    chance=ob.nextInt();
                    f=0;
                }             
            }
            b[j]=chance;
            System.out.println("\f");
            if(j%2==0){
                a[chance]="O";}
            else{
                a[chance]="X";}
            for(i=1;i<10;i++)
            {
                if(i%3!=0)
                {
                    if(a[i]==null)
                        System.out.print(" |");
                    else
                        System.out.print(a[i]+"|");
                }
                else if(i!=9)
                {
                    if(a[i]==null)
                        System.out.println(" ");
                    else
                        System.out.println(a[i]);
                    System.out.println("-----");
                }
                else if(i==9)
                {
                    if(a[i]==null)
                        System.out.println(" ");
                    else
                        System.out.println(a[i]);
                }
            }
            System.out.println();
            if(j>=4)
            {
                if(a[1]=="X"&&a[2]=="X"&&a[3]=="X"){
                    System.out.println(nm+" WINS THE MATCH!!!\tBETTER LUCK NEXT TIME "+opp);
                    flag=1;
                    break;}
                else if(a[1]=="O"&&a[2]=="O"&&a[3]=="O"){
                    System.out.println(opp+" WINS THE MATCH!!!\tBETTER LUCK NEXT TIME "+nm);
                    flag=1;
                    break;}
                else if(a[1]=="X"&&a[4]=="X"&&a[7]=="X"){
                    System.out.println(nm+" WINS THE MATCH!!!\tBETTER LUCK NEXT TIME "+opp);
                    flag=1;
                    break;}
                else if(a[1]=="O"&&a[4]=="O"&&a[7]=="O"){
                    System.out.println(opp+" WINS THE MATCH!!!\tBETTER LUCK NEXT TIME "+nm);
                    flag=1;
                    break;}
                else if(a[1]=="X"&&a[5]=="X"&&a[9]=="X"){
                    System.out.println(nm+" WINS THE MATCH!!!\tBETTER LUCK NEXT TIME "+opp);
                    flag=1;
                    break;}
                else if(a[1]=="O"&&a[5]=="O"&&a[9]=="O"){
                    System.out.println(opp+" WINS THE MATCH!!!\tBETTER LUCK NEXT TIME "+nm);
                    flag=1;
                    break;}
                else if(a[2]=="X"&&a[5]=="X"&&a[8]=="X"){
                    System.out.println(nm+" WINS THE MATCH!!!\tBETTER LUCK NEXT TIME "+opp);
                    flag=1;
                    break;}
                else if(a[2]=="O"&&a[5]=="O"&&a[8]=="O"){
                    System.out.println(opp+" WINS THE MATCH!!!\tBETTER LUCK NEXT TIME "+nm);
                    flag=1;
                    break;}
                else if(a[3]=="X"&&a[6]=="X"&&a[9]=="X"){
                    System.out.println(nm+" WINS THE MATCH!!!\tBETTER LUCK NEXT TIME "+opp);
                    flag=1;
                    break;}
                else if(a[3]=="O"&&a[6]=="O"&&a[9]=="O"){
                    System.out.println(opp+" WINS THE MATCH!!!\tBETTER LUCK NEXT TIME "+nm);
                    flag=1;
                    break;}
                else if(a[3]=="X"&&a[5]=="X"&&a[7]=="X"){
                    System.out.println(nm+" WINS THE MATCH!!!\tBETTER LUCK NEXT TIME "+opp);
                    flag=1;
                    break;}
                else if(a[3]=="O"&&a[5]=="O"&&a[7]=="O"){
                    System.out.println(opp+" WINS THE MATCH!!!\tBETTER LUCK NEXT TIME "+nm);
                    flag=1;
                    break;}
                else if(a[4]=="X"&&a[5]=="X"&&a[6]=="X"){
                    System.out.println(nm+" WINS THE MATCH!!!\tBETTER LUCK NEXT TIME "+opp);
                    flag=1;
                    break;}
                else if(a[4]=="O"&&a[5]=="O"&&a[6]=="O"){
                    System.out.println(opp+" WINS THE MATCH!!!\tBETTER LUCK NEXT TIME "+nm);
                    flag=1;
                    break;}
                else if(a[7]=="X"&&a[8]=="X"&&a[9]=="X"){
                    System.out.println(nm+" WINS THE MATCH!!!\tBETTER LUCK NEXT TIME "+opp);
                    flag=1;
                    break;}
                else if(a[7]=="O"&&a[8]=="O"&&a[9]=="O"){
                    System.out.println(opp+" WINS THE MATCH!!!\tBETTER LUCK NEXT TIME "+nm);
                    flag=1;
                    break;}
            }
        }
        Toolkit.getDefaultToolkit().beep();
        if(flag==0)
            System.out.println("MATCH TIED \t WELL PLAYED");
        String users="UsersTTT.txt";
        try
        {
            nm+=" , ";
            FileWriter ob1=new FileWriter(users,true);
            if(nm.equalsIgnoreCase("SUYASH AGARWAL , "))
            {
            }
            else
            {
                ob1.append(nm);
                ob1.append("\n");
                ob1.close();
            }
        }
        catch(Exception e)
        {
            System.out.println();
        }
        System.out.println("MADE BY:");
        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
        String suyash="SUYASH AGARWAL";
        String agarwal="AGARWAL SOLUTIONS ENTERPRISE";
        for(i=0;i<14;i++)
        {
            try
            {
                Thread.sleep(50);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
            System.out.print(suyash.charAt(i));
        }
        System.out.println();
        for(i=0;i<28;i++)
        {
            try
            {
                Thread.sleep(50);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
            System.out.print(agarwal.charAt(i));
        }
    }
}

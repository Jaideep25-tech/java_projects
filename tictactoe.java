import java.lang.String;
import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List; 
public class tictactoe
{
    static ArrayList<Integer> p1=new ArrayList<Integer>();
    static ArrayList<Integer> p2=new ArrayList<Integer>();
    public static void main(String[] args) 
    {
        System.out.println("WELCOME TO TIC TAC TOE");
        System.out.println(" by Jaideep Singh");
        char [][] gameboard= {{' ','+','-','+','-','+','-','+'},{' ','|',' ','|',' ','|',' ','|'},{' ','+','-','+','-','+','-','+'},{' ','|',' ','|',' ','|',' ','|'},{' ','+','-','+','-','+','-','+'},{' ','|',' ','|',' ','|',' ','|'},{' ','+','-','+','-','+','-','+'}};
        printboard(gameboard); 
        Scanner ip =new Scanner(System.in);
        while (true){
            System.out.println("ENTER THE POSITION FOR PLAYER 1(x)");
            int pos=ip.nextInt();
            while (p1.contains (pos)||p2.contains(p1)){
                System.out.println("position taken please enter correct pos");
                pos=ip.nextInt();
            }
            placepiece(gameboard,pos,"player1");
            String whowin= checkwinner();
            if(whowin. length()>0) 
            {
                System.out.println(whowin);
                break;
            }
            System.out.println("ENTER THE POSITION FOR PLAYER 2(0)");
            int pos2=ip.nextInt();
            while (p2.contains(pos2)||p1.contains(p2))
            {
                System.out.println("position taken please enter correct pos");
                pos2=ip.nextInt();
            }
            placepiece(gameboard, pos2,"player2");
            whowin=checkwinner();
            if(whowin.length()>0)
            {
                System.out.println(whowin);
                break;
            }
        }
    }

    public static void printboard(char[][]gameboard) 
    {
        for (int i=0;i<gameboard.length;i++)
        {
            for(int j=0;j<gameboard[i].length; j++)
            {
                System.out.print(" "+gameboard[i][j]); 
            }
            System.out.println("");
        } 
    }

    public static void placepiece(char[][]gameboard,int pos,String user)
    {
        char symbol =' ';
        if(user.equals("player1")) 
        {
            symbol='X';
            p1.add(pos);
        } 
        else{
            symbol = '0';
            p2.add(pos); 
        }
        switch (pos)
        {
            case 1:gameboard[1][2]=symbol;
                break;
            case 2: gameboard[1][4]=symbol;
                break;
            case 3:gameboard[1][6]= symbol; 
                break;
            case 4:gameboard[3][2]=symbol;
                break;
            case 5: gameboard[3][4]=symbol; 
                break;
            case 6:gameboard[3][6]=symbol;
                break;
            case 7:gameboard[5][2]=symbol; 
                break;
            case 8:gameboard[5][4]=symbol;
                break;
            case 9:gameboard[5] [6]=symbol;
                break;
            default :System.out.println("enter proper choice");
        }
        printboard(gameboard);
    }

    public static String checkwinner()
    {
        List top = Arrays.asList(1,2,3);
        List mid= Arrays.asList(4,5,6); 
        List bot = Arrays.asList(7,8,9);
        List left = Arrays.asList(1,4,7);
        List midc = Arrays.asList(2,5,8);
        List right = Arrays.asList(3,6,9);
        List c1= Arrays.asList(1,5,9);
        List c2 = Arrays.asList(3,5,9);
        List<List> winner=new ArrayList<List>();
        winner.add(top);
        winner.add(mid);
        winner.add(bot);
        winner.add(left);
        winner.add (midc);
        winner.add(right);
        winner.add(c1); 
        winner.add(c2);
        for(List l:winner)
        {
            if(p1.containsAll(l)) 
            {
                return "player 1 WIN";
            }
            else if (p2.containsAll(l))
            {
                return "player 2 win";
            }
            else if(p1.size()+p2.size()==9) 
            {
                return "TIE";
            }
        } 
        return "";
    }
}
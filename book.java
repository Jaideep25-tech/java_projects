import java.util.*;
class book
{
    String bookname;
    int price;
    String author;
    book(String bookname,int price, String
    author){
        this.bookname=bookname;
        this.price=price;
        this.author=author;
    }

    public String toString(){
        return ""+bookname+"          "+author+"          "+price;
    }
}
class reader{
    String bookname;
    String author;
    int price;
    String rname;
    String date;

    reader(String bookname,String author,int
    price, String rname, String date){
        this.bookname=bookname;
        this.author=author;
        this.price=price;
        this.rname=rname;
        this.date=date;
    }
}
class Dcoder
{
    public  static void main(String args[])
    {
        ArrayList <book> books= new ArrayList
            <book>();
        ArrayList <reader> read= new ArrayList
            <reader>();
        System.out.println("WELCOME TO LIBRARY");

        System.out.println("enter ur choice");
        System.out.println("add book");
        System.out.println("give book to reader");
        System.out.println("view books");
        while(true){
            System.out.println("CHOICE");
            Scanner ip=new Scanner(System.in);
            int c=ip. nextInt();
            switch (c) {

                case 1:
                    Scanner b=new Scanner(System.in);
                    System.out.println
                    ("enter details of book");
                    String tempbookname;
                    int tempprice;
                    String tempauthor; 

                    System.out.println("enter name");
                    tempbookname=b.nextLine();

                    System.out.println("enter outher");
                    tempauthor=b.nextLine();

                    System.out.println("enter price");
                    tempprice=b.nextInt();

                    books.add(new book(tempbookname,
                            tempprice,tempauthor));
                    break;
                case 2:
                    Scanner r=new Scanner(System.in);
                    String tempreadbookname;
                    String tempreadname;
                    int tempreadprice;
                    String tempreadauthor;
                    String tempdate;
                    int n;

                    System.out.println("enter name of book");
                    tempreadbookname=r.nextLine();

                    System.out.println("enter outher");
                    tempreadauthor=r.nextLine();

                    System.out.println("enter name of reader");
                    tempreadname=r.nextLine();

                    System.out.println("enter date of taken");
                    tempdate=r.nextLine();

                    System.out.println("enter price");
                    tempreadprice=r.nextInt();
                    read.add(new reader(tempreadbookname,
                            tempreadauthor,tempreadprice,
                            tempreadname,tempdate));

                    System.out.println("enter index of book");
                    n=r.nextInt();
                    try{
                        books.remove(n);
                    }
                    catch(Exception e){
                        System.out.println("pleaserechack the index no");
                    }
                    break;

                case 3: System.out.println("");
                    System.out.println("name of book           author           price");
                    for (int i = 0; i < books.size(); i++) {
                        System.out.println(books.get(i) + " ");
                        break;

                    }
            }
        }
    }
}
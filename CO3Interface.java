import java.util.Scanner;
interface Student
{
void displayScore();
}
interface Sports
{
void displaySpScore();
}
class Result implements Student, Sports
{
String name;
private int acScore;
private int spScore;
public Result(String name, int acScore, int spScore)
{
this.name = name;
this.acScore = acScore;
this.spScore = spScore;
}
@Override
public void displayScore()
{
System.out.println("Name: " + name);
System.out.println("Academic score is: " + acScore);
}@Override
public void displaySpScore()
{
System.out.println("Sports score is: " + spScore);
}
}
public class StudentSports
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter student's name: ");
String name = sc.nextLine();
System.out.print ("Enter academic score: ");
int acScore = sc.nextInt();
System.out.print ("Enter sports score: ");
int spScore = sc.nextInt();
Result r = new Result (name, acScore, spScore);
r.displayScore ();
r.displaySpScore ();
}
}
Enter student's name: ammu
Enter academic score: 69
Enter sports score: 15
Name: ammu
Academic score is: 69
Sports score is: 15 
import java.util.Scanner;
interface Shape
{
void getdata();
void area();
void perimeter();
}
class Circle implements Shape
{
double pi = 3.14;
double r;
Scanner sc = new Scanner (System.in);
@Override
public void getdata()
{
System.out.println ("Enter the radius of the circle:");
r = sc.nextDouble ();
}
@Override
public void perimeter()
{
System.out.println("Perimeter of the circle: "+(2*pi*r));
}
@Override
public void area()
{
System.out.println("Perimeter of the circle: "+(pi*r*r));
}
}
class Rectangle implements Shape
{
double l,b;
Scanner sc = new Scanner(System.in);@Override
public void getdata()
{
System.out.println ("Enter the length of the rectangle:");
l = sc.nextDouble ();
System.out.println ("Enter the breadth of the rectangle:");
b = sc.nextDouble ();
}
@Override
public void area()
{
System.out.println("Perimeter of a rectangle: "+(l*b));
}
@Override
public void perimeter()
{
System.out.println("Perimeter of a rectangle: "+(2*(l+b)));
}
}
public class CO3Interface
{
public static void main(String[] args)
{
int ch;
Scanner sc = new Scanner(System.in);
Circle ob1 = new Circle();
Rectangle ob2 = new Rectangle();
do
{
System.out.println("\n1.Circle\n2.Rectangle\n3.exit");
System.out.println("Enter your choice:");
ch = sc.nextInt();
switch(ch)
{
case 1:ob1.getdata();
ob1.area();
ob1.perimeter();
break;
case 2:ob2.getdata();
ob2.area ();
ob2.perimeter ();
break;
case 3:System. out.println("Exited...");
System.exit(0);
}
}while (true);
}
}

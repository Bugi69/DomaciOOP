package miki;
import java.util.Scanner;
public class Mile {
public static void main(String[] args) {
Scanner scan= new Scanner (System.in);
System.out.println("Unesite znak operacije");
int x=24;
int y=12;
char operation= scan.next().charAt(0);
if(operation=='+') {
int c=x+y;
System.out.println(c);
}else if(operation=='-'){
int c=x-y;
System.out.println(c);
}else if (operation=='*') {
int c= x*y;
System.out.println(c);
} else if (operation=='/') {
int c=x/y;
System.out.println(c);
}else {
System.out.println("Netacan unos");
}
}
}

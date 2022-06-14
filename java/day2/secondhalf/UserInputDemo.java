import java.util.*;  
class UserInputDemo   
{  
public static void main(String[] args)  
{  
System.out.println("User input demo\n");  
Scanner sc= new Scanner(System.in); 
System.out.print("Enter a string value ");  
String st= sc.nextLine(); 
System.out.print("Enter a character value ");  
char ch = sc.next().charAt(0);  
System.out.print("Enter integer value ");  
int a= sc.nextInt();  
System.out.print("Enter float value ");  
float b= sc.nextFloat();  

System.out.print("Enter a boolean value ");  
boolean bl=sc.nextBoolean();
System.out.println("displaying user input\n\n");
System.out.println("string : "+st); 
System.out.println("character :  "+ch); 
System.out.println("integer : "+a);
System.out.println("float :  "+b);
System.out.println("boolean : "+bl);


}  
}  
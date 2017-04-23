import java.util.*;
import java.net.*;
import java.io.*;
public class Cnproject
{
public static void main(String[] args){
try
{
ServerSocket obj=new ServerSocket(11999);
Socket obj1=obj.accept();
BufferedReader cin=new BufferedReader(new InputStreamReader(obj1.getInputStream()));
PrintStream cout=new PrintStream(obj1.getOutputStream());
String str1=cin.readLine();
String str2=cin.readLine();
System.out.println(str1);
System.out.println(str2);
String u[]={"user0","user1","user2","user3"};
String p[]={"0","1","2","3"};
for(int i=0;i<u.length;i++){
if(str1.equals(u[i])){
if(str2.equals(p[i])){
System.out.println("account authenticated");
cout.println("y");
}
else{
cout.println("n");
}
catch (Exception e2)
{
System.out.println(e2);
}
try{
ServerSocket obj3=new ServerSocket(12000);
Socket obj2=obj3.accept();
BufferedReader cin2=new BufferedReader(new InputStreamReader(obj2.getInputStream()));
PrintStream cout2=new PrintStream(obj2.getOutputStream());
String str3=cin2.readLine();
System.out.println(str3);
if(str3.equals("vit")){
try
{
ServerSocket obj4=new ServerSocket(4321);
while(true)
{
Socket obj5=obj4.accept();
DataInputStream in=new DataInputStream(obj5.getInputStream());
DataOutputStream ou=new DataOutputStream(obj5.getOutputStream());
String str5=in.readLine();
System.out.println(str5);
cout2.println(str5);
}
catch (Exception e3)
{
System.out.println(e3);
}
catch (Exception e) {
System.out.println(e);}}}
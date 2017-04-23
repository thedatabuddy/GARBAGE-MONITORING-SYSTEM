import java.net.*;
import java.util.*;
import java.io.*;
class sjtbin
{
public static void main(String[]args)
{
try
{
BufferedReader n=new BufferedReader(new InputStreamReader(System.in));
Socket clsct=new Socket("127.0.0.1",4321);
DataInputStream din=new DataInputStream(clsct.getInputStream());
DataOutputStream d=new DataOutputStream(clsct.getOutputStream());
System.out.println("enter the weight of the bin in kgs");
String str=n.readLine();
int a = Integer.parseInt(str);
if(a>=13){
d.writeBytes("SJT BIN IS FULL AND WEIGHT IS"+a+"kgs");
}
else{
d.writeBytes("SJT BIN IS NOT FULL WEIGHT IS"+a+"kgs");
}
clsct.close();
}
catch (Exception e)
{
System.out.println(e); }}}
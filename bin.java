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
if(a>=32){
d.writeBytes("SJT BIN IS FULL AND WEIGHT IS"+a+"kgs");
}
else{
	float x;
	x=a/32;
	float y=x*100;
d.writeBytes("Status of SJT BIN IS"+y+"%OF BIN IS OCCUPIED");
}
clsct.close();
}
catch (Exception e)
{
System.out.println(e); }}}
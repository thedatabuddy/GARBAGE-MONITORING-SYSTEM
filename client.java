package cnclient;
import java.awt.*;
import java.util.Random;
import java.applet.*;
import java.awt.event.*;
import java.net.*;
import java.io.*;
public class CNClient extends Applet implements ActionListener{
frame f1,f2,f3,f4;
Label l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
TextField t1,t2,t3,t4,t7,t8;
Button b,b1,b4,b10;
Color c,c1;
int p,q,r,s;
int money=0;
public void paint(Graphics g)
{
 g.setColor(Color.black);
 g.setFont(new Font("Pristina Regular", Font.PLAIN, 25));
g.drawString("Enhanced Garbage Monitoring", 450,80);
g.setFont(new Font("Myriad Pro", Font.PLAIN, 15));
g.drawString("Welcome to Garbage Monitoring System", 450,160);
g.drawString("Here you can know about bin details of the selected area.", 450,180);
g.drawString("Enter Login Credentials to Proceed.", 450,200);
g.drawOval(425,285,350,350);
g.drawRect(550,547,90,35);
}
public void init(){
l1=new Label("Login ID");
l2=new Label("Password");
l8=new Label("Captcha");
Random rand = new Random();
int cap = rand.nextInt(899) + 10;
l9=new Label(Integer.toString(cap));
t1=new TextField();
t2=new TextField();
t7=new TextField();
t2.setEchoChar('*');
b=new Button("SUBMIT");
b10=new Button("ReCaptcha");
f1=new frame("WELCOME");
f2=new frame("Authentication Problem");
c=new Color(255,145,0);
setBackground(c);
setLayout(null);
l1.setBounds(500,380,80,30);
t1.setBounds(600,380,80,20);
l2.setBounds(500,440,80,30);
t2.setBounds(600,440,80,20);
l8.setBounds(500,500,80,30);
l9.setBounds(570,550,70,30);
t7.setBounds(600,500,80,20);
b.setBounds(900,580,60,30);
b10.setBounds(890,630,80,30);
l9.setFont(new Font("Terbuchet",Font.BOLD,22));
add(l1);
add(l2);
add(l8);
add(l9);
add(t1);
add(t2);
add(t7);
add(b);
add(b10);
b10.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent E)
{
Random rand = new Random();
int cap = rand.nextInt(888) + 111;
l9.setText(Integer.toString(cap));}
});
b.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent ae)
{
String lg=t7.getText();
 String username=t1.getText();
 String password=t2.getText();
try
{
BufferedReader n=new BufferedReader(new InputStreamReader(System.in));
Socket clsct=new Socket("192.168.43.185",11 999);
BufferedReader cin=new BufferedReader(new InputStreamReader(clsct.getInputStream()));
PrintStream cout=new PrintStream(clsct.getOutputStream());
cout.println(username);
cout.println(password);
String ip=cin.readLine();
if(ip.equals("y")&&lg.equals(l9.getText()))
{
f1.flag=1;
f1.repaint();
f1.setBackground(new Color(204,153,255));
b1=new Button("Enter Location of Bin");
f1.setLayout(null);
f1.setVisible(true);
f1.setSize(600,500);
b1.setBounds(300,80,140,30);
f1.add(b1);
b1.setBackground(new Color(155,255,153));
lg="null";
b1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e) {
f1.repaint(141,0,400,400);
p=1;
l3=new Label("Enter Location Here:");
t3=new TextField();
b4=new Button("PROCEED");
l3.setBounds(300,150,200,30);
t3.setBounds(300,200,80,20);
b4.setBounds(300,250,80,30);
b4.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e) {
 try{
 BufferedReader n2=new BufferedReader(new InputStreamReader(System.in));
Socket clsct2=new Socket("192.168.43.185",12000);
BufferedReader cin2=new BufferedReader(new
InputStreamReader(clsct2.getInputStream()));
PrintStream cout2=new PrintStream(clsct2.getOutputStream());
f1.repaint(141,0,400,400);
String amt=t3.getText();
 System.out.println(amt);
cout2.println(amt);
String status=cin2.readLine();
 l7=new Label(status);
l7.setBounds(300,200,200,30);
q=2;
if(p==1){
b4.setVisible(false);
l3.setVisible(false);
t3.setVisible(false);
}
if(r==3){
l4.setVisible(false);
t4.setVisible(false);
}
if(s==4){
l5.setVisible(false);
l6.setVisible(false);
}
f1.add(l7);
}
 catch (Exception e1){
 System.out.println(e1);
 }
 }
  }
);
if(q==2)
l7.setVisible(false);
if(r==3){
l4.setVisible(false);
t4.setVisible(false);
}
if(s==4){
l5.setVisible(false);
l6.setVisible(false);
}
f1.add(b4);
f1.add(l3);
f1.add(t3);
}
);
}
 else{
 l10=new Label("Please Enter Details Correctly");
f2.setLayout(null);
f2.setVisible(true);
f2.setSize(400,150);
l10.setBounds(150,65,500,20);
f2.add(l10);
}
clsct.close();
}
catch (Exception e)
{
System.out.println(e);
}}
});
}
 public void actionPerformed(ActionEvent e) {
 throw new UnsupportedOperationException("Not supported yet."); //To change body of
generated methods, choose Tools | Templates.
 }
}
class frame extends Frame
{
int flag;
 String msg;
 frame(String title){
 super(title);
 }
}

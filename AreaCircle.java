import java.io.*;
public class AreaCircle 
{
 static void calArea() 
 {
  try 
  {
   DataInputStream dis = new DataInputStream(System.in);
   System.out.println("Enter the radius: ");
   double r=Double.parseDouble(dis.readLine());
   double area = Math.PI*r*r;
   System.out.println("Area of the circle: "+ area);
  } 
  catch (Exception e) 
  {
   System.out.println(e);
  }
 }
 public static void main(String args[]) 
 {
  calArea();
 }
}
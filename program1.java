import java.io.*;
public class program1{
	private double radius;
public program1(double radius){
	this.radius=radius;
}
public void Luas(){
	double luas= 3.14*radius*radius;
	System.out.println("Luas lingkaran : "+luas);
}
public void Keliling(){
	double keliling= 2.0*3.14*radius;
	System.out.println("Keliling Lingkaran : "+keliling);
}
public static void main(String[]args) throws Exception{
	DataInputStream dis= new DataInputStream(System.in);
	System.out.print("Input radius : ");
	String input= dis.readLine();
	double i= Double.parseDouble(input);
	program1 A= new program15(i);
	A.Luas();
	A.Keliling();
}
}
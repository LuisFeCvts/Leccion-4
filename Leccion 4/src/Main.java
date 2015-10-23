import java.util.Scanner;

public class Main {
	double centigrados;
	double f;
	double c;
	double fahrenheit;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double centigrados;
		double f;
		double c;
		double fahrenheit;
		
		Centigrados cen= new Centigrados();
		Fahrenheit fa=new Fahrenheit();
		
		fa.informacion();
		cen.informacion();
		System.out.println("Cuantos grados Fahrenheit tienes?");
		Scanner input= new Scanner(System.in);
		fahrenheit=input.nextDouble();
		System.out.println("Tu temperatura en grados centigrados es de " + cen.centigrados(fahrenheit));
		System.out.println("Cuantos grados centigrados tienes?");
		Scanner input2=new Scanner(System.in);
		centigrados=input2.nextDouble();
		System.out.println("Tu temperatura en grados fahrenheit es de " +fa.fahrenheit(centigrados));
	}

}

import java.util.*;

public class UD7exercice3App {
	static Scanner sc = new Scanner(System.in);
	static Hashtable<String, Double> contenedor = new Hashtable<String, Double>(10);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/***
		 * Declaracion del hassh que utilizaremos.
		 */
		menu();
	}

	public static void menu() {
		int num;

		do {
			System.out.println("-------------------------------------------------");
			System.out.println("                      MENÚ                       ");
			System.out.println("1-Introducir un producto");
			System.out.println("2-Mostrar lista de productos");
			System.out.println("3-Mostrar producto especifico");
			System.out.println("0-Salir");
			System.out.println("-------------------------------------------------");
			num = sc.nextInt();

			if (num == 1)
				insertProduct();
			else if (num == 2)
				showProducts();
			else if (num == 3)
				specificProduct();

		} while (num != 0);
	}

	public static void insertProduct() {

		System.out.println("Cuantos productos desea insertar? ");
		int numProd;
		numProd = sc.nextInt();
		do {
			System.out.println("Que producto desea agregar? ");
			String prod = sc.next();
			System.out.println("Cuanto cuesta? ");
			double precio = sc.nextInt();
			contenedor.put(prod, precio);
			numProd--;
		} while (numProd > 0 && numProd <= 10);
	}

	public static void showProducts() {
		Enumeration<Double> precio = contenedor.elements();
		Enumeration<String> nombre = contenedor.keys();

		System.out.println("-------------------Lista de productos--------------------2");
		int i = 1;
		while (nombre.hasMoreElements() && precio.hasMoreElements()) {
			System.out.println("Producto " + i + ": " + nombre.nextElement() + ": " + precio.nextElement());
			i++;
		}
	}

	public static void specificProduct() {
		Enumeration<Double> precio = contenedor.elements();
		Enumeration<String> nombre = contenedor.keys();

		showProducts();
		int prod = sc.nextInt();
		int i = 1;
		
		while (nombre.hasMoreElements() && precio.hasMoreElements() && i <= prod) {
			System.out.println(i);
			if (i == prod) {
				System.out.println("entro");
				System.out.println("Producto " + i + ": " + nombre.nextElement() + ": " + precio.nextElement());
				i++;
			}else {
				nombre.nextElement();
				precio.nextElement();
				System.out.println("no entro");
				i++;
			}
		}
	}

}

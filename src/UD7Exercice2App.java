import javax.swing.JOptionPane;
import java.util.*;

/***
 * 
 * @author rgonzalez
 * @version 08/07/2021
 * 
 *          CONTENT README.txt-->Dentro de esta pila de ejercicios nos
 *          familiarizaremos con arrays dinámicas como puede ser ArrayList, como
 *          HashTable. Yo he dividido mi proyecto en métodos como en los
 *          ejercicios anteriores.<--CONTENT README.txt
 *
 */

public class UD7Exercice2App {
	// globla variable for JOptionPane
	public static JOptionPane jop = new JOptionPane();

	public static void sizeProducts(int cars) {
		ArrayList<Double> productsList = new ArrayList();
		ArrayList<Double> priceT = new ArrayList();
		double totalPriceWIVA = 0;
		for (int i = 0; i < cars; i++) {
			String textProducts = jop.showInputDialog("Cuantos productos ha comprado: ");
			double products = Double.parseDouble(textProducts);
			productsList.add(products);
			for (int j = 0; j < productsList.get(i); j++) {
				String priceProduct = jop.showInputDialog("Precio del producto " + (i + 1) + ": ");
				double price = Double.parseDouble(priceProduct);
				totalPriceWIVA += price;
			}

			String textEssential = jop.showInputDialog("Los productos que va a comprar son esenciales? (SI/NO) Default:NO");
			priceT.add(essential(textEssential, totalPriceWIVA));
			String textMoney = jop.showInputDialog("Introduce la cantidad con la que vas a pagar: ");
			double money = Double.parseDouble(textMoney);
			// Mostrar por pantalla: IVA
			if (textEssential.toUpperCase().contains("SI"))
				jop.showMessageDialog(jop, "IVA aplicado (21% o 4%): 21%");
			else
				jop.showMessageDialog(jop, "IVA aplicado (21% o 4%): 4%");
			// Mostrar por pantalla: Precio total y bruto
			jop.showMessageDialog(jop, "El precio total (con IVA) es de: "+priceT.get(i));
			jop.showMessageDialog(jop, "El precio total (sin IVA) es de: "+totalPriceWIVA);
			// Mostrar por pantalla: Numero de articulos comprados
			jop.showMessageDialog(jop, "Numero de articulos de desea comprar: "+productsList.get(i));
			// Mostrar por pantalla: Cantidad pagada
			jop.showMessageDialog(jop, "Quieres pagar con "+money+"€");
			// Mostrar por pantalla: Cambio a devolver al cliente
			if(money>=priceT.get(i))
				jop.showMessageDialog(jop, "Te deberiamos de devolver: "+(money-priceT.get(i)));
			else
				jop.showMessageDialog(jop, "Deberias añadir "+(money-priceT.get(i))+"€ para realizar la compra");
		}
	}

	public static double essential(String iva, double totalPriceWIVA) {
		if (iva.toUpperCase().contains("SI"))
			return totalPriceWIVA + (totalPriceWIVA * 0.04);
		else
			return totalPriceWIVA + (totalPriceWIVA * 0.10);
	}

	public static void showScreen(ArrayList lis) {

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String textCars = jop.showInputDialog("Cantidad de carritos a la cola: ");
		int cars = Integer.parseInt(textCars);
		sizeProducts(cars);
	}

}

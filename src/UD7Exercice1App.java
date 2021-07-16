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

public class UD7Exercice1App {
	//globla variable for JOptionPane
	public static JOptionPane jop = new JOptionPane();

	/***
	 * 
	 * @apiNote En esta api he optado por crear 4 asignaturas para cada alumno;
	 *          backend, frontend, base de datos y programación con Java.
	 */
	
	public static double calcMedia(double backend, double frontend, double bbdd, double java) {
		return (backend+frontend+bbdd+java)/4;
	}
	
	public static void inArray(ArrayList list, int alumn) {
		for (int i = 0; i < alumn; i++) {
			String textBackend = jop.showInputDialog("Nota de Backend Alumno "+(i+1)+": ");
			double backend = Double.parseDouble(textBackend);
			String textFrontend = jop.showInputDialog("Nota de Frontend Alumno "+(i+1)+": ");
			double frontend = Double.parseDouble(textFrontend);
			String textBbdd = jop.showInputDialog("Nota de BBDD Alumno "+(i+1)+": ");
			double bbdd = Double.parseDouble(textBbdd);
			String textJava = jop.showInputDialog("Nota de Java Alumno "+(i+1)+": ");
			double java = Double.parseDouble(textJava);
			list.add(calcMedia(backend,frontend,bbdd,java));
		}
	}
	
	public static void showScreen(ArrayList list) {
		for(Object o: list) {
			jop.showMessageDialog(jop, o);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Double> list =new ArrayList<>();
		String numAlum = jop.showInputDialog("Numero de alumnos en el curso: ");
		int alumns = Integer.parseInt(numAlum);
		inArray(list,alumns);
		showScreen(list);
	}

}

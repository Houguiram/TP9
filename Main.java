
public class Main {

	public static void main(String[] args) {
		ArbreBinaire d = new ArbreBinaire("d");
		ArbreBinaire e = new ArbreBinaire("e");
		ArbreBinaire b = new ArbreBinaire("b", d, e);
		ArbreBinaire c = new ArbreBinaire("c");
		ArbreBinaire a = new ArbreBinaire("a", b, c);

		System.out.println(a.prefix());
		System.out.println(a.profondeur());
		System.out.println(a.parcoursLargeur());

	}

}

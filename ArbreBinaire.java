import java.util.ArrayList;

public class ArbreBinaire {
	private String name;
	private ArbreBinaire left;
	private ArbreBinaire right;

	public ArbreBinaire() {
		name = null;
		left = null;
		right = null;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArbreBinaire getLeft() {
		return left;
	}

	public void setLeft(ArbreBinaire left) {
		this.left = left;
	}

	public ArbreBinaire getRight() {
		return right;
	}

	public void setRight(ArbreBinaire right) {
		this.right = right;
	}

	public ArbreBinaire(String vname) {
		name = vname;
		left = null;
		right = null;
	}

	public ArbreBinaire(String vname, ArbreBinaire vleft, ArbreBinaire vright) {
		name = vname;
		left = vleft;
		right = vright;
	}

	public String prefix() {
		String result = "";
		result = result.concat(this.getName());
		if (this.getLeft() != null) {
			result = result.concat(this.getLeft().prefix());
			result = result.concat(this.getRight().prefix());
		}
		return result;
	}

	public int profondeur() {
		int result = 0;

		if (this.getLeft() != null) {
			result++;
			result += Math.max(this.getLeft().profondeur(), this.getRight().profondeur());
		}

		return result;

	}

	public String parcoursLargeur() {
		ArrayList<ArbreBinaire> file = new ArrayList<ArbreBinaire>();
		String result = "";
		file.add(this);
		while (!file.isEmpty()) {
			result = result.concat(file.get(0).getName());
			if (file.get(0).getLeft() != null) {
				file.add(file.get(0).getLeft());
			}
			if (file.get(0).getRight() != null) {
				file.add(file.get(0).getRight());
			}
			file.remove(0);
		}
		return result;

	}

}

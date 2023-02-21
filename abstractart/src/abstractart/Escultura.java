package abstractart;

public class Escultura extends Arte {

	private String material;

	public Escultura(String title, String author, String description, String material) {
		super(title, author, description);
		this.material = material;
	}

	@Override
	public void verArte() {
		// TODO Auto-generated method stub
		System.out.println("Arte [title=" + this.getTitle() + ", author=" + this.getAuthor() + ", description="
				+ this.getDescription() + " tipo material"+this.getMaterial()+"]");

	}

	@Override
	public String toString() {
		return "Escultura [material=" + material + "]";
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

}

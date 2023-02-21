package abstractart;

public class Pintura extends Arte {

	private String tipoPintura;

	public Pintura(String title, String author, String description, String tipoPintura) {
		super(title, author, description);
		this.tipoPintura = tipoPintura;
	}

	@Override
	public void verArte() {
		// TODO Auto-generated method stub
		System.out.println("Arte [title=" + this.getTitle() + ", author=" + this.getAuthor() + ", description="
				+ this.getDescription() + "tipo pintura " + this.getTipoPintura() + "]");
	}

	public String getTipoPintura() {
		return tipoPintura;
	}

	public void setTipoPintura(String tipoPintura) {
		this.tipoPintura = tipoPintura;
	}

}

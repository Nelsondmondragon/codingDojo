package abstractart;

import java.util.ArrayList;

public class Museo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Arte pintura1 = new Pintura("Pintura1", "Nelson1", "descripcion1", "tipo1");
		Arte pintura2 = new Pintura("Pintura2", "Nelson2", "descripcion2", "tipo2");

		Arte pintura3 = new Pintura("Pintura3", "Nelson3", "descripcion3", "tipo3");

		Arte escultura1 = new Escultura("Escultura1", "Nelson1", "descripcion1", "material1");
		Arte escultura2 = new Escultura("Escultura2", "Nelson2", "descripcion2", "material2");

		ArrayList<Arte> museo = new ArrayList<Arte>();
		museo.add(pintura1);
		museo.add(pintura2);
		museo.add(pintura3);

		museo.add(escultura1);
		museo.add(escultura2);
//		System.out.println("ssss");

		for (Arte arte : museo) {
			arte.verArte();
		}
	}

}

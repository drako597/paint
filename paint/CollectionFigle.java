package paint;

import java.io.Serializable;
import java.util.Collection;
import java.util.LinkedList;
import figle.*;

public class CollectionFigle implements Serializable {

	private Collection<Figle> collectionFigle = new LinkedList<>();

	public Collection<Figle> getCollectionFigle() {
		return collectionFigle;

	}

	public void add(Figure figure) {
		// TODO Auto-generated method stub
		getCollectionFigle().add(figure);
	}

	public void setCollectionFigle(Collection<Figle> collectionFigle) {
		this.collectionFigle = collectionFigle;
	}

}

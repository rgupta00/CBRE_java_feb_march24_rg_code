package d;

import java.util.Comparator;

public class ProductSortAsPerPrice implements Comparator<Product> {

	//sort as per price: desc order
	@Override
	public int compare(Product o1, Product o2) {
		return Double.compare(o2.getProductPrice(), o1.getProductPrice());
	}

}

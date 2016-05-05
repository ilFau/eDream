package customerCart;
import java.util.List;

public interface Customer {
	public List<Receipt> getPurchaseHistory();
	public void addToHistory(Receipt receipt);
	
}

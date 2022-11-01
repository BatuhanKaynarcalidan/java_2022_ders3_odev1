package java_2022_ders3_odev1.businnes;
import java_2022_ders3_odev1.dataaccess.CreditManager;
import java_2022_ders3_odev1.entities.Customer;

public class CustomerManager 
{
	private CreditManager _creditManager;
	public CustomerManager(CreditManager creditManager)
	{
		_creditManager = creditManager;
	}
	public void save(Customer customer)
	{
		
		System.out.println("Musteri Kaydedildi : "+customer.getFirstName()+" "+customer.getLastName());
	}
	public void giveCredit()
	{
		_creditManager.calculate();
		System.out.println("Kredi Verildi");
	}
}

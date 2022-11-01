package java_2022_ders3_odev1;


import java_2022_ders3_odev1.businnes.CustomerManager;
import java_2022_ders3_odev1.dataaccess.CreditManager;
import java_2022_ders3_odev1.dataaccess.TeacherCreditManager;
import java_2022_ders3_odev1.entities.Customer;

public class Main {

	public static void main(String[] args) {
		CreditManager creditManager = new CreditManager() {
			
			@Override
			public void save() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void calculate() {
				// TODO Auto-generated method stub
				
			}
		};
		creditManager.calculate();
		creditManager.save();
		
		Customer customer = new Customer(1,"Batuhan","Kaynarcalidan","123123132123");
		
		CustomerManager customerManager = new CustomerManager(new TeacherCreditManager());
		customerManager.save(customer);
		customerManager.giveCredit();
		

	}

}

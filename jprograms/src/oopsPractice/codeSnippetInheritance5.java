package oopsPractice;

class Customer {
	public Customer() {
		System.out.println("Customer");
	}
}

class RegularCustomer extends Customer {
	public RegularCustomer() {
		System.out.println("Regular Customer");
	}
}

class PremiumCustomer extends RegularCustomer {
	public PremiumCustomer() {
		System.out.println("Premium Customer");

	}
}

public class codeSnippetInheritance5 {

	public static void main(String[] args) {
		PremiumCustomer pc = new PremiumCustomer();

	}

}

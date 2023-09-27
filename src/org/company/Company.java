package org.company;
import org.client.Client;
public class Company extends Client{
	public void companyName() {
		System.out.println("THE COMPANY NAME IS AiiTE");
	}
	public static void main(String[] args) {
		Company com=new Company();
		com.companyName();
		com.clientName();
	}
}

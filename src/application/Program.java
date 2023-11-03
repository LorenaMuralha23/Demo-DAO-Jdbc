package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		SellerDao sellerDao = DaoFactory.createSellerDao();
		Department department = new Department(2, null);
		
		System.out.println("=== Test 1 : seller findById() ===");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n=== Test 2 : seller findByDepartment() ===");
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller sel : list) {
			System.out.println(sel);
		}
		
		System.out.println("\n=== Test 3 : seller findAll() ===");
		list = sellerDao.findAll();
		for (Seller sel : list) {
			System.out.println(sel);
		}
		
		System.out.println("\n=== Test 4 : seller insert() ===");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New id = " + newSeller.getId());
		
		System.out.println("\n=== Test 5 : seller update() ===");
		seller = sellerDao.findById(1);
		seller.setName("Martha Waine");
		sellerDao.update(seller);
		System.out.println("Update completed!");
		
		System.out.println("\n=== Test 6 : seller deleteById() ===");
		System.out.println("Enter id for delete test: ");
		int id = input.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Delete completed!");
		
		input.close();
	}

}

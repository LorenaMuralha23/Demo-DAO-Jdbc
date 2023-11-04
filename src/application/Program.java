package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		SellerDao sellerDao = DaoFactory.createSellerDao();
//		
//		System.out.println("=== SELLER TESTS ===");
//		
//		System.out.println("=== Test 1 : seller findById() ===");
//		Seller seller = sellerDao.findById(3);
//		System.out.println(seller);
//		
//		System.out.println("\n=== Test 2 : seller findByDepartment() ===");
//		List<Seller> list = sellerDao.findByDepartment(department);
//		for (Seller sel : list) {
//			System.out.println(sel);
//		}
//		
//		System.out.println("\n=== Test 3 : seller findAll() ===");
//		list = sellerDao.findAll();
//		for (Seller sel : list) {
//			System.out.println(sel);
//		}
//		
//		System.out.println("\n=== Test 4 : seller insert() ===");
//		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
//		sellerDao.insert(newSeller);
//		System.out.println("Inserted! New id = " + newSeller.getId());
//		
//		System.out.println("\n=== Test 5 : seller update() ===");
//		seller = sellerDao.findById(1);
//		seller.setName("Martha Waine");
//		sellerDao.update(seller);
//		System.out.println("Update completed!");
//		
//		System.out.println("\n=== Test 6 : seller deleteById() ===");
//		System.out.println("Enter id for delete test: ");
//		int id = input.nextInt();
//		sellerDao.deleteById(id);
//		System.out.println("Delete completed!");
		
		System.out.println("\n\n=== DEPARTMENT TESTS ===\n");
		DepartmentDao dpDao = DaoFactory.createDepartmentDao();
		
//		System.out.println("\n=== Test 1 : department insert() ===");
//		System.out.println("Enter a name for the new department: ");
//		String name = input.next();
//		Department newDp = new Department(name);
//		dpDao.insert(newDp);
//		System.out.println("Insert completed!");
//		
//		System.out.println("\n=== Test 2 : department deleteById() ===");
//		System.out.println("Enter id for delete test: ");
//		int id = input.nextInt();
//		dpDao.deleteById(id);
//		System.out.println("Delete completed!");
		
		System.out.println("=== Test 3 : department findById() ===");
		Department dpFinded = dpDao.findById(4);
		System.out.println(dpFinded);
		
		System.out.println("\n=== Test 4 : department findAll() ===");
		List<Department> list = dpDao.findAll();
		for (Department dp : list) {
			System.out.println(dp);
		}
		
		System.out.println("\n=== Test 5 : seller update() ===");
		Department dp = dpDao.findById(4);
		dp.setName("Literature");
		dpDao.update(dp);
		System.out.println("Update completed!");
		
	}

}

package app;
import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {
    public static void main(String[] args) throws Exception {

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("\n=== TEST 1: seller findById ====");

        Seller seller = sellerDao.findById(3);

        System.out.println(seller);

        System.out.println("\n=== TEST 2: seller findByDepartment ====");

        Department department = new Department(2, null);

        List<Seller> list = sellerDao.findByDepartment(department);

        for (Seller obj : list)
        {
            System.out.println(obj);
        }

        System.out.println("\n=== TEST 3: seller findAll ====");
        
        list = sellerDao.findAll();

        for (Seller obj : list)
        {
            System.out.println(obj);
        }

        System.out.println("\n=== TEST 4: seller Insert ====");
        
        Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);

        sellerDao.insert(newSeller);

        System.out.println("Inserted! New ID = " + new Seller().getId());

        System.out.println("\n=== TEST 5: seller Update ====");


        seller = sellerDao.findById(11);

        seller.setName("Justin timberlake");

        sellerDao.update(seller);

        System.out.println("Update complete");

        System.out.println("\n=== TEST 6: seller Delete ====");

        sellerDao.deleteById(12);
        
        System.out.println("Delete Complete");

    }

}

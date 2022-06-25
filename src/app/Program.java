package app;
import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {
    public static void main(String[] args) throws Exception {
        

        Department obj = new Department(1, "Books");

        Seller obj2 = new Seller(21, "Bob", "Bob@gmail.com", new Date(), 3000.0, obj);

        System.out.println(obj2);


    }

}

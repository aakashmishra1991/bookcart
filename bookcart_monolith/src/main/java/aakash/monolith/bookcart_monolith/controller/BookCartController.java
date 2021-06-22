package aakash.monolith.bookcart_monolith.controller;

import aakash.monolith.bookcart_monolith.business.OrderBusinessImpl;
import aakash.monolith.bookcart_monolith.dao.model.UserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController("bookcart")
public class BookCartController {

// localhost:8080/bookcart/user

    @Autowired
    private OrderBusinessImpl bookCartBusiness;

    @GetMapping("user/{id}")
    public UserDetails getUser(@PathVariable Long id){
        // check the user access
        // check user type - admin or a customer

        return bookCartBusiness.getUser(id);
    }
//    public BookDetails getBook(String id){
//
//        // create database connection;
//        // open session
//        // get user
//
//        // close the session connections
//        return  new BookDetails();
//
//    }
//    public Inventory getInventoryDetails(String id){
//
//        // create database connection;
//        // open session
//        // get user
//
//        // close the session connections
//        return  new Inventory();
//
//    }


}

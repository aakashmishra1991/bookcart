package aakash.monolith.bookcart_monolith.business;

import aakash.monolith.bookcart_monolith.dao.BookCartDaoImpl;
import aakash.monolith.bookcart_monolith.dao.UserDetailsRepository;
import aakash.monolith.bookcart_monolith.dao.model.Order;
import aakash.monolith.bookcart_monolith.dao.model.UserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class OrderBusinessImpl {

  @Autowired
  private InvenetoryBusinessImpl invenetoryBusiness;

  @Autowired
  private UserDetailsBusinessImpl userDetailsBusiness;

  private void orderBook(final Long bookId, final Long quantity){
    // 1. Check the inventory
    Long availableQuantity = invenetoryBusiness.getAvailableQuantity(bookId);

    if(quantity>availableQuantity){
      //"the number of quanity request is not abvaolabel,  available quantity =  " + availble
    }

    // 2. Create an order object
    final Order order = new Order();
    order.setBookId(bookId);
    // quantity = 3
    order.setQuantity(quantity);
    BigDecimal basicPrice = BigDecimal.valueOf(quantity * 200);
    order.setNetOrderPrice(basicPrice);
    // overall
    // overalll price =  basic price + taxes (5.8 F -> 12L)+ delivery charges
    // 3. save the order

  }
   // Biz ->  Helper / worker
// 100 -> active connection ,  100 orders
}

package aakash.monolith.bookcart_monolith.business;

import aakash.monolith.bookcart_monolith.dao.UserDetailsRepository;
import aakash.monolith.bookcart_monolith.dao.model.Order;
import aakash.monolith.bookcart_monolith.dao.model.UserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class UserDetailsBusinessImpl {

  @Autowired
  private UserDetailsRepository userDetailsRepository;

  public UserDetails getUser(final Long id) {

    // getting data from multiple sources/tables
    //



    // close the session connections
    return userDetailsRepository.findById(id);
  }
}

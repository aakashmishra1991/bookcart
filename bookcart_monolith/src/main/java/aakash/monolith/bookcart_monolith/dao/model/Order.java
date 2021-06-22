package aakash.monolith.bookcart_monolith.dao.model;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class Order {
  private Long id;
  private Long userId;
  private Long bookId;
  private Long quantity;
  private BigDecimal netOrderPrice;
  private Date orderDate;
}

package aakash.monolith.bookcart_monolith.dao;

import aakash.monolith.bookcart_monolith.dao.model.UserDetails;
import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserDetailsRepository extends CrudRepository<UserDetails, Long> {



}
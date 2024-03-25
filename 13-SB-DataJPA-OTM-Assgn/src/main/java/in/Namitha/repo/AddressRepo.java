package in.Namitha.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.Namitha.entity.Address;

public interface AddressRepo extends JpaRepository<Address, Integer> {

}

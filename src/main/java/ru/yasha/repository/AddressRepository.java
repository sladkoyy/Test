package ru.yasha.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.yasha.entity.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {
    Address findByName(String name);
}

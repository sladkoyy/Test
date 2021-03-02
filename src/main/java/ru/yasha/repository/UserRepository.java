package ru.yasha.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.yasha.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}

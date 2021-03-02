package ru.yasha.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.yasha.entity.Docs;

@Repository
public interface DocsRepository extends JpaRepository<Docs, Integer> {
}

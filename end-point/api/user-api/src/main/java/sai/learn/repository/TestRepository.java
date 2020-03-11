package sai.learn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sai.learn.entity.TestTable;

@Repository
public interface TestRepository extends JpaRepository<TestTable,Integer> {

}

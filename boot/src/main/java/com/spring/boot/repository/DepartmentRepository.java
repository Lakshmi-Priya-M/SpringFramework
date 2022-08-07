package com.spring.boot.repository;

import com.spring.boot.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

    // JPA repository Interface contains all the method implementations which is basically required to communicate with database.


}

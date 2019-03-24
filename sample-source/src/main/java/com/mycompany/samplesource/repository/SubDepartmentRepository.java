package com.mycompany.samplesource.repository;

import com.mycompany.samplesource.domain.SubDepartment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubDepartmentRepository extends JpaRepository<SubDepartment, Integer> {

}

package com.mycompany.samplesource.repository;

import com.mycompany.samplesource.domain.DepartmentGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentGroupRepository extends JpaRepository<DepartmentGroup, Integer> {

}

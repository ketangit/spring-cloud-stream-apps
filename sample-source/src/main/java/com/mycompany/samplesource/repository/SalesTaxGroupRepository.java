package com.mycompany.samplesource.repository;

import com.mycompany.samplesource.domain.SalesTaxGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalesTaxGroupRepository extends JpaRepository<SalesTaxGroup, Integer> {

}

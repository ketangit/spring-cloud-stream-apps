package com.mycompany.samplesource.repository;

import com.mycompany.samplesource.domain.SizeCodeDefinition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SizeCodeDefinitionRepository extends JpaRepository<SizeCodeDefinition, Integer> {

}

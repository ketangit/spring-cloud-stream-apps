package com.mycompany.samplesource.config;

import com.mycompany.samplesource.domain.Item;
import com.mycompany.samplesource.repository.ItemRepository;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EntityScan(basePackageClasses = {Item.class, Jsr310JpaConverters.class})
@EnableJpaRepositories(basePackageClasses = ItemRepository.class)
@EnableTransactionManagement
@EnableJpaAuditing
@Configuration
public class DomainConfiguration {
}

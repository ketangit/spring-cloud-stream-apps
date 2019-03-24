package com.mycompany.samplesource.config;

import org.springframework.cloud.stream.app.jdbc.source.JdbcSourceConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(JdbcSourceConfiguration.class)
public class SourceStreamConfiguration {
}

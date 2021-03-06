package de.seven.fate.betslip.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * Configuration that enable auditing in JPA.
 */
@Configuration
@EnableJpaAuditing
class JpaAuditingConfiguration {

}
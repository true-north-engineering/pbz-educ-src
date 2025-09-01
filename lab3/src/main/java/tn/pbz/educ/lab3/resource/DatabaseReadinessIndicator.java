package tn.pbz.educ.lab3.resource;

import lombok.AllArgsConstructor;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class DatabaseReadinessIndicator implements HealthIndicator {

  private final JdbcTemplate jdbcTemplate;

  @Override
  public Health health() {
    try {
      // Run a lightweight query
      Integer result = jdbcTemplate.queryForObject("select 1", Integer.class);

      if (result != null && result == 1) {
        return Health.up().withDetail("database", "Ready").build();
      } else {
        return Health.down().withDetail("database", "Unexpected result").build();
      }
    } catch (Exception e) {
      return Health.down().withDetail("database", "Not reachable").build();
    }
  }
}

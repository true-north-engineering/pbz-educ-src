package tn.pbz.educ.lab3.resource;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class AlwaysUpHealthIndicator implements HealthIndicator {
  @Override
  public Health health() {
    return Health.up().build();
  }
}

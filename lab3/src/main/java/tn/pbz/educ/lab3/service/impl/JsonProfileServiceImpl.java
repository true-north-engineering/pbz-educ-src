package tn.pbz.educ.lab3.service.impl;

import org.springframework.context.annotation.Profile;
import tn.pbz.educ.lab3.service.ProfileService;

@Profile("json-logs")
public class JsonProfileServiceImpl implements ProfileService {

  @Override
  public String getProfileMessage() {
    return "json-logs";
  }
}

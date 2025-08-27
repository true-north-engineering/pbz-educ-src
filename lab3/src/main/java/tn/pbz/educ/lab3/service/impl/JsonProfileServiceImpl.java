package tn.pbz.educ.lab3.service.impl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import tn.pbz.educ.lab3.service.ProfileService;

@Service
@Profile("json-logs")
public class JsonProfileServiceImpl implements ProfileService {

  @Override
  public String getProfileMessage() {
    return "json-logs";
  }
}

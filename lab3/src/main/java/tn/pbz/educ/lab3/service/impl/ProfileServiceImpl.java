package tn.pbz.educ.lab3.service.impl;

import org.springframework.context.annotation.Profile;
import tn.pbz.educ.lab3.service.ProfileService;

@Profile("!json-logs")
public class ProfileServiceImpl implements ProfileService {

  @Override
  public String getProfileMessage() {
    return "not json-logs";
  }
}

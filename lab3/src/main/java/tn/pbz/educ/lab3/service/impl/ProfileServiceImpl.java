package tn.pbz.educ.lab3.service.impl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import tn.pbz.educ.lab3.service.ProfileService;

@Service
@Profile("!json-logs")
public class ProfileServiceImpl implements ProfileService {

  @Override
  public String getProfileMessage() {
    return "not json-logs";
  }
}

package tn.pbz.educ.lab3.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import tn.pbz.educ.lab3.service.ProfileValueService;

@Service
public class ProfileValueServiceImpl implements ProfileValueService {

  @Value("${profile.value}")
  String value;

  @Override
  public String getProfileValue() {
    return value;
  }
}

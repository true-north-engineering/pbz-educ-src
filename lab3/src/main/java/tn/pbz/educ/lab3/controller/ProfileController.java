package tn.pbz.educ.lab3.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.pbz.educ.lab3.service.ProfileService;
import tn.pbz.educ.lab3.service.ProfileValueService;

@RestController
@AllArgsConstructor
public class ProfileController {

  private final ProfileService profileService;
  private final ProfileValueService profileValueService;

  @GetMapping("/api/profile")
  public String getProfileMessage() {
    return profileService.getProfileMessage();
  }

  @GetMapping("/api/profile-value")
  public String getProfileValue() {
    return profileValueService.getProfileValue();
  }
}

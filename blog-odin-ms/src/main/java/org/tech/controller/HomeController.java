package org.tech.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HomeController {

  private final static Logger log = LoggerFactory.getLogger(HomeController.class);

  public String home() {
    log.info("Home controller called");
    return "home";
  }

}

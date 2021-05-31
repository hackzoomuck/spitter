package com.habuma.spitter.mvc;

import java.util.Map;
import javax.inject.Inject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
  public static final int DEFAULT_SPITTLES_PER_PAGE = 25;
  private SpitterService spitterService;

  @Inject
  public HomeController(SpitterService spitterService){
    this.spitterService = spitterService;
  }

  @RequestMapping(value={"/","/home"}, method=RequestMethod.GET)
  public String showHomePage(Map<String, Object> model) {
    model.put("spittles",
        spitterService.getRecentSpittles(spittlesPerPage));
    return "home";
  }
}


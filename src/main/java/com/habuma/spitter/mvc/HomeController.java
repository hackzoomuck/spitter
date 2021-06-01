package com.habuma.spitter.mvc;

import com.habuma.spitter.service.SpitterService;
import java.util.Map;
import javax.inject.Inject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

// 컨트롤러로 선언
@Controller
//public class HomeController {
//  private SpitterService spitterService;
//
//  // 스피터서비스 주입
//  @Inject
//  public HomeController(SpitterService spitterService){
//    this.spitterService = spitterService;
//  }
//
//  // 홈페이지에 대한 요청 처리
//  @RequestMapping(value={"/","/home"}, method=RequestMethod.GET)
//  public String showHomePage(Map<String, Object> model) {
//    // 스피틀을 모델에 배치
//    model.put("spittles",
//        spitterService.getRecentSpittles(spittlesPerPage));
//    // 뷰 이름 반환
//    return "home";
//  }
//  public static final int DEFAULT_SPITTLES_PER_PAGE = 25;
//  private int spittlesPerPage = DEFAULT_SPITTLES_PER_PAGE;
//}
public class HomeController {
  @RequestMapping(value = "/")
  public String home() {
    return "plz";
  }
}

package pt.meistre.soft.i18n.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WebController {
 
   @RequestMapping(value = "/", method = RequestMethod.GET)
   public String home() {
     
      return "redirect:app/home.htm";
   }
   
}

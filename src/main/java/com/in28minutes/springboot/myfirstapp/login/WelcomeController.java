package com.in28minutes.springboot.myfirstapp.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class WelcomeController {

//    private AuthenticationService authenticationService;
//
//    public LoginController(AuthenticationService authenticationService) {
//        super();
//        this.authenticationService = authenticationService;
//    }
    //    private Logger logger = LoggerFactory.getLogger(getClass());
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String gotoWelcomePage(ModelMap model){
//        model.put("name",name);
//        logger.debug("Request param is {}",name);
//        logger.info("I want this printed at info level");
//        logger.warn("I want this printed at warn level");
//        System.out.println("Request param is "+name);
        model.put("name",getLoggedInUsername());
        return "welcome";
    }

    private String getLoggedInUsername(){
        Authentication authentication =
                SecurityContextHolder.getContext().getAuthentication();
        return authentication.getName();
    }

//    @RequestMapping(value = "login",method = RequestMethod.POST)
//    public String gotoWelcomePage(@RequestParam String name,
//                                  @RequestParam String password,ModelMap model){
//
//        if(authenticationService.authenticate(name,password)){
//            model.put("name", name);
//            model.put("password",password);
//            //Authentication
//            //name - wanpin
//            //password - 1234
//            return "welcome";
//        }
//        model.put("errorMessage","Invalid Credentials! Please try again.");return "login";
//    }


}

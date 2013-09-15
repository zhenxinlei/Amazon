package com.amazon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.WebAuthenticationDetails;
import org.springframework.security.web.savedrequest.RequestCache;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller	
public class RegistrationController {
	

   /* @Autowired
    RequestCache requestCache;

    @Autowired
    protected AuthenticationManager authenticationManager;*/

    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String registration(/*@ModelAttribute("user") User user, BindingResult result,  HttpServletRequest request, HttpServletResponse response*/)
    {
     /*   //After successfully Creating user
            authenticateUserAndSetSession(user, request);*/

        return "registration";
    }
    
   /* @RequestMapping(value="/signUp",method=RequestMethod.GET)
    public String signUpUser()
    {
    	return "welcome";
    }*/

/*    private void authenticateUserAndSetSession(User user,
        HttpServletRequest request)
{
    UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(
            user.getUsername(), user.getPassword());

    // generate session if one doesn't exist
    request.getSession();

    token.setDetails(new WebAuthenticationDetails(request));
    Authentication authenticatedUser = authenticationManager.authenticate(token);

    SecurityContextHolder.getContext().setAuthentication(authenticatedUser);
}
*/
}


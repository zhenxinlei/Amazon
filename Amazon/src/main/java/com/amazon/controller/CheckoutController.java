package com.amazon.controller;

import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.amazon.entity.Book;
import com.amazon.service.CheckoutService;

@Controller
@RequestMapping("/Checkout")
public class CheckoutController {
	@Autowired
	private CheckoutService checkoutService;
	
	@RequestMapping(value="/Homepage",method=RequestMethod.POST)
	public String completeOrder(@Valid ArrayList<Book> order,BindingResult result){
		if(result.hasErrors()){
			return "Homepage";
		}else {		
			return "Confirmation";
		}
	}
	@RequestMapping(method=RequestMethod.GET)
		public String displayBookList(ModelMap model){ 
			model.addAttribute("order", new ArrayList<Book>());
			return "Homepage";
		}
}

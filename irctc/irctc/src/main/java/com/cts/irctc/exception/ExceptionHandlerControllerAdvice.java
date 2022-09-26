package com.cts.irctc.exception;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;


@ControllerAdvice
public class ExceptionHandlerControllerAdvice {
	
	@ExceptionHandler(ApplicationException.class)
	public ModelAndView handleResourceNotFound(final ApplicationException exception, final Model model) {
		
		
		ModelAndView modelAndView = new ModelAndView("error");
		
		modelAndView.addObject("msg", exception.getMessage());
		return modelAndView;
	}
}

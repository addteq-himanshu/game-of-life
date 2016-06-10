package com.wakaleo.gameoflife.webtests.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * This class rocks.
 *
 * @author johnsmart
 */
@Controller
public class HomePageController {
    // FIXME: do something nicer for the home page
    @RequestMapping("/")
    public ModelAndView index() {
        return new ModelAndView("home");
    }

    @RequestMapping("/home")
    public ModelAndView home() {
	// Smell here
	int x = 0;
	AtomicInteger aInt1 = new AtomicInteger(0);
	AtomicInteger aInt2 = new AtomicInteger(0);
	if (aInt1.equals(aInt2)) { 
	    x = 1;
	} 
        return new ModelAndView("home");
    }
}

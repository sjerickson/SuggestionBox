package edu.dmacc.erickson.suggestionbox;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SuggestionController {
	@Autowired
	SuggestionDao dao;

	@RequestMapping(value = "/form")
	public ModelAndView suggestion() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("suggestionForm");
		modelAndView.addObject("suggestion", new Suggestion());
		return modelAndView;
	}

	@RequestMapping(value = "/result")
	public ModelAndView processSuggestion(Suggestion suggestion) {
		System.out.println("In processUser");
		ModelAndView modelAndView = new ModelAndView();
		dao.insertSuggestion(suggestion);
		modelAndView.setViewName("suggestionResult");
		modelAndView.addObject("s", suggestion);
		return modelAndView;
	}

	@Bean
	public SuggestionDao dao() {
		SuggestionDao bean = new SuggestionDao();
		return bean;
	}

	@RequestMapping(value = "/viewAll")
	public ModelAndView viewAll() {
		ModelAndView modelAndView = new ModelAndView();
		List<Suggestion> allSuggestions = dao.getAllSuggestions();
		modelAndView.setViewName("viewAllSuggestions");
		modelAndView.addObject("all", allSuggestions);
		return modelAndView;
	}
}

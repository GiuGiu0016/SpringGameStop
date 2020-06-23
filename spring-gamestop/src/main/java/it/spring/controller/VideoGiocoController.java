package it.spring.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import it.spring.model.VideoGioco;
import it.spring.service.VideogiocoService;

@Controller
public class VideoGiocoController {
	
	@Autowired 
	private VideogiocoService videogiocoService;
	
	@RequestMapping(value = {"/","/homeVideogiochi"})
	public ModelAndView home() {
		List<VideoGioco> listaVideogiochi = videogiocoService.listAll();
		ModelAndView mav = new ModelAndView("index");
		mav.addObject("listaVideogiochi",listaVideogiochi);
		return mav;
	}
	
	@RequestMapping("/new")
	public String newForm(Map<String, Object> model) {
		VideoGioco videogioco = new VideoGioco();
		model.put("videogioco", videogioco);
		return "new";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveForm(@ModelAttribute("videogioco") VideoGioco videogioco) {
		videogiocoService.save(videogioco);
		return "redirect:/";
	}
	
	@RequestMapping("/edit")
	public ModelAndView editForm(@RequestParam long id) {
		ModelAndView mav = new ModelAndView("edit");
		VideoGioco videogioco = videogiocoService.get(id);
		mav.addObject("videogioco", videogioco);
		return mav;
	}
	
	@RequestMapping("/delete")
	public String deleteForm(@RequestParam long id) {
		videogiocoService.delete(id);
		return "redirect:/";		
	}
	
	@RequestMapping("/search")
	public ModelAndView search(@RequestParam String keyword) {
		List<VideoGioco> result = videogiocoService.search(keyword);
		ModelAndView mav = new ModelAndView("search");
		mav.addObject("result", result);
		return mav;		
	}	
}

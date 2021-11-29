package tacos.web;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import lombok.extern.slf4j.Slf4j;
import tacos.Order;

@Slf4j
@Controller
@RequestMapping("/orders") 
public class DesignOrdersController {
	
	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(DesignTacoController.class); 
    
	@GetMapping("/current")
	public String showOrderForm(Model model) {
		model.addAttribute("order", new Order());
		return "orders";
	}
	
	@PostMapping
	public String processOrder(@Valid Order order, Errors errors) {
		if (errors.hasErrors()) {
		    log.info("Order Errors encountered: " + errors);
		    System.out.print("Error with order!");
			return "orders";
		}
		log.info("Order submited" + order);
		return "redirect:/";
	}

}

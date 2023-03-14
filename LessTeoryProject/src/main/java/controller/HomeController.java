package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	@GetMapping("/") //dice che questo metodo seguente risponde ad un determinato path
	@ResponseBody  //tutto il contenuto di questo metodo verrà restituito all'utente
	public String index() {
					return "800A";
			}
}

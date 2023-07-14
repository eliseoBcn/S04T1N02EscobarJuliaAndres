package cat.itacademy.barcelonactiva.escobarjulia.andres.s04.t01.n02.controllers;

import org.apache.commons.lang3.StringUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

 
 
@RestController
public class HelloWorldController  {

			public HelloWorldController() {
				// TODO Auto-generated constructor stub
			}

		      @GetMapping("/HelloWorld")
		      public String saluda(@RequestParam(value = "name", defaultValue = "UNKNOWN") String name) {
		        return String.format("Hola, " + name  + ". Estás ejecutando un proyecto Gradle");
	 
		      }
		      
		      
		      @RequestMapping(value = { "/HelloWorld2" , "/HelloWorld2/{type}"}, method = RequestMethod.GET)
		      public   String  saluda2(@PathVariable(required = false) String  type ) {      
		    	  if (!(type == null) ) {
		  	        return String.format("Hola, " + type   + ". Estás ejecutando un proyecto Gradle");
		          };
		          
		          return String.format("Hola . Estas ejecutando un proyecto Gradle");
		      }
		      
		      @GetMapping({  "/HelloWorld3" , "/HelloWorld3/{type}",})
		      public String saluda3(@PathVariable(name = "type", required = false) String type) {
		          if (StringUtils.isEmpty(type)) {
		              type = "";
		          }
		          return String.format("Hola, " + type   + ". Estás ejecutando un proyecto Gradle");
		      }
}

import java.util.HashMap;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";


    get("/", (request, response) -> {
	  HashMap model = new HashMap();
	  model.put("template", "templates/form.vtl");
	  return new ModelAndView(model, layout);
	}, new VelocityTemplateEngine());
   
    get("/results", (request, response) -> {
	  HashMap model = new HashMap();
	  SubVowel subInstance = new SubVowel();
	  String userInput = request.queryParams("user-input"); 
	  request.session().attribute("user-input", userInput);   
	  model.put("coded-input", subInstance.returnVowelSub(userInput));
	  model.put("template", "templates/results.vtl");
	  return new ModelAndView(model, layout);
	}, new VelocityTemplateEngine());

    post("/hint", (request, response) -> {
	  HashMap model = new HashMap();
	  SubVowel subInstance = new SubVowel();
	  String userInput = request.session().attribute("user-input");  
	  int counter = 1;
	  String hint = subInstance.returnHint(userInput);
	  model.put("coded-input", subInstance.returnVowelSub(userInput));
	  model.put("hint", hint);
	  model.put("counter", counter);
	  model.put("template", "templates/results.vtl");
	  return new ModelAndView(model, layout);
	}, new VelocityTemplateEngine());
  }  
}
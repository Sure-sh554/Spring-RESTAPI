package com.SpringBootRESTAPI.SpringBootRESTAPI.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//@ResponseBody
@RestController  // @RestController is a combination of the above two annotations
public class HelloWorldController {
    //http://localhost:8080/hello-world
@GetMapping("hello-world")
    public  String helloWorld(){
        return  "Hello....";
    }


}

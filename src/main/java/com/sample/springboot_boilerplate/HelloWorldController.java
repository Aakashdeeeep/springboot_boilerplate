package com.sample.springboot_boilerplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
class HelloWorldController {

    // This method will handle GET requests to "/hello" and return "Hello World"
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello World";
    }
    @GetMapping("/array")
    public String[] say(){
        String[] array={"praneet","pranaav","syed","aadhi","kiran","sheeeeeeeeeeeeeesh"};
        return array;
    }

}


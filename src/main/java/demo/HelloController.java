package demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController
{
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String sayHello ()
    {
        // test from apples
        return "hello to you on " + new java.util.Date();
    }
}

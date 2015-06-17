package demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController
{
    /*
     * Method to show todays date
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String sayHello ()
    {
        return "hello to you on " + new java.util.Date();
    }
}

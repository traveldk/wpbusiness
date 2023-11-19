package az.traveldk.wpbusiness.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
public class WebHookController {

    @GetMapping("test")
    public String webHookTest(){
        return "Hello from Webhook";
    }
}

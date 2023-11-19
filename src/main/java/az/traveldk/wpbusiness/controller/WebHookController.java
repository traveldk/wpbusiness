package az.traveldk.wpbusiness.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RequestMapping
@RestController
public class WebHookController {

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("healthCheck")
    public void healthCheck() {
    }

    @ResponseStatus(HttpStatus.ACCEPTED)
    @PostMapping("webhook")
    public void webhook(Object request) {
        System.out.println(request);
    }
}

package az.traveldk.wpbusiness.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import static az.traveldk.wpbusiness.consts.HubChallengeEnum.YARASA;

@RequestMapping
@RestController
public class WebHookController {

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("healthCheck")
    public void healthCheck() {
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("webhooks")
    public int confirm(
            @RequestParam("hub.mode") String hubMode,
            @RequestParam("hub.challenge") int hubChallenge,
            @RequestParam("hub.verify_token") String hubVerifyToken
    ) {
        if (hubVerifyToken.equals(YARASA.name()))
            return hubChallenge;

        return 0;
    }

    @ResponseStatus(HttpStatus.OK)
    @PostMapping("webhooks")
    public void webhook(Object request) {
        System.out.println(request);
    }
}

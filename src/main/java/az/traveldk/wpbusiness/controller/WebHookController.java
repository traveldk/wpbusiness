package az.traveldk.wpbusiness.controller;

import az.traveldk.wpbusiness.dto.request.WebhookDataDto;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import static az.traveldk.wpbusiness.consts.HubChallengeEnum.YARASA;

@RestController
@RequestMapping("/api/v1")
public class WebHookController {

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("health-check")
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

    @SneakyThrows
    @ResponseStatus(HttpStatus.OK)
    @PostMapping("webhooks")
    public void postHookData(@RequestBody WebhookDataDto request) {
        String requestBody = new ObjectMapper().writeValueAsString(request);
        System.out.println("Received Request: " + requestBody);
    }
}

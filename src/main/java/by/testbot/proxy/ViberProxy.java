package by.testbot.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;

import by.testbot.payload.requests.SendTextMessageRequest;
import by.testbot.payload.requests.SetWebhookRequest;
import by.testbot.payload.responses.SetWebhookResponse;

@Component
@FeignClient(name = "VIBER-PROXY", url = "https://chatapi.viber.com/pa")
public interface ViberProxy {
    @PostMapping("/set_webhook")
    public SetWebhookResponse setWebhook(@RequestHeader("X-Viber-Auth-Token") String authenticationToken, SetWebhookRequest setWebhookRequest);

    @PostMapping("/send_message")
    public void sendTextMessage(@RequestHeader("X-Viber-Auth-Token") String authenticationToken, SendTextMessageRequest sendTextMessage);
}

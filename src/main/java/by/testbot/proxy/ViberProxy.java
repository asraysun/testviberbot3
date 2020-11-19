package by.testbot.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;

import by.testbot.payload.requests.SendContactMessageRequest;
import by.testbot.payload.requests.SendFileMessageRequest;
import by.testbot.payload.requests.SendLocationMessageRequest;
import by.testbot.payload.requests.SendPictureMessageRequest;
import by.testbot.payload.requests.SendStickerMessageRequest;
import by.testbot.payload.requests.SendTextMessageRequest;
import by.testbot.payload.requests.SendUrlMessageRequest;
import by.testbot.payload.requests.SendVideoMessageRequest;
import by.testbot.payload.requests.SetWebhookRequest;
import by.testbot.payload.responses.SendMessageResponse;
import by.testbot.payload.responses.SetWebhookResponse;

@Component
@FeignClient(name = "VIBER-PROXY", url = "https://chatapi.viber.com/pa")
public interface ViberProxy {
    @PostMapping("/set_webhook")
    public SetWebhookResponse setWebhook(@RequestHeader("X-Viber-Auth-Token") String authenticationToken, SetWebhookRequest setWebhookRequest);

    @PostMapping("/send_message")
    public SendMessageResponse sendTextMessage(@RequestHeader("X-Viber-Auth-Token") String authenticationToken, SendTextMessageRequest sendTextMessage);

    @PostMapping("/send_message")
    public SendMessageResponse sendPictureMessage(@RequestHeader("X-Viber-Auth-Token") String authenticationToken, SendPictureMessageRequest sendPictureMessageRequest);

    @PostMapping("/send_message")
    public SendMessageResponse sendVideoMessage(@RequestHeader("X-Viber-Auth-Token") String authenticationToken, SendVideoMessageRequest sendVideoMessageRequest);

    @PostMapping("/send_message")
    public SendMessageResponse sendFileMessage(@RequestHeader("X-Viber-Auth-Token") String authenticationToken, SendFileMessageRequest sendFileMessageRequest);

    @PostMapping("/send_message")
    public SendMessageResponse sendContactMessage(@RequestHeader("X-Viber-Auth-Token") String authenticationToken, SendContactMessageRequest sendContactMessageRequest);

    @PostMapping("/send_message")
    public SendMessageResponse sendLocationMessage(@RequestHeader("X-Viber-Auth-Token") String authenticationToken, SendLocationMessageRequest sendLocationMessageRequest);

    @PostMapping("/send_message")
    public SendMessageResponse sendUrlMessage(@RequestHeader("X-Viber-Auth-Token") String authenticationToken, SendUrlMessageRequest sendUrlMessageRequest);

    @PostMapping("/send_message")
    public SendMessageResponse sendStickerMessage(@RequestHeader("X-Viber-Auth-Token") String authenticationToken, SendStickerMessageRequest sendStickerMessageRequest);
}

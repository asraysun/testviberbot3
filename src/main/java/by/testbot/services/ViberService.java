package by.testbot.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import by.testbot.bot.BotContext;
import by.testbot.bot.BotState;
import by.testbot.models.ViberUpdate;
import by.testbot.models.enums.Status;
import by.testbot.payload.requests.SendTextMessageRequest;
import by.testbot.payload.requests.SetWebhookRequest;
import by.testbot.payload.responses.SetWebhookResponse;
import by.testbot.proxy.ViberProxy;
import by.testbot.utils.Utils;

@Service
public class ViberService {
    private static final Logger logger = LoggerFactory.getLogger(ViberService.class);
    
    @Autowired
    private ViberProxy viberProxy;

    @Value("${testbot.authenticationToken}")
    private String authenticationToken;

    @Value("${testbot.webhookUrl}")
    private String webhookUrl;

    public void setWeebhook() {
        if (authenticationToken == null || authenticationToken.isEmpty() || authenticationToken.isBlank()) {
            logger.error("Authentication token has invalid type.");
            return;
        }
        if (webhookUrl == null || webhookUrl.isEmpty() || webhookUrl.isBlank()) {
            logger.error("Webhook url has invalid type.");
        }

        SetWebhookRequest setWebhookRequest = new SetWebhookRequest();

        setWebhookRequest.setUrl(webhookUrl);
        setWebhookRequest.setEventTypes(Utils.getAllEventTypes());
        setWebhookRequest.setSendName(true);
        setWebhookRequest.setSendPhoto(true);

        SetWebhookResponse setWebhookResponse = viberProxy.setWebhook(authenticationToken, setWebhookRequest);

        if (setWebhookResponse.getStatus() == Status.OK) {
            logger.info("Webhook setted with response: " + setWebhookResponse.getStatusMessage() + ", events: " + setWebhookResponse.getEventTypes());
        }
        else {
            logger.warn("Webhook not setted with code: " + setWebhookResponse.getStatus() + ", with message: " + setWebhookResponse.getStatusMessage());
        }
    }

    public void sendTextMessage(SendTextMessageRequest sendTextMessageRequest) {
        // send message logic
    }

    public void handleUpdate(ViberUpdate viberUpdate) {
        if (viberUpdate.hasDeliveredCallback()) {
            // handle callback
        }
        else if (viberUpdate.hasSeenCallback()) {
            // handle callback
        }
        else if (viberUpdate.hasFailedCallback()) {
            // handle callback
        }
        else if (viberUpdate.hasSubscribedCallback()) {
            // handle callback
        }
        else if (viberUpdate.hasUnsubscribedCallback()) {
            // handle callback
        }
        else if (viberUpdate.hasConversationStartedCallback()) {
            // handle callback


            BotState botState = BotState.ConversationStarted;
            BotContext botContext = BotContext.of(this, viberUpdate.getConversationStartedCallback());

            botState.enter(botContext);
        }
        else if (viberUpdate.hasWebhookCallback()) {
            // handle callback
        }
        else if (viberUpdate.hasMessageCallback()) {
            // handle callback
        }
    }


}

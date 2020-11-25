package by.testbot.services;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import by.testbot.models.ViberUpdate;
import by.testbot.models.enums.EventType;
import by.testbot.payload.callbacks.ConversationStartedCallback;
import by.testbot.payload.callbacks.DeliveredCallback;
import by.testbot.payload.callbacks.FailedCallback;
import by.testbot.payload.callbacks.MessageCallback;
import by.testbot.payload.callbacks.SeenCallback;
import by.testbot.payload.callbacks.SubscribedCallback;
import by.testbot.payload.callbacks.UnsubscribedCallback;
import by.testbot.payload.callbacks.WebhookCallback;
import lombok.SneakyThrows;

@Service
public class WebhookService {
    @Autowired
    private ViberService viberService;

    public void onWebhookUpdateReceived(JSONObject update) {
        Object callback = tryParseJson(update);
        ViberUpdate viberUpdate = new ViberUpdate();

        if (callback instanceof DeliveredCallback) {
            viberUpdate.setDeliveredCallback((DeliveredCallback)callback);
        }
        else if (callback instanceof SeenCallback) {
            viberUpdate.setSeenCallback((SeenCallback)callback);
        }
        else if (callback instanceof FailedCallback) {
            viberUpdate.setFailedCallback((FailedCallback)callback);
        }
        else if (callback instanceof SubscribedCallback) {
            viberUpdate.setSubscribedCallback((SubscribedCallback)callback);
        }
        else if (callback instanceof UnsubscribedCallback) {
            viberUpdate.setUnsubscribedCallback((UnsubscribedCallback)callback);
        }
        else if (callback instanceof ConversationStartedCallback) {
            viberUpdate.setConversationStartedCallback((ConversationStartedCallback)callback);
        }
        else if (callback instanceof WebhookCallback) {
            viberUpdate.setWebhookCallback((WebhookCallback)callback);
        }
        else if (callback instanceof MessageCallback) {
            viberUpdate.setMessageCallback((MessageCallback)callback);
        }
        else {
            throw new IllegalArgumentException("Could not find type of callback.");
        }

        viberService.handleUpdate(viberUpdate);
    }

    private Object tryParseJson(JSONObject update) {
        EventType eventType = EventType.fromString(update.getString("event"));
        
        switch(eventType) {
            case DELIVERED:
                return tryParseDeliveredCallback(update); 
            case SEEN:
                return tryParseSeenCallback(update);
            case FAILED:
                return tryParseFailedCallback(update);
            case SUBSCRIBED:
                return tryParseSubscribedCallback(update);
            case UNSUBSCRIBED:
                return tryParseUnsubscribedCallback(update);
            case CONVERSATION_STARTED:
                return tryParseConversationStartedCallback(update);
            case WEBHOOK:
                return tryParseWebhookCallback(update);
            case MESSAGE:
                return tryParseMessageCallback(update);
            default:
                throw new IllegalArgumentException("Could not find type of callback.");
        }
    }

    @SneakyThrows
    private DeliveredCallback tryParseDeliveredCallback(JSONObject object) {
        return new ObjectMapper().readValue(object.toString(), DeliveredCallback.class);
    }       

    @SneakyThrows
    private SeenCallback tryParseSeenCallback(JSONObject object) {
        return new ObjectMapper().readValue(object.toString(), SeenCallback.class);
    }

    @SneakyThrows
    private FailedCallback tryParseFailedCallback(JSONObject object) {
        return new ObjectMapper().readValue(object.toString(), FailedCallback.class);
    }

    @SneakyThrows
    private SubscribedCallback tryParseSubscribedCallback(JSONObject object) {
        return new ObjectMapper().readValue(object.toString(), SubscribedCallback.class);
    }

    @SneakyThrows
    private UnsubscribedCallback tryParseUnsubscribedCallback(JSONObject object) {
        return new ObjectMapper().readValue(object.toString(), UnsubscribedCallback.class);
    }

    @SneakyThrows
    private ConversationStartedCallback tryParseConversationStartedCallback(JSONObject object) {
        return new ObjectMapper().readValue(object.toString(), ConversationStartedCallback.class);
    }

    @SneakyThrows
    private WebhookCallback tryParseWebhookCallback(JSONObject object) {
        return new ObjectMapper().readValue(object.toString(), WebhookCallback.class);
    }

    @SneakyThrows
    private MessageCallback tryParseMessageCallback(JSONObject object) {    
        return new ObjectMapper().readValue(object.toString(), MessageCallback.class);
    }
}

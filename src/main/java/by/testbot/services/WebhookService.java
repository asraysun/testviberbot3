package by.testbot.services;

import com.google.gson.Gson;

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
            throw new IllegalArgumentException();
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
                throw new IllegalArgumentException();
        }
    }

    private DeliveredCallback tryParseDeliveredCallback(JSONObject object) {
        return new Gson().fromJson(object.toString(), DeliveredCallback.class);
    }       

    private SeenCallback tryParseSeenCallback(JSONObject object) {
        return new Gson().fromJson(object.toString(), SeenCallback.class);
    }

    private FailedCallback tryParseFailedCallback(JSONObject object) {
        return new Gson().fromJson(object.toString(), FailedCallback.class);
    }

    private SubscribedCallback tryParseSubscribedCallback(JSONObject object) {
        return new Gson().fromJson(object.toString(), SubscribedCallback.class);
    }

    private UnsubscribedCallback tryParseUnsubscribedCallback(JSONObject object) {
        return new Gson().fromJson(object.toString(), UnsubscribedCallback.class);
    }

    private ConversationStartedCallback tryParseConversationStartedCallback(JSONObject object) {
        return new Gson().fromJson(object.toString(), ConversationStartedCallback.class);
    }

    private WebhookCallback tryParseWebhookCallback(JSONObject object) {
        return new Gson().fromJson(object.toString(), WebhookCallback.class);
    }

    private MessageCallback tryParseMessageCallback(JSONObject object) {    
        return new Gson().fromJson(object.toString(), MessageCallback.class);
    }
}

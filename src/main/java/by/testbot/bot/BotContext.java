package by.testbot.bot;

import by.testbot.payload.callbacks.ConversationStartedCallback;
import by.testbot.payload.callbacks.DeliveredCallback;
import by.testbot.payload.callbacks.FailedCallback;
import by.testbot.payload.callbacks.MessageCallback;
import by.testbot.payload.callbacks.SeenCallback;
import by.testbot.payload.callbacks.SubscribedCallback;
import by.testbot.payload.callbacks.UnsubscribedCallback;
import by.testbot.payload.callbacks.WebhookCallback;
import by.testbot.services.ViberService;
import lombok.Getter;

@Getter
public class BotContext {
    private final ViberService viberService;
    private final ConversationStartedCallback conversationStartedCallback;
    private final DeliveredCallback deliveredCallback;
    private final FailedCallback failedCallback;
    private final MessageCallback messageCallback;
    private final SeenCallback seenCallback;
    private final SubscribedCallback subscribedCallback;
    private final UnsubscribedCallback unsubscribedCallback;
    private final WebhookCallback webhookCallback;

    private BotContext(ViberService viberService, ConversationStartedCallback conversationStartedCallback) {
        this.viberService = viberService;
        this.conversationStartedCallback = conversationStartedCallback;
        this.deliveredCallback = null;
        this.failedCallback = null;
        this.messageCallback = null;
        this.seenCallback = null;
        this.subscribedCallback = null;
        this.unsubscribedCallback = null;
        this.webhookCallback = null;
    }

    private BotContext(ViberService viberService, DeliveredCallback deliveredCallback) {
        this.viberService = viberService;
        this.conversationStartedCallback = null;
        this.deliveredCallback = deliveredCallback;
        this.failedCallback = null;
        this.messageCallback = null;
        this.seenCallback = null;
        this.subscribedCallback = null;
        this.unsubscribedCallback = null;
        this.webhookCallback = null;
    }

    private BotContext(ViberService viberService, FailedCallback failedCallback) {
        this.viberService = viberService;
        this.conversationStartedCallback = null;
        this.deliveredCallback = null;
        this.failedCallback = failedCallback;
        this.messageCallback = null;
        this.seenCallback = null;
        this.subscribedCallback = null;
        this.unsubscribedCallback = null;
        this.webhookCallback = null;
    }

    private BotContext(ViberService viberService, MessageCallback messageCallback) {
        this.viberService = viberService;
        this.conversationStartedCallback = null;
        this.deliveredCallback = null;
        this.failedCallback = null;
        this.messageCallback = messageCallback;
        this.seenCallback = null;
        this.subscribedCallback = null;
        this.unsubscribedCallback = null;
        this.webhookCallback = null;
    }

    private BotContext(ViberService viberService, SeenCallback seenCallback) {
        this.viberService = viberService;
        this.conversationStartedCallback = null;
        this.deliveredCallback = null;
        this.failedCallback = null;
        this.messageCallback = null;
        this.seenCallback = seenCallback;
        this.subscribedCallback = null;
        this.unsubscribedCallback = null;
        this.webhookCallback = null;
    }

    private BotContext(ViberService viberService, SubscribedCallback subscribedCallback) {
        this.viberService = viberService;
        this.conversationStartedCallback = null;
        this.deliveredCallback = null;
        this.failedCallback = null;
        this.messageCallback = null;
        this.seenCallback = null;
        this.subscribedCallback = subscribedCallback;
        this.unsubscribedCallback = null;
        this.webhookCallback = null;
    }

    private BotContext(ViberService viberService, UnsubscribedCallback unsubscribedCallback) {
        this.viberService = viberService;
        this.conversationStartedCallback = null;
        this.deliveredCallback = null;
        this.failedCallback = null;
        this.messageCallback = null;
        this.seenCallback = null;
        this.subscribedCallback = null;
        this.unsubscribedCallback = unsubscribedCallback;
        this.webhookCallback = null;
    }

    private BotContext(ViberService viberService, WebhookCallback webhookCallback) {
        this.viberService = viberService;
        this.conversationStartedCallback = null;
        this.deliveredCallback = null;
        this.failedCallback = null;
        this.messageCallback = null;
        this.seenCallback = null;
        this.subscribedCallback = null;
        this.unsubscribedCallback = null;
        this.webhookCallback = webhookCallback;
    }

    public static BotContext of(ViberService viberService, ConversationStartedCallback conversationStartedCallback) {
        return new BotContext(viberService, conversationStartedCallback);
    }

    public static BotContext of(ViberService viberService, DeliveredCallback deliveredCallback) {
        return new BotContext(viberService, deliveredCallback);
    }

    public static BotContext of(ViberService viberService, FailedCallback failedCallback) {
        return new BotContext(viberService, failedCallback);
    }

    public static BotContext of(ViberService viberService, MessageCallback messageCallback) {
        return new BotContext(viberService, messageCallback);
    }

    public static BotContext of(ViberService viberService, SeenCallback seenCallback) {
        return new BotContext(viberService, seenCallback);
    }

    public static BotContext of(ViberService viberService, SubscribedCallback subscribedCallback) {
        return new BotContext(viberService, subscribedCallback);
    }

    public static BotContext of(ViberService viberService, UnsubscribedCallback unsubscribedCallback) {
        return new BotContext(viberService, unsubscribedCallback);
    }

    public static BotContext of(ViberService viberService, WebhookCallback webhookCallback) {
        return new BotContext(viberService, webhookCallback);
    }
}

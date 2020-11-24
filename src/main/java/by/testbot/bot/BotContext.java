package by.testbot.bot;

import by.testbot.payload.callbacks.ConversationStartedCallback;
import by.testbot.payload.callbacks.DeliveredCallback;
import by.testbot.payload.callbacks.FailedCallback;
import by.testbot.payload.callbacks.MessageCallback;
import by.testbot.payload.callbacks.SeenCallback;
import by.testbot.payload.callbacks.SubscribedCallback;
import by.testbot.payload.callbacks.UnsubscribedCallback;
import by.testbot.payload.callbacks.WebhookCallback;
import by.testbot.services.MessageService;
import by.testbot.services.ViberService;
import by.testbot.services.KeyboardService;
import lombok.Getter;

@Getter
public class BotContext {
    private final ViberService viberService;
    private final MessageService messageService;
    private final KeyboardService KeyboardService;
    private final ConversationStartedCallback conversationStartedCallback;
    private final DeliveredCallback deliveredCallback;
    private final FailedCallback failedCallback;
    private final MessageCallback messageCallback;
    private final SeenCallback seenCallback;
    private final SubscribedCallback subscribedCallback;
    private final UnsubscribedCallback unsubscribedCallback;
    private final WebhookCallback webhookCallback;

    private BotContext(ViberService viberService, MessageService messageService, KeyboardService keyboardService, ConversationStartedCallback conversationStartedCallback) {
        this.viberService = viberService;
        this.messageService = messageService;
        this.KeyboardService = keyboardService;
        this.conversationStartedCallback = conversationStartedCallback;
        this.deliveredCallback = null;
        this.failedCallback = null;
        this.messageCallback = null;
        this.seenCallback = null;
        this.subscribedCallback = null;
        this.unsubscribedCallback = null;
        this.webhookCallback = null;
    }

    private BotContext(ViberService viberService, MessageService messageService, KeyboardService keyboardService, DeliveredCallback deliveredCallback) {
        this.viberService = viberService;
        this.messageService = messageService;
        this.KeyboardService = keyboardService;
        this.conversationStartedCallback = null;
        this.deliveredCallback = deliveredCallback;
        this.failedCallback = null;
        this.messageCallback = null;
        this.seenCallback = null;
        this.subscribedCallback = null;
        this.unsubscribedCallback = null;
        this.webhookCallback = null;
    }

    private BotContext(ViberService viberService, MessageService messageService, KeyboardService keyboardService, FailedCallback failedCallback) {
        this.viberService = viberService;
        this.messageService = messageService;
        this.KeyboardService = keyboardService;
        this.conversationStartedCallback = null;
        this.deliveredCallback = null;
        this.failedCallback = failedCallback;
        this.messageCallback = null;
        this.seenCallback = null;
        this.subscribedCallback = null;
        this.unsubscribedCallback = null;
        this.webhookCallback = null;
    }

    private BotContext(ViberService viberService, MessageService messageService, KeyboardService keyboardService, MessageCallback messageCallback) {
        this.viberService = viberService;
        this.messageService = messageService;
        this.KeyboardService = keyboardService;
        this.conversationStartedCallback = null;
        this.deliveredCallback = null;
        this.failedCallback = null;
        this.messageCallback = messageCallback;
        this.seenCallback = null;
        this.subscribedCallback = null;
        this.unsubscribedCallback = null;
        this.webhookCallback = null;
    }

    private BotContext(ViberService viberService, MessageService messageService, KeyboardService keyboardService, SeenCallback seenCallback) {
        this.viberService = viberService;
        this.messageService = messageService;
        this.KeyboardService = keyboardService;
        this.conversationStartedCallback = null;
        this.deliveredCallback = null;
        this.failedCallback = null;
        this.messageCallback = null;
        this.seenCallback = seenCallback;
        this.subscribedCallback = null;
        this.unsubscribedCallback = null;
        this.webhookCallback = null;
    }

    private BotContext(ViberService viberService, MessageService messageService, KeyboardService keyboardService, SubscribedCallback subscribedCallback) {
        this.viberService = viberService;
        this.messageService = messageService;
        this.KeyboardService = keyboardService;
        this.conversationStartedCallback = null;
        this.deliveredCallback = null;
        this.failedCallback = null;
        this.messageCallback = null;
        this.seenCallback = null;
        this.subscribedCallback = subscribedCallback;
        this.unsubscribedCallback = null;
        this.webhookCallback = null;
    }

    private BotContext(ViberService viberService, MessageService messageService, KeyboardService keyboardService, UnsubscribedCallback unsubscribedCallback) {
        this.viberService = viberService;
        this.messageService = messageService;
        this.KeyboardService = keyboardService;
        this.conversationStartedCallback = null;
        this.deliveredCallback = null;
        this.failedCallback = null;
        this.messageCallback = null;
        this.seenCallback = null;
        this.subscribedCallback = null;
        this.unsubscribedCallback = unsubscribedCallback;
        this.webhookCallback = null;
    }

    private BotContext(ViberService viberService, MessageService messageService, KeyboardService keyboardService, WebhookCallback webhookCallback) {
        this.viberService = viberService;
        this.messageService = messageService;
        this.KeyboardService = keyboardService;
        this.conversationStartedCallback = null;
        this.deliveredCallback = null;
        this.failedCallback = null;
        this.messageCallback = null;
        this.seenCallback = null;
        this.subscribedCallback = null;
        this.unsubscribedCallback = null;
        this.webhookCallback = webhookCallback;
    }

    public static BotContext of(ViberService viberService, MessageService messageService, KeyboardService keyboardService, ConversationStartedCallback conversationStartedCallback) {
        return new BotContext(viberService, messageService, keyboardService, conversationStartedCallback);
    }

    public static BotContext of(ViberService viberService, MessageService messageService, KeyboardService keyboardService, DeliveredCallback deliveredCallback) {
        return new BotContext(viberService, messageService, keyboardService, deliveredCallback);
    }

    public static BotContext of(ViberService viberService, MessageService messageService, KeyboardService keyboardService, FailedCallback failedCallback) {
        return new BotContext(viberService, messageService, keyboardService, failedCallback);
    }

    public static BotContext of(ViberService viberService, MessageService messageService, KeyboardService keyboardService, MessageCallback messageCallback) {
        return new BotContext(viberService, messageService, keyboardService, messageCallback);
    }

    public static BotContext of(ViberService viberService, MessageService messageService, KeyboardService keyboardService, SeenCallback seenCallback) {
        return new BotContext(viberService, messageService, keyboardService, seenCallback);
    }

    public static BotContext of(ViberService viberService, MessageService messageService, KeyboardService keyboardService, SubscribedCallback subscribedCallback) {
        return new BotContext(viberService, messageService, keyboardService, subscribedCallback);
    }

    public static BotContext of(ViberService viberService, MessageService messageService, KeyboardService keyboardService, UnsubscribedCallback unsubscribedCallback) {
        return new BotContext(viberService, messageService, keyboardService, unsubscribedCallback);
    }

    public static BotContext of(ViberService viberService, MessageService messageService, KeyboardService keyboardService, WebhookCallback webhookCallback) {
        return new BotContext(viberService, messageService, keyboardService, webhookCallback);
    }
}

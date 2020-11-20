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
import by.testbot.payload.requests.message.*;
import by.testbot.payload.requests.SetWebhookRequest;
import by.testbot.payload.responses.SendMessageResponse;
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
            logger.error("Webhook not setted with code: " + setWebhookResponse.getStatus() + ", with message: " + setWebhookResponse.getStatusMessage());
        }
    }

    public void sendTextMessage(SendTextMessageRequest sendTextMessageRequest) {
        if (sendTextMessageRequest == null) {
            throw new IllegalArgumentException("Send text message request is null.");
        }
        if (sendTextMessageRequest.getSender().getName() == null || sendTextMessageRequest.getSender().getName().isEmpty() || sendTextMessageRequest.getSender().getName().isBlank()) {
            throw new IllegalArgumentException("Sender name is null or empty.");
        }
        if (sendTextMessageRequest.getText() == null || sendTextMessageRequest.getText().isEmpty() || sendTextMessageRequest.getText().isBlank()) {
            throw new IllegalArgumentException("Text is null or empty.");
        }

        SendMessageResponse sendMessageResponse = viberProxy.sendTextMessage(authenticationToken, sendTextMessageRequest);

        if (sendMessageResponse.getStatus() == Status.OK) {
            logger.info("Text message sended to user: " + sendTextMessageRequest.getUserId());
        }
        else {
            logger.warn("Text message not sended: " + sendMessageResponse.getStatus() + ". Error: " + sendMessageResponse.getStatusMessage());
        }
    }

    public void sendPictureMessage(SendPictureMessageRequest sendPictureMessageRequest) {
        if (sendPictureMessageRequest == null) {
            throw new IllegalArgumentException("Send picture message request is null.");
        }
        if (sendPictureMessageRequest.getSender().getName() == null || sendPictureMessageRequest.getSender().getName().isEmpty() || sendPictureMessageRequest.getSender().getName().isBlank()) {
            throw new IllegalArgumentException("Sender name is null or empty.");
        }
        if (sendPictureMessageRequest.getText() == null || sendPictureMessageRequest.getText().isEmpty() || sendPictureMessageRequest.getText().isBlank()) {
            throw new IllegalArgumentException("Text is null or empty");
        }
        if (sendPictureMessageRequest.getMediaUrl() == null || sendPictureMessageRequest.getMediaUrl().isEmpty() || sendPictureMessageRequest.getMediaUrl().isBlank()) {
            throw new IllegalArgumentException("Media url is null or empty.");
        }

        SendMessageResponse sendMessageResponse = viberProxy.sendPictureMessage(authenticationToken, sendPictureMessageRequest);

        if (sendMessageResponse.getStatus() == Status.OK) {
            logger.info("Picture message sended to user: " + sendPictureMessageRequest.getUserId());
        }
        else {
            logger.warn("Picture message not sended: " + sendMessageResponse.getStatus() + ". Error: " + sendMessageResponse.getStatusMessage());
        }
    }

    public void sendVideoMessage(SendVideoMessageRequest sendVideoMessageRequest) {
        if (sendVideoMessageRequest == null) {
            throw new IllegalArgumentException("Send video message request is null.");
        }
        if (sendVideoMessageRequest.getSender().getName() == null || sendVideoMessageRequest.getSender().getName().isEmpty() || sendVideoMessageRequest.getSender().getName().isBlank()) {
            throw new IllegalArgumentException("Sender name is null or empty.");
        }
        if (sendVideoMessageRequest.getMediaUrl() == null || sendVideoMessageRequest.getMediaUrl().isEmpty() || sendVideoMessageRequest.getMediaUrl().isBlank()) {
            throw new IllegalArgumentException("Media url is null or empty.");
        }
        if (sendVideoMessageRequest.getSize() == null) {
            throw new IllegalArgumentException("Video size is null.");
        }

        SendMessageResponse sendMessageResponse = viberProxy.sendVideoMessage(authenticationToken, sendVideoMessageRequest);

        if (sendMessageResponse.getStatus() == Status.OK) {
            logger.info("Video message sended to user: " + sendVideoMessageRequest.getUserId());
        }
        else {
            logger.warn("Video message not sended: " + sendMessageResponse.getStatus() + ". Error: " + sendMessageResponse.getStatusMessage());
        }
    }

    public void sendFileMessage(SendFileMessageRequest sendFileMessageRequest) {
        if (sendFileMessageRequest == null) {
            throw new IllegalArgumentException("Send file message request is null.");
        }
        if (sendFileMessageRequest.getSender().getName() == null || sendFileMessageRequest.getSender().getName().isEmpty() || sendFileMessageRequest.getSender().getName().isBlank()) {
            throw new IllegalArgumentException("Sender name is null or empty.");
        }
        if (sendFileMessageRequest.getMediaUrl() == null || sendFileMessageRequest.getMediaUrl().isEmpty() || sendFileMessageRequest.getMediaUrl().isBlank()) {
            throw new IllegalArgumentException("Media url is null or empty.");
        }
        if (sendFileMessageRequest.getSize() == null) {
            throw new IllegalArgumentException("File size is null.");
        }
        if (sendFileMessageRequest.getFileName() == null || sendFileMessageRequest.getFileName().isEmpty() || sendFileMessageRequest.getFileName().isBlank()) {
            throw new IllegalArgumentException("File name is null or empty.");
        }

        SendMessageResponse sendMessageResponse = viberProxy.sendFileMessage(authenticationToken, sendFileMessageRequest);

        if (sendMessageResponse.getStatus() == Status.OK) {
            logger.info("File message sended to user: " + sendFileMessageRequest.getUserId());
        }
        else {
            logger.warn("File message not sended: " + sendMessageResponse.getStatus() + ". Error: " + sendMessageResponse.getStatusMessage());
        }
    }

    public void sendContactMessage(SendContactMessageRequest sendContactMessageRequest) {
        if (sendContactMessageRequest == null) {
            throw new IllegalArgumentException("Send contact message request is null.");
        }
        if (sendContactMessageRequest.getSender().getName() == null || sendContactMessageRequest.getSender().getName().isEmpty() || sendContactMessageRequest.getSender().getName().isBlank()) {
            throw new IllegalArgumentException("Sender name is null or empty.");
        }
        if (sendContactMessageRequest.getContact().getName() == null || sendContactMessageRequest.getContact().getName().isEmpty() || sendContactMessageRequest.getContact().getName().isBlank()) {
            throw new IllegalArgumentException("Contact name is null or empty.");
        }
        if (sendContactMessageRequest.getContact().getPhoneNumber() == null || sendContactMessageRequest.getContact().getPhoneNumber().isEmpty() || sendContactMessageRequest.getContact().getPhoneNumber().isBlank()) {
            throw new IllegalArgumentException("Contact phone number is null or empty.");
        }

        SendMessageResponse sendMessageResponse = viberProxy.sendContactMessage(authenticationToken, sendContactMessageRequest);

        if (sendMessageResponse.getStatus() == Status.OK) {
            logger.info("Contact message sended to user: " + sendContactMessageRequest.getUserId());
        }
        else {
            logger.warn("Contact message not sended: " + sendMessageResponse.getStatus() + ". Error: " + sendMessageResponse.getStatusMessage());
        }
    }

    public void sendLocationMessage(SendLocationMessageRequest sendLocationMessageRequest) {
        if (sendLocationMessageRequest == null) {
            throw new IllegalArgumentException("Send location message request is null.");
        }
        if (sendLocationMessageRequest.getSender().getName() == null || sendLocationMessageRequest.getSender().getName().isEmpty() || sendLocationMessageRequest.getSender().getName().isBlank()) {
            throw new IllegalArgumentException("Sender name is null or empty.");
        }
        if (sendLocationMessageRequest.getLocation() == null) {
            throw new IllegalArgumentException("Location is null.");
        }

        SendMessageResponse sendMessageResponse = viberProxy.sendLocationMessage(authenticationToken, sendLocationMessageRequest);

        if (sendMessageResponse.getStatus() == Status.OK) {
            logger.info("Location message sended to user: " + sendLocationMessageRequest.getUserId());
        }
        else {
            logger.warn("Location message not sended: " + sendMessageResponse.getStatus() + ". Error: " + sendMessageResponse.getStatusMessage());
        }
    }

    public void sendUrlMessage(SendUrlMessageRequest sendUrlMessageRequest) {
        if (sendUrlMessageRequest == null) {
            throw new IllegalArgumentException("Send url message request is null.");
        }
        if (sendUrlMessageRequest.getSender().getName() == null || sendUrlMessageRequest.getSender().getName().isEmpty() || sendUrlMessageRequest.getSender().getName().isBlank()) {
            throw new IllegalArgumentException("Sender name is null or empty.");
        }
        if (sendUrlMessageRequest.getMediaUrl() == null || sendUrlMessageRequest.getMediaUrl().isEmpty() || sendUrlMessageRequest.getMediaUrl().isBlank()) {
            throw new IllegalArgumentException("Media url is null or empty.");
        }

        SendMessageResponse sendMessageResponse = viberProxy.sendUrlMessage(authenticationToken, sendUrlMessageRequest);

        if (sendMessageResponse.getStatus() == Status.OK) {
            logger.info("Url message sended to user: " + sendUrlMessageRequest.getUserId());
        }
        else {
            logger.warn("Url message not sended: " + sendMessageResponse.getStatus() + ". Error: " + sendMessageResponse.getStatusMessage());
        }
    }

    public void sendStickerMessage(SendStickerMessageRequest sendStickerMessageRequest) {
        if (sendStickerMessageRequest == null) {
            throw new IllegalArgumentException("Send sticker message request is null.");
        }
        if (sendStickerMessageRequest.getSender().getName() == null || sendStickerMessageRequest.getSender().getName().isEmpty() || sendStickerMessageRequest.getSender().getName().isBlank()) {
            throw new IllegalArgumentException("Sender name is null or empty.");
        }
        if (sendStickerMessageRequest.getStickerId() == null) {
            throw new IllegalArgumentException("Sticker id is null.");
        }

        SendMessageResponse sendMessageResponse = viberProxy.sendStickerMessage(authenticationToken, sendStickerMessageRequest);

        if (sendMessageResponse.getStatus() == Status.OK) {
            logger.info("Sticker message sended to user: " + sendStickerMessageRequest.getUserId());
        }
        else {
            logger.warn("Sticker message not sended: " + sendMessageResponse.getStatus() + ". Error: " + sendMessageResponse.getStatusMessage());
        }
    }

    public void handleUpdate(ViberUpdate viberUpdate) {
        if (viberUpdate.hasDeliveredCallback()) {
            logger.info("Received DeliveredCallback from user: " + viberUpdate.getDeliveredCallback().getUserId());
            // handle callback
        }
        else if (viberUpdate.hasSeenCallback()) {
            logger.info("Received SeenCallback from user: " + viberUpdate.getSeenCallback().getUserId());
            // handle callback
        }
        else if (viberUpdate.hasFailedCallback()) {
            logger.info("Received FailedCallback from user: " + viberUpdate.getFailedCallback().getUserId() + ", with message: " + viberUpdate.getFailedCallback().getDescription());
            // handle callback
        }
        else if (viberUpdate.hasSubscribedCallback()) {
            logger.info("Received SubscribedCallback from user: " + viberUpdate.getSubscribedCallback().getUser().getViberId());
            // handle callback
        }
        else if (viberUpdate.hasUnsubscribedCallback()) {
            logger.info("Received UnsubscribedCallback from user: " + viberUpdate.getUnsubscribedCallback().getUserId());
            // handle callback
        }
        else if (viberUpdate.hasConversationStartedCallback()) {
            logger.info("Received ConversationStartedCallback from user: " + viberUpdate.getConversationStartedCallback().getUser().getViberId());
            // handle callback

            BotState botState = BotState.ConversationStarted;
            BotContext botContext = BotContext.of(this, viberUpdate.getConversationStartedCallback());

            botState.enter(botContext);
        }
        else if (viberUpdate.hasWebhookCallback()) {
            logger.info("Received WebhookCallback.");
            // handle callback
        }
        else if (viberUpdate.hasMessageCallback()) {
            logger.info("Received MessageCallback from user: " + viberUpdate.getMessageCallback().getSender().getId() + ", message type: " + viberUpdate.getMessageCallback().getMessage().getMessageType());
            // handle callback
        }
    }


}

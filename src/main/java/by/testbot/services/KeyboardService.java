package by.testbot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import by.testbot.bot.KeyboardSource;
import by.testbot.models.Sender;
import by.testbot.payload.requests.message.SendTextMessageRequest;

@Service
public class KeyboardService {
    @Autowired
    private ViberService viberService;

    public void sendAdminMainMenuKeyboard(String viberId) {
        SendTextMessageRequest sendTextMessageRequest = new SendTextMessageRequest();
        Sender sender = new Sender();

        sender.setName("AutoCapitalBot");

        sendTextMessageRequest.setText("Главное меню");
        sendTextMessageRequest.setKeyboard(KeyboardSource.getAdminMainMenuKeyboard());
        sendTextMessageRequest.setUserId(viberId);
        sendTextMessageRequest.setSender(sender);

        viberService.sendTextMessage(sendTextMessageRequest);
    } 

    public void sendListOfManagersMenuKeyboard(String viberId) {
        SendTextMessageRequest sendTextMessageRequest = new SendTextMessageRequest();
        Sender sender = new Sender();

        sender.setName("AutoCapitalBot");

        sendTextMessageRequest.setText("Список менеджеров");
        sendTextMessageRequest.setKeyboard(KeyboardSource.getListOfManagersMenuKeyboard());
        sendTextMessageRequest.setUserId(viberId);
        sendTextMessageRequest.setSender(sender);

        viberService.sendTextMessage(sendTextMessageRequest);
    }

    public void sendListOfClientsMenuKeyboard(String viberId) {
        SendTextMessageRequest sendTextMessageRequest = new SendTextMessageRequest();
        Sender sender = new Sender();

        sender.setName("AutoCapitalBot");

        sendTextMessageRequest.setText("Список клиентов");
        sendTextMessageRequest.setKeyboard(KeyboardSource.getListOfManagersMenuKeyboard());
        sendTextMessageRequest.setUserId(viberId);
        sendTextMessageRequest.setSender(sender);

        viberService.sendTextMessage(sendTextMessageRequest);
    }

    public void sendReportMenuKeyboard(String viberId) {
        SendTextMessageRequest sendTextMessageRequest = new SendTextMessageRequest();
        Sender sender = new Sender();

        sender.setName("AutoCapitalBot");

        sendTextMessageRequest.setText("Отчет");
        sendTextMessageRequest.setKeyboard(KeyboardSource.getReportMenuKeyboard());
        sendTextMessageRequest.setUserId(viberId);
        sendTextMessageRequest.setSender(sender);

        viberService.sendTextMessage(sendTextMessageRequest);
    }

    public void sendIntegrationsMenuKeyboard(String viberId) {
        SendTextMessageRequest sendTextMessageRequest = new SendTextMessageRequest();
        Sender sender = new Sender();

        sender.setName("AutoCapitalBot");

        sendTextMessageRequest.setText("Интеграции");
        sendTextMessageRequest.setKeyboard(KeyboardSource.getIntegrationsMenuKeyboard());
        sendTextMessageRequest.setUserId(viberId);
        sendTextMessageRequest.setSender(sender);

        viberService.sendTextMessage(sendTextMessageRequest);
    }

    public void sendSettingsMenuKeyboard(String viberId) {
        SendTextMessageRequest sendTextMessageRequest = new SendTextMessageRequest();
        Sender sender = new Sender();

        sender.setName("AutoCapitalBot");

        sendTextMessageRequest.setText("Настройки");
        sendTextMessageRequest.setKeyboard(KeyboardSource.getSettingsMenuKeyboard());
        sendTextMessageRequest.setUserId(viberId);
        sendTextMessageRequest.setSender(sender);

        viberService.sendTextMessage(sendTextMessageRequest);
    }

    public void sendBotUsagePeriodMenuKeyboard(String viberId) {
        SendTextMessageRequest sendTextMessageRequest = new SendTextMessageRequest();
        Sender sender = new Sender();

        sender.setName("AutoCapitalBot");

        sendTextMessageRequest.setText("Настройка периода временного использования бота");
        sendTextMessageRequest.setKeyboard(KeyboardSource.getSetBotUsagePeriodMenuKeyboard());
        sendTextMessageRequest.setUserId(viberId);
        sendTextMessageRequest.setSender(sender);

        viberService.sendTextMessage(sendTextMessageRequest);
    }

    public void sendConfirmPostponeMessageKeyboard(String viberId) {
        SendTextMessageRequest sendTextMessageRequest = new SendTextMessageRequest();
        Sender sender = new Sender();

        sender.setName("AutoCapitalBot");

        sendTextMessageRequest.setText("Подтвердите отправку отложенного сообщения");
        sendTextMessageRequest.setKeyboard(KeyboardSource.getConfirmPostponeMessageKeyboard());
        sendTextMessageRequest.setUserId(viberId);
        sendTextMessageRequest.setSender(sender);

        viberService.sendTextMessage(sendTextMessageRequest);
    }

}

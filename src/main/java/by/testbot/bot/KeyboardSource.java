package by.testbot.bot;

import java.util.ArrayList;
import java.util.List;

import by.testbot.models.Button;
import by.testbot.models.Keyboard;

public class KeyboardSource {
    public static Keyboard getAdminMainMenuKeyboard() {
        Keyboard keyboard = new Keyboard();
        List<Button> buttons = new ArrayList<>();

        Button postponeMessageButton = new Button();
        postponeMessageButton.setText("Отложенное сообщение");
        postponeMessageButton.setActionBody("Отложенное сообщение");
        postponeMessageButton.setColumns(3);
        postponeMessageButton.setRows(1);
        buttons.add(postponeMessageButton);

        Button listOfManagersButton = new Button();
        listOfManagersButton.setText("Список менеджеров");
        listOfManagersButton.setActionBody("Список менеджеров");
        listOfManagersButton.setColumns(3);
        listOfManagersButton.setRows(1);
        buttons.add(listOfManagersButton);

        Button listOfClientsButton = new Button();
        listOfClientsButton.setText("Список клиентов");
        listOfClientsButton.setActionBody("Список клиентов");
        listOfClientsButton.setColumns(3);
        listOfClientsButton.setRows(1);
        buttons.add(listOfClientsButton);

        Button reportButton = new Button();
        reportButton.setText("Отчет");
        reportButton.setActionBody("Отчет");
        reportButton.setColumns(3);
        reportButton.setRows(1);
        buttons.add(reportButton);

        Button integrationButton = new Button();
        integrationButton.setText("Интеграции");
        integrationButton.setActionBody("Интеграции");
        integrationButton.setColumns(3);
        integrationButton.setRows(1);
        buttons.add(integrationButton);

        Button settingsButton = new Button();
        settingsButton.setText("Настройка");
        settingsButton.setActionBody("Настройка");
        settingsButton.setColumns(3);
        settingsButton.setRows(1);
        buttons.add(settingsButton);

        keyboard.setButtons(buttons);
        return keyboard;
    }

    public static Keyboard getListOfManagersMenuKeyboard() {
        Keyboard keyboard = new Keyboard();
        List<Button> buttons = new ArrayList<>();

        Button getListOfManagersButton = new Button();
        getListOfManagersButton.setText("Получить список менеджеров");
        getListOfManagersButton.setActionBody("Получить список менеджеров");
        getListOfManagersButton.setColumns(3);
        getListOfManagersButton.setRows(1);
        buttons.add(getListOfManagersButton);

        Button addManagerButton = new Button();
        addManagerButton.setText("Добавить менеджера");
        addManagerButton.setActionBody("Добавить менеджера");
        addManagerButton.setColumns(3);
        addManagerButton.setRows(1);
        buttons.add(addManagerButton);

        Button deleteManagerButton = new Button();
        deleteManagerButton.setText("Удалить менеджера");
        deleteManagerButton.setActionBody("Удалить менеджера");
        deleteManagerButton.setColumns(3);
        deleteManagerButton.setRows(1);
        buttons.add(deleteManagerButton);

        Button changePrivilegesButton = new Button();
        changePrivilegesButton.setText("Изменение привелегий");
        changePrivilegesButton.setActionBody("Изменение привелегий");
        changePrivilegesButton.setColumns(3);
        changePrivilegesButton.setRows(1);
        buttons.add(changePrivilegesButton);

        keyboard.setButtons(buttons);
        return keyboard;
    }

    public static Keyboard getListOfClientsMenuKeyboard() {
        Keyboard keyboard = new Keyboard();
        List<Button> buttons = new ArrayList<>();
        
        Button getListOfClientsAndOtherInformationButton = new Button();
        getListOfClientsAndOtherInformationButton.setText("Получить список клиентов и информацию о них");
        getListOfClientsAndOtherInformationButton.setActionBody("Получить список клиентов и ифнормацию о них");
        getListOfClientsAndOtherInformationButton.setColumns(6);
        getListOfClientsAndOtherInformationButton.setRows(1);
        buttons.add(getListOfClientsAndOtherInformationButton);

        Button additionalActionsWithClientsButton = new Button();
        additionalActionsWithClientsButton.setText("Дополнительные операции с клиентами");
        additionalActionsWithClientsButton.setActionBody("Дополнительные операции с клиентами");
        additionalActionsWithClientsButton.setColumns(6);
        additionalActionsWithClientsButton.setRows(1);
        buttons.add(additionalActionsWithClientsButton);

        keyboard.setButtons(buttons);
        return keyboard;
    }

    public static Keyboard getReportMenuKeyboard() {
        Keyboard keyboard = new Keyboard();
        List<Button> buttons = new ArrayList<>();

        Button reportAboutManagersWorkButton = new Button();
        reportAboutManagersWorkButton.setText("Отчет о работе менеджеров");
        reportAboutManagersWorkButton.setActionBody("Отчет о работе менеджеров");
        reportAboutManagersWorkButton.setColumns(6);
        reportAboutManagersWorkButton.setRows(1);
        buttons.add(reportAboutManagersWorkButton);

        Button reportAboutBotWorkButton = new Button();
        reportAboutBotWorkButton.setText("Отчет о работе бота");
        reportAboutBotWorkButton.setActionBody("Отчет о работе бота");
        reportAboutBotWorkButton.setColumns(6);
        reportAboutBotWorkButton.setRows(1);
        buttons.add(reportAboutBotWorkButton);

        keyboard.setButtons(buttons);
        return keyboard;
    }

    public static Keyboard getIntegrationsMenuKeyboard() {
        Keyboard keyboard = new Keyboard();
        List<Button> buttons = new ArrayList<>();

        Button addIntegrationButton = new Button();
        addIntegrationButton.setText("Добавление новой интеграции");
        addIntegrationButton.setActionBody("Добавление новой интеграции");
        addIntegrationButton.setColumns(6);
        addIntegrationButton.setRows(1);
        buttons.add(addIntegrationButton);

        Button deleteIntegrationButton = new Button();
        deleteIntegrationButton.setText("Удаление новой интергации");
        deleteIntegrationButton.setActionBody("Удаление новой интеграции");
        deleteIntegrationButton.setColumns(6);
        deleteIntegrationButton.setRows(1);
        buttons.add(deleteIntegrationButton);

        keyboard.setButtons(buttons);
        return keyboard;
    }

    public static Keyboard getSettingsMenuKeyboard() {
        Keyboard keyboard = new Keyboard();
        List<Button> buttons = new ArrayList<>();

        Button editTextButton = new Button();
        editTextButton.setText("Редактировать текст, отправляемый ботом");
        editTextButton.setActionBody("Редактировать текст, отправляемый ботом");
        editTextButton.setColumns(6);
        editTextButton.setRows(1);
        buttons.add(editTextButton);

        Button setBotUsingPeriodButton = new Button();
        setBotUsingPeriodButton.setText("Настройка периода временного использования бота");
        setBotUsingPeriodButton.setActionBody("Настройка периода временного использования бота");
        setBotUsingPeriodButton.setColumns(6);
        setBotUsingPeriodButton.setRows(1);
        buttons.add(setBotUsingPeriodButton);

        keyboard.setButtons(buttons);
        return keyboard;
    }

    public static Keyboard getSetBotUsagePeriodMenuKeyboard() {
        Keyboard keyboard = new Keyboard();
        List<Button> buttons = new ArrayList<>();

        Button inChatButton = new Button();
        inChatButton.setText("В чате(время обработки)");
        inChatButton.setActionBody("В чате(время обработки)");
        inChatButton.setColumns(6);
        inChatButton.setRows(1);
        buttons.add(inChatButton);

        Button atNightButton = new Button();
        atNightButton.setText("В ночное время");
        atNightButton.setActionBody("В ночное время");
        atNightButton.setColumns(6);
        atNightButton.setRows(1);
        buttons.add(atNightButton);

        keyboard.setButtons(buttons);
        return keyboard;
    }

    public static Keyboard getConfirmPostponeMessageKeyboard() {
        Keyboard keyboard = new Keyboard();
        List<Button> buttons = new ArrayList<>();

        Button yesButton = new Button();
        yesButton.setText("Да");
        yesButton.setActionBody("Да");
        yesButton.setColumns(6);
        yesButton.setRows(1);
        buttons.add(yesButton);

        Button noButton = new Button();
        noButton.setText("Нет");
        noButton.setActionBody("Нет");
        noButton.setColumns(6);
        noButton.setRows(1);
        buttons.add(noButton);

        keyboard.setButtons(buttons);
        return keyboard;
    }

}

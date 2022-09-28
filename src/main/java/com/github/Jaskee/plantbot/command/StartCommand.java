package com.github.Jaskee.plantbot.command;

import com.github.Jaskee.plantbot.service.SendBotMessageService;
import org.telegram.telegrambots.meta.api.objects.Update;

public class StartCommand implements Command{

    private final SendBotMessageService sendBotMessageService;

    public final static String START_MESSAGE = "Привет, я бот, который поможет тебе ухаживать за растениями!" +
            " Я буду напоминать тебе о поливах, пересадках и удобрениях. А возможно и еще о чем-нибудь, но я пока еще не придумал о чем";

    public StartCommand(SendBotMessageService sendBotMessageService) {
        this.sendBotMessageService = sendBotMessageService;
    }
    @Override
    public void execute(Update update) {
        sendBotMessageService.sendMessage(update.getMessage().getChatId().toString(), START_MESSAGE);
    }
}

package com.github.Jaskee.plantbot.command;

import com.github.Jaskee.plantbot.service.SendBotMessageService;
import org.telegram.telegrambots.meta.api.objects.Update;

public class FertCommand implements Command{

    private final SendBotMessageService sendBotMessageService;

    public static final String FERT_MESSAGE = "Тут будет функционал, напоминающий тебе об удобрениях";

    public FertCommand(SendBotMessageService sendBotMessageService){
        this.sendBotMessageService = sendBotMessageService;
    }

    @Override
    public void execute(Update update) {
        sendBotMessageService.sendMessage(update.getMessage().getChatId().toString(), FERT_MESSAGE);
    }
}

package com.github.Jaskee.plantbot.command;

import com.github.Jaskee.plantbot.service.SendBotMessageService;
import org.telegram.telegrambots.meta.api.objects.Update;

public class SwapCommand implements Command{

    private final SendBotMessageService sendBotMessageService;

    public final static String SWAP_MESSAGE = "Сюда будет добавлен фунцкионал, напоминающий тебе о пересадках цветов";

    public SwapCommand(SendBotMessageService sendBotMessageService){
        this.sendBotMessageService = sendBotMessageService;
    }

    @Override
    public void execute(Update update) {
        sendBotMessageService.sendMessage(update.getMessage().getChatId().toString(), SWAP_MESSAGE);
    }
}

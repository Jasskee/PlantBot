package com.github.Jaskee.plantbot.command;

import com.github.Jaskee.plantbot.service.SendBotMessageService;
import org.telegram.telegrambots.meta.api.objects.Update;

public class WaterCommand implements Command{

    private final SendBotMessageService sendBotMessageService;

    public static String WATER_MESSAGE = "Здесь будет функционал, напоминающий тебе о поливе цветов.";

    public WaterCommand(SendBotMessageService sendBotMessageService){
        this.sendBotMessageService = sendBotMessageService;
    }

    @Override
    public void execute(Update update) {
        sendBotMessageService.sendMessage(update.getMessage().getChatId().toString(),WATER_MESSAGE);
    }
}

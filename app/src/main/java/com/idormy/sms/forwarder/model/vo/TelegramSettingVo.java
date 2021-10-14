package com.idormy.sms.forwarder.model.vo;

import java.io.Serializable;

import lombok.Data;

@Data
public class TelegramSettingVo implements Serializable {
    private String apiToken;
    private String chatId;
    private String apiUrl;

    public TelegramSettingVo() {
    }

    public TelegramSettingVo(String apiToken, String chatId, String apiUrl) {
        this.apiToken = apiToken;
        this.chatId = chatId;
        this.apiUrl = apiUrl;
    }

    public TelegramSettingVo(String apiToken, String chatId) {
        this.apiToken = apiToken;
        this.chatId = chatId;
    }
}

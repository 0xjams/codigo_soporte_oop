package me.jorgemoran.semana6.notification.entity;

public class NotificationBuilder {
    private String url;
    private String token;
    private String chatId;
    private String accessToken;
    private String deviceId;

    public NotificationBuilder setUrl(String url) {
        this.url = url;
        return this;
    }

    public NotificationBuilder setToken(String token) {
        this.token = token;
        return this;
    }

    public NotificationBuilder setChatId(String chatId) {
        this.chatId = chatId;
        return this;
    }

    public NotificationBuilder setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }

    public NotificationBuilder setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    public TelegramNotification buildTelegramNotification() {
        return new TelegramNotification(url, token, chatId);
    }

    public PushBulletNotification buildPushBulletNotification() {
        return new PushBulletNotification(url, accessToken, deviceId);
    }
}


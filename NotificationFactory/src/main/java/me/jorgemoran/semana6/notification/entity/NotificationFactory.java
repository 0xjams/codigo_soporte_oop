package me.jorgemoran.semana6.notification.entity;

import java.util.Map;
import me.jorgemoran.semana6.notification.helper.ParameterLoader;

public class NotificationFactory {
        public static Notification createNotification(String type, String destination) {
            NotificationBuilder builder = new NotificationBuilder();
            Map<String, String> propertiesMap = ParameterLoader.loadPropertiesToMap("params.properties");
            switch (type.toLowerCase()) {
                case "telegram":
                    builder.setUrl("https://api.telegram.org")
                            .setToken(propertiesMap.get("telegram_api_id"))
                            .setChatId(destination);
                    return builder.buildTelegramNotification();

                case "pushbullet":
                    builder.setUrl("https://api.pushbullet.com/v2")
                            .setAccessToken(propertiesMap.get("pushbullet_key"))
                            .setDeviceId(destination);
                    return builder.buildPushBulletNotification();

                default:
                    throw new IllegalArgumentException("Unknown notification type: " + type);
            }
        }
    }



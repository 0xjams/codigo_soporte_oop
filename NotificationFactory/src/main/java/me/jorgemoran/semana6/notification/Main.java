package me.jorgemoran.semana6.notification;

import me.jorgemoran.semana6.notification.entity.Notification;
import me.jorgemoran.semana6.notification.entity.NotificationFactory;

public class Main{
    public static void main(String[] args) {
        // Para obtener el ID de telegram ir a GetIDs Bot
        /*Notification telegramNotification = NotificationFactory.createNotification("telegram", "");
        telegramNotification.sendMessage("Hello via Telegram!");

        Notification pushBulletNotification = NotificationFactory.createNotification("pushbullet", null);
        pushBulletNotification.sendMessage("Hello via PushBullet!");*/

        Menu m = new Menu();
        m.mostrarMenu();
    }
}
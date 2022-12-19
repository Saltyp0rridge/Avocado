package com.abh80.smartedge.plugins;

import com.abh80.smartedge.plugins.BatteryPlugin.BatteryPlugin;
import com.abh80.smartedge.plugins.MediaSession.MediaSessionPlugin;
import com.abh80.smartedge.plugins.MoneyPlugin.MoneyPlugin;
import com.abh80.smartedge.plugins.Notification.NotificationPlugin;
import com.abh80.smartedge.plugins.AlarmPlugin.AlarmPlugin;
import java.util.ArrayList;

public class ExportedPlugins {
    public static ArrayList<BasePlugin> getPlugins() {
        ArrayList<BasePlugin> plugins = new ArrayList<>();
        plugins.add(new MediaSessionPlugin());
        plugins.add(new NotificationPlugin());
        plugins.add(new BatteryPlugin());
        plugins.add(new AlarmPlugin());
        plugins.add(new MoneyPlugin());
        return plugins;
    }
}

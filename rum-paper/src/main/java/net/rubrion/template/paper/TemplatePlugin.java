package net.rubrion.template.paper;

import net.rubrion.common.api.id.NamespacedId;
import net.rubrion.template.common.TemplateBootstrap;
import org.bukkit.plugin.java.JavaPlugin;

public class TemplatePlugin extends JavaPlugin {

    @Override
    public void onLoad() {
        new TemplateBootstrap(new NamespacedId("rubrion:papermc"));
    }

    @Override
    public void onEnable() {

    }

    @Override
    public void onDisable() {

    }
}

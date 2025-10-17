package net.rubrion.template.bungee;

import net.md_5.bungee.api.plugin.Plugin;
import net.rubrion.common.api.id.NamespacedId;
import net.rubrion.template.common.TemplateBootstrap;

public class TemplatePlugin extends Plugin {

    @Override
    public void onEnable() {
        new TemplateBootstrap(new NamespacedId("rubrion:bungeecord"));
    }

    @Override
    public void onDisable() {

    }

}

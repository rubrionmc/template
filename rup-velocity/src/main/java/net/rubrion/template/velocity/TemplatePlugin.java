package net.rubrion.template.velocity;

import com.google.inject.Inject;
import com.velocitypowered.api.plugin.Plugin;
import com.velocitypowered.api.plugin.annotation.DataDirectory;
import net.rubrion.common.api.id.NamespacedId;
import net.rubrion.template.common.TemplateBootstrap;

import java.nio.file.Path;

@SuppressWarnings("ClassCanBeRecord")
@Plugin(id = "template", name = "Template", version = "${version}", authors = "${authors}")
public class TemplatePlugin {

    @SuppressWarnings("FieldCanBeLocal")
    private final Path dataDirectory;

    @Inject
    public TemplatePlugin(@DataDirectory Path dataDirectory) {
        this.dataDirectory = dataDirectory;
    }

    @Inject
    public void onEnable() {
        new TemplateBootstrap(new NamespacedId("rubrion:velocity"));
    }

    @Inject
    public void onDisable() {

    }

}

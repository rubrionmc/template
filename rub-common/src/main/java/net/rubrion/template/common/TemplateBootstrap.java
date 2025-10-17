/**
 * RPL-LICENSE NOTICE
 * <br><br>
 * This Sourcecode is under the RPL-LICENSE. <br>
 * License at: <a href="https://github.com/rubrionmc/.github/blob/main/licensens/RUBRION_PUBLIC">GITHUB</a>
 * <br><br>
 * Copyright (c) LeyCM <leycm@proton.me> <br>
 * Copyright (c) maintainers <br>
 * Copyright (c) contributors
 */
package net.rubrion.template.common;

import net.rubrion.common.api.id.NamespacedId;
import net.rubrion.template.api.TemplateApi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("ClassCanBeRecord")
public class TemplateBootstrap implements TemplateApi {
    private final NamespacedId loader;

    public TemplateBootstrap(NamespacedId loader) {
        this.loader = loader;
    }

    @Override
    public String aFunction() {
        return "";
    }

    @Override
    public NamespacedId loader() {
        return loader;
    }

    @Override
    public Logger logger() {
        return LoggerFactory.getLogger(TemplateApi.class);
    }

}

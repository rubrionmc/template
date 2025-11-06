/**
 * RPL-LICENSE NOTICE
 * <br><br>
 * This Sourcecode is under the RPL-PUBLIC LICENSE. <br>
 * License at: <a href="https://github.com/rubrionmc/.github/blob/main/licensens/RUBRION_PUBLIC">GITHUB</a>
 * <br><br>
 * Copyright (c) LeyCM <a  href="mailto:leycm@proton.me">leycm@proton.me<br>
 * Copyright (c) maintainers  <br>
 * Copyright (c) contributors
 * <br>
 * <br>
 * LEGACY NOTICE:
 * All game ideas, creative content, media assets, and non-code intellectual property
 * in this project are protected under the RPL-CONTENT LICENSE and may not be
 * copied, modified, or redistributed without explicit permission.
 * <br>
 * Only the source code itself is covered by the permissive RPL-PUBLIC LICENSE.
 * This distinction ensures legal clarity: code is open for study and reuse,
 * while creative and gameplay concepts remain fully protected.
 */
package net.rubrion.server.template;

import de.leycm.neck.instance.Initializable;
import lombok.NonNull;
import org.jetbrains.annotations.Contract;

/**
 * TemplateApiFactory
 *
 * <p>
 * Core interface for the Template API. Provides a singleton instance
 * via {@link #getInstance()} and defines a standard initialization contract
 * through {@link Initializable}.
 * </p>
 *
 * <p>Implementations should be thread-safe and initialized before use.</p>
 *
 * @author LeyCM
 * @since 1.0.1
 */
public interface TemplateApiFactory extends Initializable {

    /**
     * Returns the singleton instance of the {@code TemplateApiFactory}.
     *
     * <p>
     * This method relies on the {@link Initializable#getInstance(Class)} mechanism to retrieve
     * the registered implementation. If no implementation has been registered, a
     * {@link NullPointerException} is thrown.
     * </p>
     *
     * @return the singleton instance of {@code TemplateApiFactory}
     * @throws NullPointerException if no implementation is registered
     * @see Initializable#getInstance(Class)
     */
    @NonNull
    @Contract(pure = true)
    static TemplateApiFactory getInstance() {
        return Initializable.getInstance(TemplateApiFactory.class);
    }

}

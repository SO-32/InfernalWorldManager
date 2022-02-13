package com.infernalsuite.api.event.events.world;

import com.infernalsuite.api.event.IWMEvent;
import com.infernalsuite.api.event.type.Cancellable;
import com.infernalsuite.api.event.util.Param;
import com.infernalsuite.api.world.WorldRegistry;
import org.checkerframework.checker.nullness.qual.NonNull;

/**
 * Called before a world is retrieved from the world registry.
 *
 * <p>Contains the name of the world being retrieved.</p>
 *
 * <p>This event can be cancelled using {@link Cancellable#setCancelled(boolean)} which will cause
 * the {@link WorldRegistry#getWorld(String)} call to return {@code null}</p>
 */
public interface PreGetWorldEvent extends IWMEvent, Cancellable {

    /**
     * Gets the name of the world being retrieved from the {@link com.infernalsuite.api.world.WorldRegistry world registry}
     *
     * @return the world name
     */
    @Param(0)
    @NonNull String getWorldName();

}

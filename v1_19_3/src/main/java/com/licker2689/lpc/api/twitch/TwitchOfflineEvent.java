package com.licker2689.lpc.api.twitch;

import com.github.twitch4j.common.events.domain.EventChannel;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

public class TwitchOfflineEvent extends Event {
    private static final HandlerList handlers = new HandlerList();
    private final EventChannel channel;

    public TwitchOfflineEvent(EventChannel ec) {
        super(true);
        this.channel = ec;
    }

    public EventChannel getChannel() {
        return channel;
    }

    @Override
    public @NotNull
    HandlerList getHandlers() {
        return handlers;
    }

    @NotNull
    public static HandlerList getHandlerList() {
        return handlers;
    }
}

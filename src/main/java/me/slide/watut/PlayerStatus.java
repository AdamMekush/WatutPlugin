package me.slide.watut;

import net.kyori.adventure.nbt.CompoundBinaryTag;

public class PlayerStatus {

    private int ticksSinceLastAction = 0;
    private int ticksToMarkPlayerIdleSyncedForClient = 20*60*5;

    private CompoundBinaryTag nbtCache = CompoundBinaryTag.builder().build();

    public PlayerStatus(PlayerGuiState playerGuiState) {
    }

    public void setPlayerGuiState(PlayerGuiState playerGuiState) {
    }

    public void setScreenPosPercentX(float screenPosPercentX) {
    }

    public void setScreenPosPercentY(float screenPosPercentY) {
    }

    public void setPressing(boolean pressing) {
    }

    public void setTicksSinceLastAction(int ticksSinceLastAction) {
        this.ticksSinceLastAction = ticksSinceLastAction;
    }

    public boolean isIdle() {
        return ticksSinceLastAction > ticksToMarkPlayerIdleSyncedForClient;
    }

    public CompoundBinaryTag getNbtCache() {
        return nbtCache;
    }

    public void mergeNbtCache(CompoundBinaryTag data) {
        nbtCache = CompoundBinaryTag.builder().put(nbtCache).put(data).build();
    }

    public void setTicksToMarkPlayerIdleSyncedForClient(int ticksToMarkPlayerIdleSyncedForClient) {
        this.ticksToMarkPlayerIdleSyncedForClient = ticksToMarkPlayerIdleSyncedForClient;
    }

    public void setPlayerChatState(PlayerChatState playerChatState) {
    }
}
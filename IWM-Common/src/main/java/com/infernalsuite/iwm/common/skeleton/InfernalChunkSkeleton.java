package com.infernalsuite.iwm.common.skeleton;

import com.infernalsuite.iwm.api.world.InfernalChunk;
import com.infernalsuite.iwm.api.world.InfernalChunkSection;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.jglrxavpok.hephaistos.nbt.NBTCompound;

import java.util.List;

public record InfernalChunkSkeleton(int x, int z, InfernalChunkSection[] sections,
                                 NBTCompound heightMap,
                                 List<NBTCompound> blockEntities,
                                 List<NBTCompound> entities,
                                 String worldName,
                                 int minSection,
                                 int maxSection) implements InfernalChunk {
    @Override
    public @NonNull String getWorldName() {
        return this.worldName;
    }

    @Override
    public int getX() {
        return this.x;
    }

    @Override
    public int getZ() {
        return this.z;
    }

    @Override
    public InfernalChunkSection[] getSections() {
        return this.sections;
    }

    @Override
    public int getMinSection() {
        return this.minSection;
    }

    @Override
    public int getMaxSection() {
        return this.maxSection;
    }

    @Override
    public NBTCompound getHeightMaps() {
        return this.heightMap;
    }

    @Override
    public List<NBTCompound> getTileEntities() {
        return this.blockEntities;
    }

    @Override
    public List<NBTCompound> getEntities() {
        return this.entities;
    }
}


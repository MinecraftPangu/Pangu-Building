package cn.mccraft.pangu.building.init;

import cn.mccraft.pangu.core.block.*;
import cn.mccraft.pangu.core.item.PGItemNewSlab;
import cn.mccraft.pangu.core.loader.annotation.RegBlock;
import cn.mccraft.pangu.core.loader.creativetabs.SharedCreativeTab;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

@SharedCreativeTab("panguBuilding")
public interface PBBlocks {

    @RegBlock("loess")
    Block LOESS = new PGBlock(Material.GROUND).setSoundType(SoundType.GROUND).setHardness(0.5F);

    @RegBlock("adobe")
    Block ADOBE = new PGBlock(Material.GROUND).setSoundType(SoundType.GROUND).setHardness(0.8F);

    @RegBlock({"bamboo", "plank"})
    Block BAMBOO_PLANK = new PGBlock(Material.WOOD).setSoundType(SoundType.WOOD).setHardness(2.0F).setResistance(5.0F);

    @RegBlock(value = {"bamboo", "slab"}, itemBlockClass = PGItemNewSlab.class)
    Block BAMBOO_SLAB = new PGBlockNewSlab(Material.WOOD).setSoundType(SoundType.WOOD).setHardness(2.0F).setResistance(5.0F);

    @RegBlock({"bamboo", "stairs"})
    Block BAMBOO_STAIRS = new PGBlockStair(BAMBOO_PLANK.getDefaultState());

    @RegBlock({"bamboo", "fence"})
    Block BAMBOO_FENCE = new PGBlockFence(Material.WOOD).setSoundType(SoundType.WOOD).setHardness(2.0F).setResistance(5.0F);

    @RegBlock({"bamboo", "fence", "gate"})
    Block BAMBOO_FENCE_GATE = new PGBlockFenceGate(Material.WOOD).setSoundType(SoundType.WOOD).setHardness(2.0F).setResistance(5.0F);

    @RegBlock({"peeled", "bamboo", "plank"})
    Block PEELED_BAMBOO_PLANK = new PGBlock(Material.WOOD).setSoundType(SoundType.WOOD).setHardness(2.0F).setResistance(5.0F);

    @RegBlock(value = {"peeled", "bamboo", "slab"}, itemBlockClass = PGItemNewSlab.class)
    Block PEELED_BAMBOO_SLAB = new PGBlockNewSlab(Material.WOOD).setSoundType(SoundType.WOOD).setHardness(2.0F).setResistance(5.0F);

    @RegBlock({"peeled", "bamboo", "stairs"})
    Block PEELED_BAMBOO_STAIRS = new PGBlockStair(PEELED_BAMBOO_PLANK.getDefaultState());

    @RegBlock({"peeled", "bamboo", "fence"})
    Block PEELED_BAMBOO_FENCE = new PGBlockFence(Material.WOOD).setSoundType(SoundType.WOOD).setHardness(2.0F).setResistance(5.0F);

    @RegBlock({"peeled", "bamboo", "fence", "gate"})
    Block PEELED_BAMBOO_FENCE_GATE = new PGBlockFenceGate(Material.WOOD).setSoundType(SoundType.WOOD).setHardness(2.0F).setResistance(5.0F);

    @RegBlock({"black","brick","block"})
    Block BLACK_BRICK_BLOCK = new PGBlock(Material.ROCK).setHarvestLevelR("pickaxe",0).setSoundType(SoundType.STONE).setHardness(2.0F).setResistance(10.0F);

    @RegBlock({"black","brick", "stairs"})
    Block BLACK_BRICK_STAIRS = new PGBlockStair(BLACK_BRICK_BLOCK.getDefaultState()).setHarvestLevelReturnBlock("pickaxe",0);

    @RegBlock(value = {"black","brick","slab"},itemBlockClass = PGItemNewSlab.class)
    Block BLACK_BRICK_SLAB = new PGBlockNewSlab(Material.ROCK).setHarvestLevelR("pickaxe",0).setSoundType(SoundType.STONE).setHardness(2.0F).setResistance(10.0F);

    @RegBlock({"black","brick","wall"})
    Block BLACK_BRICK_WALL = new PGBlockWall(Material.ROCK).setHarvestLevelR("pickaxe",0).setSoundType(SoundType.STONE).setHardness(2.0F).setResistance(10.0F);

}

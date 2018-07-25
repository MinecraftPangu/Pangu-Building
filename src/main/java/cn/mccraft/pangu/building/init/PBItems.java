package cn.mccraft.pangu.building.init;

import cn.mccraft.pangu.core.item.PGItem;
import cn.mccraft.pangu.core.loader.annotation.RegItem;
import cn.mccraft.pangu.core.loader.creativetabs.SharedCreativeTab;
import net.minecraft.item.Item;

@SharedCreativeTab("panguBuilding")
public interface PBItems {

    @RegItem({"black","brick"})
    Item BLACK_BRICK = new PGItem();

    @RegItem({"bamboo","item"})
    Item BAMBOO_ITEM = new PGItem();

    @RegItem({"peeled","bamboo","item"})
    Item PEELED_BAMBOO_ITEM = new PGItem();
}

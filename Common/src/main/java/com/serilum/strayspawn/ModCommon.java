package com.serilum.strayspawn;

import com.natamus.collective.objects.SAMObject;
import com.serilum.strayspawn.config.ConfigHandler;
import net.minecraft.world.entity.EntityTypes;
import net.minecraft.world.item.Items;

public class ModCommon {

	public static void init() {
		ConfigHandler.initConfig();
		load();
	}

	private static void load() {
		new SAMObject(EntityTypes.SKELETON, EntityTypes.STRAY, Items.BOW, ConfigHandler.chanceSkeletonIsStray, false, false, false);
	}
}
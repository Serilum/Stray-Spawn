package com.natamus.strayspawn;

import com.natamus.collective.objects.SAMObject;
import com.natamus.strayspawn.config.ConfigHandler;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Items;

public class ModCommon {

	public static void init() {
		ConfigHandler.initConfig();
		load();
	}

	private static void load() {
		new SAMObject(EntityType.SKELETON, EntityType.STRAY, Items.BOW, ConfigHandler.chanceSkeletonIsStray, false, false, false);
	}
}
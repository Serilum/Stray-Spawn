package com.serilum.strayspawn;

import com.natamus.collective.globalcallbacks.ConfigCallback;
import com.natamus.collective.objects.SAMObject;
import com.serilum.strayspawn.config.ConfigHandler;
import com.serilum.strayspawn.util.Reference;
import net.minecraft.world.entity.EntityTypes;
import net.minecraft.world.item.Items;

public class ModCommon {
	private static SAMObject samObject;

	public static void init() {
		ConfigHandler.initConfig();
		load();
	}

	private static void load() {
		samObject = new SAMObject(EntityTypes.SKELETON, EntityTypes.STRAY, Items.BOW, ConfigHandler.chanceSkeletonIsStray, false, false, ConfigHandler.onlySpawnStraysOnSurface, false, false, Integer.MAX_VALUE);
		samObject.dimensionIds = ConfigHandler.dimensionsToSpawnIn;
		samObject.biomeIds = ConfigHandler.biomesToSpawnIn;

		ConfigCallback.CONFIG_CHANGED.register((String modid) -> {
			if (!modid.equals(Reference.MOD_ID)) {
				return;
			}

			samObject.changeChance = ConfigHandler.chanceSkeletonIsStray;
			samObject.onlyOnSurface = ConfigHandler.onlySpawnStraysOnSurface;
			samObject.dimensionIds = ConfigHandler.dimensionsToSpawnIn;
			samObject.biomeIds = ConfigHandler.biomesToSpawnIn;
		});
	}
}
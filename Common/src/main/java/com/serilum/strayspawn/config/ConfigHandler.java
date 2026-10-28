package com.serilum.strayspawn.config;

import com.natamus.collective.config.DuskConfig;
import com.serilum.strayspawn.util.Reference;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ConfigHandler extends DuskConfig {
	public static HashMap<String, List<String>> configMetaData = new HashMap<String, List<String>>();

	@Entry(min = 0, max = 1.0) public static double chanceSkeletonIsStray = 0.25;
	@Entry public static boolean onlySpawnStraysOnSurface = false;
	@Entry(registry = "dimension") public static String dimensionsToSpawnIn = "";
	@Entry(registry = "worldgen/biome") public static String biomesToSpawnIn = "";

	public static void initConfig() {
		configMetaData.put("chanceSkeletonIsStray", Arrays.asList(
			"The chance a skeleton that has spawned is of the stray variant."
		));
		configMetaData.put("onlySpawnStraysOnSurface", Arrays.asList(
			"When enabled, strays will only spawn on the surface."
		));
		configMetaData.put("dimensionsToSpawnIn", Arrays.asList(
			"Dimensions in which skeletons can turn into strays, separated by a comma. Leave empty for every dimension. For example: 'minecraft:overworld,minecraft:the_nether'."
		));
		configMetaData.put("biomesToSpawnIn", Arrays.asList(
			"Biomes in which skeletons can turn into strays, separated by a comma. Biome tags work too, starting with a '#'. Leave empty for every biome. For example: 'minecraft:snowy_plains,#minecraft:is_mountain'."
		));

		DuskConfig.init(Reference.NAME, Reference.MOD_ID, ConfigHandler.class);
	}
}
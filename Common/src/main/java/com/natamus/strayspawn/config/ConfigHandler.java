package com.natamus.strayspawn.config;

import com.natamus.collective.config.DuskConfig;
import com.natamus.strayspawn.util.Reference;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ConfigHandler extends DuskConfig {
	public static HashMap<String, List<String>> configMetaData = new HashMap<String, List<String>>();

	@Entry(min = 0, max = 1.0) public static double chanceSkeletonIsStray = 0.25;

	public static void initConfig() {
		configMetaData.put("chanceSkeletonIsStray", Arrays.asList(
			"The chance a skeleton that has spawned is of the stray variant."
		));

		DuskConfig.init(Reference.NAME, Reference.MOD_ID, ConfigHandler.class);
	}
}
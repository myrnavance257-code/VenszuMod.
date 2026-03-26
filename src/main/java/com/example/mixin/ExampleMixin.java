package name.modid;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VenszuUtility implements ModInitializer {
    // This is the Logger, it lets you see mod messages in the Pojav/Zalith console
	    public static final Logger LOGGER = LoggerFactory.getLogger("venszu-utility");

		    @Override
			    public void onInitialize() {
				        // This code runs as soon as Minecraft starts loading
						        LOGGER.info("Venszu Utility Main Initialized!");
								    }
									}
								 
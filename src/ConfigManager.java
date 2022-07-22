import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ConfigManager {
    static volatile ConfigManager configManager;

    EatingChanceConfig eatingChanceConfig;

    public ConfigManager(EatingChanceConfig eatingChanceConfig) {
        this.eatingChanceConfig = eatingChanceConfig;
    }

    public static ConfigManager getConfigManager() {
        if(configManager == null) {
            synchronized (ConfigManager.class) {
                if(configManager == null) {
                    configManager = new ConfigManager(
                            ConfigReader.readConfig(Constants.EATING_CHANCE_PROPERTIES_FILE_PATH, EatingChanceConfig.class)
                    );
                }
            }
        }
        return configManager;
    }

}

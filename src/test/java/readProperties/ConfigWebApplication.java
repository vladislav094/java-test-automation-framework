package readProperties;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

public interface ConfigWebApplication {
    Config config = readConfig();

    static Config readConfig(){
        return ConfigFactory.load("application.conf");
    }

    String MainPage = readConfig().getString("mainUrl");
    String ButtonsPage = readConfig().getString("buttonsUrl");
    Boolean IsHeadless = readConfig().getBoolean("headless");

}

package readProperties;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({"file:src/test/java/readProperties/config.properties"})
public interface Configuration extends Config {
    @Key("headless")
    Boolean headless();
    @Key("mainUrl")
    String MainURL();

}

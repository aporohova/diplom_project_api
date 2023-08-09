package config;
import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:config/app.properties"
})

public interface AllureConfig extends Config {
    @Key("token")
    String token();

    @Key("xsrfToken")
    String xsrfToken();
}


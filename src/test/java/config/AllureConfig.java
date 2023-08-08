package config;
import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:config/allure.properties"
})

public interface AllureConfig extends Config{

    @Key("token")
    String getToken();

    @Key("xsrfToken")
    String getXsrfToken();
}



package guru.springframework.udemydi.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("udemy")
public class UdemyConstructorConfig {
    private final String username;
    private final String password;
    private final String jdbcurl;

    public UdemyConstructorConfig(String username, String password, String jdbcurl) {
        this.username = username;
        this.password = password;
        this.jdbcurl = jdbcurl;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getJdbcurl() {
        return jdbcurl;
    }
}


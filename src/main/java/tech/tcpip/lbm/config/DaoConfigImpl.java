package tech.tcpip.lbm.config;

import java.util.Optional;

/**
 * Created by santiago on 8/31/18.
 */
public class DaoConfigImpl implements DaoConfig {
    public Optional<String> getStringValue(String key) {
        if (key.startsWith("env.")){
            String envKey = key.substring(4);
            return Optional.ofNullable(System.getenv(envKey));
        }else if (key.startsWith("system.")){
            String syskey = key.substring(7);
            return Optional.ofNullable(System.getProperty(syskey));
        }
    }
}

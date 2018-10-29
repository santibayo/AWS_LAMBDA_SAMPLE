package tech.tcpip.lbm.config;

import java.util.Optional;

/**
 * Created by santiago on 8/31/18.
 */
public interface DaoConfig {

    public Optional<String> getStringValue(String key);
}

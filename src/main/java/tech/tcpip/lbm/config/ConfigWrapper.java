package tech.tcpip.lbm.config;

import java.util.Optional;

/**
 * Created by santiago on 8/31/18.
 */
public class ConfigWrapper {

    private DaoConfig config;

    public DaoConfig getConfig() {
        return config;
    }

    public void setConfig(DaoConfig config) {
        this.config = config;
    }

    public Optional<String> getValueAsString(String key){
        return this.config.getStringValue(key);
    }


    public int  getValueAsInteger(String key){
        Integer e = Integer.parseInt(this.getValueAsString(key).orElse("0"));
        return e;
    }


}

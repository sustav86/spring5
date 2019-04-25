package com.sustav.devtool.springinside;

import org.springframework.beans.factory.annotation.Autowired;

public class ProfilingController implements ProfilingControllerMBean {

    private boolean enabled = true;

    public boolean isEnabled() {
        return enabled;
    }

    @Autowired
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}

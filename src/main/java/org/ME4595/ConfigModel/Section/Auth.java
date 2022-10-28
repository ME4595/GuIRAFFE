package org.ME4595.ConfigModel.Section;

import org.ME4595.ConfigModel.Types.AuthType;

public abstract class Auth extends Section{
    protected AuthType type;

    public Auth(String authenticatorName){
        super("auth:" + authenticatorName);
    }

    @Override
    public void saveToConfigfile() {

    }

    @Override
    public void loadFromConfigFile(String sectionName) {

    }
}

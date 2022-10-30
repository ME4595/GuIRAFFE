package org.ME4595.ConfigModel.Section.Authenticators;

import org.ME4595.ConfigModel.Section.AuthSection;
import org.ME4595.ConfigModel.Types.AuthType;

public class SimpleAuthSection extends AuthSection {
    private String username;
    private String password;

    public SimpleAuthSection(String authenticatorName){
        super(authenticatorName);
        type = AuthType.simple;
    }

    @Override
    public void saveToConfigfile() {
        super.saveToConfigfile();
        //TODO: save subclass-specific fields
    }

    @Override
    public void loadFromConfigFile(String sectionName) {
        super.loadFromConfigFile(sectionName);
        //TODO: load subclass-specific fields
    }
}

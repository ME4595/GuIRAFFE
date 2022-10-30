package org.ME4595.ConfigModel.Section.Authenticators;

import org.ME4595.ConfigModel.Section.AuthSection;
import org.ME4595.ConfigModel.Types.AuthType;

import java.util.List;

public class PassAuthSection extends AuthSection {
    private String passname;
    private List<String> username_prefixes;
    private List<String> password_prefixes;

    public PassAuthSection(String authenticatorName){
        super(authenticatorName);
        type = AuthType.pass;
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

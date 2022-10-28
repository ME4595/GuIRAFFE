package org.ME4595.ConfigModel.Section.Authenticators;

import org.ME4595.ConfigModel.Section.Auth;
import org.ME4595.ConfigModel.Types.AuthType;

import java.util.List;

public class PassAuth extends Auth {
    private String passname;
    private List<String> username_prefixes;
    private List<String> password_prefixes;

    public PassAuth(String authenticatorName){
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

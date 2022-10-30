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
        username_prefixes.add("login");
        username_prefixes.add("username");
        username_prefixes.add("user");
        password_prefixes.add("password");
        password_prefixes.add("pass");
        password_prefixes.add("secret");
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
        //TODO: falls für username/password_prefixes ein Eintrag im bestehenden Config File steht, vor dem Laden ein mal Listen clearen um die default-Einträge zu entfernen
    }
}

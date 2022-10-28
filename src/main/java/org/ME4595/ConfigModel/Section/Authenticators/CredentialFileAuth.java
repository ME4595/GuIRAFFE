package org.ME4595.ConfigModel.Section.Authenticators;

import org.ME4595.ConfigModel.Section.Auth;
import org.ME4595.ConfigModel.Types.AuthType;

import java.io.File;

public class CredentialFileAuth extends Auth {
    private File path;

    public CredentialFileAuth(String authenticatorName){
        super(authenticatorName);
        type = AuthType.credential_file;
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

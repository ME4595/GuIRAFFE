package org.ME4595.ConfigModel.Section.Authenticators;

import org.ME4595.ConfigModel.Section.AuthSection;
import org.ME4595.ConfigModel.Types.AuthType;

public class TfaAuthSection extends AuthSection {
    public TfaAuthSection(String authenticatorName){
        super(authenticatorName);
        type = AuthType.tfa;
    }
}

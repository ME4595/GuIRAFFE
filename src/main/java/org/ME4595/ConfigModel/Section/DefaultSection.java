package org.ME4595.ConfigModel.Section;

import java.io.File;

public class DefaultSection extends Section{
    private File working_dir;
    private boolean explain = false;
    private boolean status = true;
    private boolean report = true;
    private boolean share_cookies = true;

    public DefaultSection(){
        super("DEFAULT");
    }

    @Override
    public void saveToConfigfile() {

    }

    @Override
    public void loadFromConfigFile(String sectionName) {

    }
}

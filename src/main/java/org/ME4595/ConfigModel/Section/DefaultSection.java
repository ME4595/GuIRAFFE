package org.ME4595.ConfigModel.Section;

import java.io.File;

public class DefaultSection extends Section{
    private File working_dir;

    private boolean explain;
    private boolean status;
    private boolean report;
    private boolean share_cookies;

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

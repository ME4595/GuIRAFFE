package org.ME4595.ConfigModel.Section;

public abstract class Section {
    private final String sectionName;

    protected Section(String sectionName){
        this.sectionName = sectionName;
    }

    public String getSectionName(){
        return sectionName;
    }

    public abstract void saveToConfigfile();
    public abstract void loadFromConfigFile(String sectionName);

    public String yesNo(boolean bool){
        return bool ? "yes" : "no";
    }
}

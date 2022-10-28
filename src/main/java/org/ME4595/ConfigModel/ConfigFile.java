package org.ME4595.ConfigModel;

import org.ME4595.ConfigModel.Section.Section;
import org.ini4j.Ini;

import java.util.HashMap;
import java.util.Map;

public class ConfigFile {
    private Map<String, Section> sections = new HashMap<>();

    public void addSection(Section section){
        sections.put(section.getSectionName(), section);
    }

    public Section getSection(String sectionName){
        return sections.get(sectionName);
    }

    public void removeSection(Section section){
        sections.remove(section.getSectionName());
    }

    public static void load(Ini configFile){
        //TODO
    }
}

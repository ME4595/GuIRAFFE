package org.ME4595.ConfigModel.Section;

import org.ME4595.ConfigModel.Types.*;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public abstract class CrawlSection extends Section{
    protected CrawlerType type;
    private boolean skip = false;
    private File output_dir; //TODO default wert //TODO verwendet PFERD einen absoluten Pfad oder einen relativ zum working_dir? Falls letzteres durch String ersetzen
    private RedownloadMode redownload = RedownloadMode.never_smart;
    private OnConflicMode on_conflict = OnConflicMode.prompt;
    private List<String> transform = new ArrayList<>();
    private int tasks = 1;
    private int downloads = tasks;
    private double task_delay = 0.0; //TODO verwendet PFERD single, double oder float?
    private boolean windows_paths = System.getProperty("os.name").toLowerCase().contains("windows");

    public CrawlSection(String crawlerName){
        super("crawl:" + crawlerName);
    }

    @Override
    public void saveToConfigfile() {

    }

    @Override
    public void loadFromConfigFile(String sectionName) {

    }
}

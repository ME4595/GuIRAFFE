package org.ME4595.ConfigModel.Section;

import org.ME4595.ConfigModel.Types.*;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class CrawlSection extends Section{
    private CrawlerType crawlerType;
    private boolean skip;
    private File output_dir; //TODO verwendet PFERD einen absoluten Pfad oder einen relativ zum working_dir? Falls letzteres durch String ersetzen
    private RedownloadMode redownload;
    private OnConflicMode on_conflict;
    private List<String> transform = new ArrayList<>();
    private int tasks;
    private int downloads;
    private double task_delay; //TODO verwendet PFERD single, double oder float?
    private boolean windows_paths;
    private Auth auth;

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

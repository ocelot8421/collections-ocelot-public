package hu.progmasters.list.blockbuster;

import java.util.ArrayList;
import java.util.List;

public class VideoTape {
     private String title;
     private int length;
     private List<String> mainActors;

    public VideoTape(String title, int length, List<String> mainActors) {
        this.title = title;
        this.length = length;
        this.mainActors = mainActors;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public List<String> getMainActors() {
        return mainActors;
    }

    public void setMainActors(List<String> mainActors) {
        this.mainActors = mainActors;
    }
}

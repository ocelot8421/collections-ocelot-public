package hu.progmasters.list.blockbuster;

import java.util.ArrayList;
import java.util.List;

public class BlockBuster {
    private List<VideoTape> videoTapes = new ArrayList<>();

    public void addTape(String title, int length, List<String> mainActors) {
        VideoTape newVideoTape = new VideoTape(title, length, mainActors);
        videoTapes.add(newVideoTape);
    }

    public boolean findTape(String title) {
        return makeTitleList().contains(title);
    }

    private List<String> makeTitleList() {
        List<String> videoTitles = new ArrayList<>();
        for (VideoTape videoTape : videoTapes) {
            videoTitles.add(videoTape.getTitle());
        }
        return videoTitles;
    }

    public VideoTape rentTape(String title) {

        List<String> titles = makeTitleList();
        VideoTape videoFound;

        if (titles.contains(title)) {
            int index = titles.indexOf(title);
            videoFound = new VideoTape(
                    videoTapes.get(index).getTitle(),
                    videoTapes.get(index).getLength(),
                    videoTapes.get(index).getMainActors()
            );
            videoTapes.remove(index);
            return videoFound;
        }
        return null;
    }

    public List<String> findByActor(String name){
        List<String> videoActorAppeared = new ArrayList<>();
        for (VideoTape videoTape : videoTapes) {
             if (videoTape.getMainActors().contains(name)){
                 videoActorAppeared.add(videoTape.getTitle());
             }
        }
        return videoActorAppeared;
    }

    @Override
    public String toString() {
        StringBuilder videoBuilder = new StringBuilder();
        for (VideoTape videoTape : videoTapes) {
            videoBuilder
                    .append(videoTape.getTitle()).append("\n")
                    .append("  ").append(videoTape.getLength()).append(" perc \n")
                    .append("  ").append(videoTape.getMainActors()).append("\n");
        }
        return videoBuilder.toString();
    }
}

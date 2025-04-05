import java.util.ArrayList;

public class Playlist {
    private String playlistName;
    private ArrayList<String> tracksInPlaylist= new ArrayList<>();

    public Playlist(String playlistName) {
        this.playlistName = playlistName;
        this.tracksInPlaylist = new ArrayList<>();

    }
    public String getPlaylistName() {
        return playlistName;
    }
    public ArrayList<String> getTracksInPlaylist() {
        return tracksInPlaylist;
    }
}
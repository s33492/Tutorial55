import java.util.ArrayList;

public class MusicLibrary {
    private ArrayList<Playlist> playlistsCollection = new ArrayList<>();
    public ArrayList<Playlist> getPlaylistsCollection() {
        return playlistsCollection;
    }
    private ArrayList<String> tracksCollection = new ArrayList<>();
    public ArrayList<String> getTracksCollection() {
        return tracksCollection;
    }
    public void addTrack(String track) {
        if(tracksCollection.contains(track)) {
            System.out.println(track + " is already in library");
        }
        else {
            tracksCollection.add(track);
            System.out.println("Added track: " + track);
        }
    }
    public void  displayTracks() {
        System.out.println("All tracks:");
        for (int i = 0; i < tracksCollection.size(); i++) {
            System.out.println(i+1+":" +tracksCollection.get(i));
        }
    }
    public void createPlaylist(String title) {
        boolean exists = false;
        for (Playlist playlist : playlistsCollection) {
            if(title == playlist.getPlaylistName()){
                exists = true;
                System.out.println( title+" is alredy in use");
                System.out.println();
                break;
            }
        }
        if(!exists){playlistsCollection.add(new Playlist(title));
            System.out.println("Playlist created: " + title);

        }

    }
    public void addTrackToPlaylist(String track, String playlistName) {
        boolean found = false;
        if( tracksCollection.contains(track)) {
            for (Playlist playlist : playlistsCollection) {
                if (playlist.getPlaylistName().equals(playlistName)) {
                    found = true;
                    playlist.getTracksInPlaylist().add(track);
                    System.out.println(track + " added to playlist " + playlistName);
                    return;
                }

            }
            if (!found) {
                System.out.println("Playlist does not exist");
                System.out.println();
            }

        }
        else {
            System.out.println("Song Not Added to Playlist, could not be found in MusicLibrary");
        }

    }
    public void removeTrack(String track) {
        for (int i = 0; i < tracksCollection.size(); i++) {
            if (tracksCollection.get(i).equals(track)) {
                System.out.println(track + " was removed");
                tracksCollection.remove(i);
            }
        }
        for (Playlist playlist : playlistsCollection) {
            if (playlist.getTracksInPlaylist().contains(track)) {
                playlist.getTracksInPlaylist().remove(track);
            }
        }

    }
    public void displayPlaylist(String playlistName) {
        boolean found = false;

        for (Playlist playlist : playlistsCollection) {
            if (playlist.getPlaylistName().equals(playlistName)) {
                found = true;
                System.out.println(playlist.getPlaylistName());
                System.out.println(playlist.getTracksInPlaylist());
                System.out.println();
                return;
            }
        }
        if (!found) {
            System.out.println("Playlist does not exist");
            System.out.println();
        }

    }
    public void searchTracks(String phrase) {
        System.out.println("tracks with the phrase " +"'"+ phrase+"'");
        for (int i = 0; i < tracksCollection.size(); i++) {
            if(tracksCollection.get(i).contains(phrase)) {
                System.out.println(tracksCollection.get(i));

            }
        }

    }
    public void displayAllPlaylists() {
        System.out.println("All playlists:");
        getPlaylistsCollection().forEach(playlist -> System.out.println(playlist.getPlaylistName()));
        System.out.println();
    }
    public int getTrackCount(){
        return tracksCollection.size();
    }
    public int getPlaylistCount(){
        return playlistsCollection.size();
    }
}
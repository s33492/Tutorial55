public class Main {
    public static void main(String[] args) {
        MusicLibrary myLibrary = new MusicLibrary();

        myLibrary.addTrack("Led Zeppelin - Stairway to Heaven");
        myLibrary.addTrack("Queen - Bohemian Rhapsody");
        myLibrary.addTrack("Pink Floyd - Comfortably Numb");
        myLibrary.addTrack("AC/DC - Back in Black");
        myLibrary.addTrack("Metallica - Nothing Else Matters");
        myLibrary.addTrack("Led Zeppelin - Stairway to Heaven");
        myLibrary.addTrack("Queen -  Rhapsody");



        System.out.println();

        myLibrary.displayTracks();
        System.out.println();


        myLibrary.createPlaylist("Favorites");
        myLibrary.createPlaylist("Party");
        myLibrary.createPlaylist("Favorites");

        System.out.println();


        System.out.println();

        myLibrary.addTrackToPlaylist("Queen - Bohemian Rhapsody",
                "Favorites");
        myLibrary.addTrackToPlaylist("Pink Floyd - Comfortably Numb",
                "Favorites");
        myLibrary.addTrackToPlaylist("AC/DC - Back in Black", "Party");
        myLibrary.addTrackToPlaylist("Metallica - Nothing Else Matters",
                "Party");
        System.out.println();


        myLibrary.displayPlaylist("Party");

        myLibrary.searchTracks("Queen");
        System.out.println();
        myLibrary.searchTracks("Numb");
        System.out.println();


        myLibrary.removeTrack("AC/DC - Back in Black");
        myLibrary.displayPlaylist("Party");
        myLibrary.displayTracks();
        System.out.println();


        myLibrary.displayAllPlaylists();

        System.out.println("Total number of tracks in the library: " +
                myLibrary.getTrackCount());
        System.out.println("Total number of playlists: " +
                myLibrary.getPlaylistCount());
    }

}

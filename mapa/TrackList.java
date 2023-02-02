package mapa;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;

public class TrackList {

    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<>();

        trackList.put("Cancion 1", "letra  sd fs dfsdfs");
        trackList.put("Cancion 2", "asdasd asd a sd  qwef w ef wef");
        trackList.put("Cancion 3", "vzcvbxcvbnxcbnvbn vbn cvbncvb ncvbn");
        trackList.put("Cancion 4", "fdfghtrtyrt rtyr t yyrthrt hrr rr");

        System.out.println(trackList.get("Cancion 1"));

        for (Map.Entry<String, String> entry : trackList.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

}

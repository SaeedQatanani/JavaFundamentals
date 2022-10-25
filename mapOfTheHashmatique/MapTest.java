import java.util.HashMap;
import java.util.Set;
public class MapTest{
    public static void main(String[] args){
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("hovana", "hovana oh nana");
        trackList.put("baby shark","baby shark do do do do");
        trackList.put("let it go", "let it go can't hold it back any more");
        trackList.put("shape of you", "The club isn't the best place to find love");
        String track = trackList.get("shape of you");
        System.out.println("\n Pull the song with shape of you title:");
        System.out.println(track);
        System.out.println("\n All the tracks:");
        Set<String> keys = trackList.keySet();
        for (String key : keys) {
            System.out.println(key+":"+trackList.get(key));
            // System.out.println(trackList.get(key));
        }
    }
}
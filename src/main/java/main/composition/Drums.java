package main.composition;

import org.jfugue.midi.MidiFileManager;
import org.jfugue.pattern.Pattern;
import org.jfugue.player.Player;
import org.jfugue.rhythm.Rhythm;

import java.io.File;

public class Drums {
    public Drums() {
    }


    public Rhythm kicks(int input, Rhythm prev){
        //oO
        return prev;
    }
    public void snares(){}
    public void kicks(){}

    public static void main(String[] args) {
        Rhythm rhythm = new Rhythm()
                .addLayer("O..oO...O..oOO..")
                .addLayer("..S...S...S...S.")
                .addLayer("^.`.^.`.^.`.^.`.")
                .addLayer("...............+")
                .addOneTimeAltLayer(3, 3, "...+...+...+...+")
                .setLength(4);

        Pattern combinedPattern = new Pattern(rhythm.getPattern().repeat(4));
        Pattern mainPattern= new Pattern("");
        try{

            MidiFileManager.savePatternToMidi(combinedPattern, new File("miusik.mid"));
            mainPattern = MidiFileManager.loadPatternFromMidi(new File("miusik.mid"));

        }catch (Exception e){

        }
        System.out.println(mainPattern);
        Player player = new Player(); player.play(combinedPattern.repeat(2));


    }
}

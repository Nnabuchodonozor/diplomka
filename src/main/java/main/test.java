package main;


import main.composition.*;
import main.utils.MidiUtils;
import main.utils.SemanticUtils;
import org.jfugue.midi.MidiFileManager;
import org.jfugue.pattern.Pattern;
import org.jfugue.player.Player;
import org.jfugue.rhythm.Rhythm;
import org.jfugue.theory.ChordProgression;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import java.util.Random;

public class test {



    public static void main(String[] args) {
        try {
//            MidiUtils midiUtils = new MidiUtils();
//
//            String randomBinaryString = "";
//            Random random = new Random();
//
//            for (int i = 0; i < 1000; i++) {
//                int bit = random.nextInt(2);
//                randomBinaryString += bit;
//            }
//
//            System.out.println(randomBinaryString);
//
//            String strInput = randomBinaryString;
////            String strInput = "01011000100110101101001001100101110" +
////                    "01101100110011110010010001100100" +
////                    "01111001101010011100011000011000" +
////                    "11000001010010011110100101000000" +
////                    "01101100110011110010010001100100" +
////                    "01111001101010011100011000011000" +
////                    "11000001010010011110100101000000" +
////                    "01101100110011110010010001100100" +
////                    "01111001101010011100011000011000" +
////                    "11000001010010011110100101000000" +
////                    "10110101001011100001010101000100";
//
//           Key key = new Key(strInput);
//
////            for (int i = 0; i < 32; i++){
////                Integer[] a = key.generateKeyTest(i);
////                Harmony harmony = new Harmony(a,strInput);
////                harmony.printChords();
////                System.out.println();
////            }
////
//            Integer[] a  = key.generateKey();
//            strInput = key.getStrInput();
//
//            Harmony harmony = new Harmony(a,strInput);
//
//            harmony.createFunctionalHarmony(10);
//            strInput = harmony.getStrInput();
//            List<Integer> chordProgression = harmony.getChordProgression();
//            List<Integer[]> chords = harmony.getChords();
//
//            String patternString = "V0 I[Piano] ";
////            patternString += chords.get(0)[0] + "w+" + chords.get(0)[1] + "w+" + chords.get(0)[2] + "w+" + chords.get(0)[3] + "w ";
//            Integer[] antedecent = new Integer[]{chords.get(0)[0],chords.get(0)[1],chords.get(0)[2],chords.get(0)[3]};
//            Arpeggios arpeggios = new Arpeggios(patternString);
//
//            for(int i = 1; i < chordProgression.size(); i++){
////                String arpegi[] = new String[]{antedecent[0]+"q",antedecent[1]+"q",antedecent[2]+"q",antedecent[3]+"q"};
////                antedecent = harmony.findClosestInversion(antedecent, chordProgression.get(i));
////             patternString += antedecent[0] + "w+" + antedecent[1] + "w+" + antedecent[2] + "w+" + antedecent[3] + "w ";
//
//            String arpegi[] = new String[]{ chords.get(chordProgression.get(i))[0] + "s",
//                    chords.get(chordProgression.get(i))[1] + "s",
//                    chords.get(chordProgression.get(i))[2] + "s",
//                    chords.get(chordProgression.get(i))[3] + "s"
//            };
//            arpeggios.arpegiateUpDown(arpegi,8);
//            }
////
//            String toplay = arpeggios.getPatternString();
//            patternString += toplay;
//            String melodyString = "";
//            Melody melody = new Melody(a);
//            for(int i = 0; i < 60; i++) {
//                melody.addRandomMelody(melodyString, new Instrument("Piano"), strInput);
//                strInput = melody.getStrInput();
//                melodyString=melody.getPatternString();
//            }
//            Integer[] parsedMelody = melody.parseMelody();
//            Rhytm mainRhytm = new Rhytm(strInput);
//            String[] rhytmisisedMelody = mainRhytm.createRhytmValues(parsedMelody,2,chords, chordProgression,2);
//            strInput= mainRhytm.getStrInput();
//            melodyString = String.join("", rhytmisisedMelody);
//            melodyString = "V1 " + melodyString;
//            Pattern pattern = new Pattern(patternString /*+ melodyString*/);
//
////            System.out.println(patternString + melodyString);
////            harmony.decodeFunctionalHarmony(chordProgression);
////            pattern.add(patternString);
////
//            MidiFileManager.savePatternToMidi(pattern, new File("miusik.mid"));
//            Pattern mainPattern = MidiFileManager.loadPatternFromMidi(new File("miusik.mid"));


//.......................................................................................
//            Melody melody = new Melody(a);
//            // add 4 note random motif
//            String patternString = "V0 ";
//            for(int i = 0; i < 12; i++) {
//                melody.addRandomMelody(patternString, null, strInput);
//                strInput = melody.getStrInput();
//                patternString=melody.getPatternString();
//            }
//            String motiv1 = patternString;
//            Motif motif = new Motif(patternString, patternString, a, strInput);
//            motif.developPattern();
//            patternString= motif.getPatternString();
//
//            Pattern pattern = new Pattern();
//            pattern.add(patternString);
////
//            MidiFileManager.savePatternToMidi(pattern, new File("miusik.mid"));
//            Pattern mainPattern = MidiFileManager.loadPatternFromMidi(new File("miusik.mid"));
//            System.out.println(mainPattern.toString());
//            String decodedSong =  midiUtils.parseIncomingNotes(mainPattern.toString());
//            System.out.println(decodedSong);
//            Motif decodeMotif = new Motif(motiv1,a,"",decodedSong);
//            decodeMotif.decodePattern();
//

//..............................................................................................................

//            SemanticUtils semanticUtils = new SemanticUtils();





//            Player player = new Player();
//            player.play(rhythm.getPattern().repeat(4));
            SemanticUtils semanticUtils = new SemanticUtils();
//            semanticUtils.encryptToMIDIFromFile("image.jpg","password");
//            semanticUtils.decryptFromMIDIToFile("encryptedBytes","password");

            semanticUtils.encryptToMIDIFromText("text","password");
            semanticUtils.decryptFromMIDIToText("encryptedBytes","password");

            //            semanticUtils.encryptToMIDIFromText("text","password");

//            File file = new File("song1.mp3"); // Sorrow.mp3 is the local mp3 music needs to be sent
//            FileInputStream loc = new FileInputStream(file);
//            byte[] rawMp3 = new byte[(int)file.length()];
//            loc.read(rawMp3);
//            System.out.println(rawMp3);
//            File file2 = new File("song2.mp3");
//            FileOutputStream fos = new FileOutputStream(file2);
//            fos.write(rawMp3);
//            fos.flush();
//            fos.close();



//      String openText = "this is sacred message";
////      I need to provide a seed
//            String seed = "seed";
//            //iv should generate by itself
//            semanticUtils.encryptToMIDIFromText(openText, seed);
//            semanticUtils.decryptFromMIDIToText("miusik.mid","encryptionKey");


        }catch (Exception e){
            e.printStackTrace();
        }


    }
}

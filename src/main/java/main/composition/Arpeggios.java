package main.composition;

import java.util.*;

public class Arpeggios {
    String patternString = "";



    String strInput;
    public Arpeggios(String patternString) {

        this.patternString = patternString;
    }

    public String getPatternString() {
        return patternString;
    }

    public void setPatternString(String patternString) {
        this.patternString = patternString;
    }

    public void arpegiateUpDownRepeated(String[] notes, int length){
        for(int i = 0; i < length; i++){
            patternString+= notes[0] + " ";
            patternString+= notes[1]+ " ";
            patternString+= notes[2]+ " ";
            patternString+= notes[3]+ " ";
            patternString+= notes[3]+ " ";
            patternString+= notes[2]+ " ";
            patternString+= notes[1]+ " ";
            patternString+= notes[0]+ " ";
        }
    }

    public void arpegiateUpDown(String[] notes, int length){
        for(int i = 0; i < length; i++){
            patternString+= notes[0] + " ";
            patternString+= notes[1]+ " ";
            patternString+= notes[2]+ " ";
            patternString+= notes[3]+ " ";
            patternString+= notes[2]+ " ";
            patternString+= notes[1]+ " ";
        }
    }

    public void arpegiateUp(String[] notes, int length){
        for(int i = 0; i < length; i++){
            patternString+= notes[0] + " ";
            patternString+= notes[1]+ " ";
            patternString+= notes[2]+ " ";
            patternString+= notes[3]+ " ";
        }
    }

    public void arpegiateDown(String[] notes, int length){
        for(int i = 0; i < length; i++){
            patternString+= notes[3]+ " ";
            patternString+= notes[2]+ " ";
            patternString+= notes[1]+ " ";
            patternString+= notes[0]+ " ";
        }
    }

    public void arpegiateRandom(String[] notes, int length){
        Random random = new Random();
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(0);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        for(int i = 0; i < length; i++){
            Collections.shuffle(numbers, random);
            patternString+= notes[numbers.get(0)]+ " ";
            patternString+= notes[numbers.get(1)]+ " ";
            patternString+= notes[numbers.get(2)]+ " ";
            patternString+= notes[numbers.get(3)]+ " ";
        }

    }


    public String decodeRandomInput(String[] notes, Integer[] originalChord){
        List<Integer[]> perms = Arrays.asList(
                new Integer[]{0,1,2,3},
                new Integer[]{0,1,3,2},
                new Integer[]{0,2,1,3},
                new Integer[]{0,2,3,1},
                new Integer[]{0,3,1,2},
                new Integer[]{0,3,2,1},
                new Integer[]{1,0,2,3},
                new Integer[]{1,0,3,2},
                new Integer[]{1,2,0,3},
                new Integer[]{1,2,3,0},
                new Integer[]{1,3,0,2},
                new Integer[]{3,0,1,2},
                new Integer[]{3,0,2,1},
                new Integer[]{3,1,2,0},
                new Integer[]{3,2,0,1},
                new Integer[]{3,2,1,0}
        );
            //original 7 8 3 2    (0 1 2 3)
            // permuted 3 8 2 7   (2 1 3 0)
           //
        for (int i = 0; i< perms.size(); i++){
            if((Integer.parseInt(notes[0])==originalChord[perms.get(i)[0]]) &&
                    (Integer.parseInt(notes[1])==originalChord[perms.get(i)[1]]) &&
                    (Integer.parseInt(notes[2])==originalChord[perms.get(i)[2]]) &&
                    (Integer.parseInt(notes[3])==originalChord[perms.get(i)[3]])
            ){
                return this.getChoiceString(i,4);
            }
        }

        return "2";
    }

    public void arpegiateRandomInput(String[] notes, int length){  // half the length because pattern should be repeated
        List<Integer[]> perms = Arrays.asList(
                new Integer[]{0,1,2,3},
                new Integer[]{0,1,3,2},
                new Integer[]{0,2,1,3},
                new Integer[]{0,2,3,1},
                new Integer[]{0,3,1,2},
                new Integer[]{0,3,2,1},
                new Integer[]{1,0,2,3},
                new Integer[]{1,0,3,2},
                new Integer[]{1,2,0,3},
                new Integer[]{1,2,3,0},
                new Integer[]{1,3,0,2},
                new Integer[]{3,0,1,2},
                new Integer[]{3,0,2,1},
                new Integer[]{3,1,2,0},
                new Integer[]{3,2,0,1},
                new Integer[]{3,2,1,0}
        );
        for (int i = 0; i < length;i++){
            int choice = this.getChoice(4);
            for(Integer a : perms.get(choice)){
                patternString += notes[a]+" ";
            }
            for(Integer a : perms.get(choice)){
                patternString += notes[a]+" ";
            }
        }
    }



    public String getStrInput() {
        return strInput;
    }

    public void setStrInput(String strInput) {
        this.strInput = strInput;
    }

    public int getChoice(int length){
        String a = strInput.substring(0,length);
//        System.out.print(a);
        strInput = strInput.substring(length);
        return Integer.parseInt(a, 2);
    }

    private String getChoiceString(int choice, int length){
        String s= Integer.toBinaryString(choice);
        while (s.length()<length){
            s = "0"+s;
        }
        return s;
    }

}

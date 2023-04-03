package main;

import main.commands.DecryptCommand;
import main.commands.EncryptCommand;
import main.commands.ImportCommand;
import main.commands.ShowCommand;
import main.utils.GUI;
import org.jline.reader.LineReader;
import org.jline.reader.LineReaderBuilder;
import org.jline.terminal.Terminal;
import org.jline.terminal.TerminalBuilder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("hello w");
//        GUI gui = new GUI();

            TerminalBuilder terminalBuilder = TerminalBuilder.builder();
            Terminal terminal = terminalBuilder.build();

            LineReader reader = LineReaderBuilder.builder().terminal(terminal).build();
            String line;
            while ((line = reader.readLine("> ")) != null){
//                System.out.println(line);
                ArrayList<String> splitedLine = new ArrayList<>( Arrays.asList( line.split(" ")));
            switch (splitedLine.get(0)){
                case "import":
                    ImportCommand importCommand = new ImportCommand(splitedLine);
                    importCommand.execute();
                    break;
                case "encrypt":
                    EncryptCommand encryptCommand = new EncryptCommand(splitedLine);
                    encryptCommand.execute();
                    break;
                case "decrypt":
                    DecryptCommand decryptCommand = new DecryptCommand(splitedLine);
                    decryptCommand.execute();
                    break;
                case "show":
                    ShowCommand showCommand = new ShowCommand(splitedLine);
                    showCommand.execute();
                    break;
                default:
                    System.out.println("Incorrect Usage: ");
                    break;
            }
                if (splitedLine.get(0).equals("quit")){
                    terminal.close();
                    break;
                }
            }


        }catch (Exception e){
            e.printStackTrace();
        }

    }
}

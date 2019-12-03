import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

class Day2 {
    private static String operate(int pos, String command){
    	ArrayList<Integer> cmds = new ArrayList<>();
    	for (String s : command.split(",")) {
    		cmds.add(Integer.parseInt(s));
    	}
    	if (pos == cmds.size()) {
    		return command;
    	}
    	else if (cmds.get(pos) == 99) {
    		return command;
    	}
    	else if (cmds.get(pos) == 1) {
    		System.out.printf("adding %d and %d%n", cmds.get(cmds.get(pos+1)), cmds.get(cmds.get(pos+2)));
    		cmds.set(cmds.get(pos+3), cmds.get(cmds.get(pos+1)) + cmds.get(cmds.get(pos+2)));
    		pos += 4;
    	}
    	else if (cmds.get(pos) == 2) {
    		System.out.printf("multiplying %d and %d%n", cmds.get(cmds.get(pos+1)), cmds.get(cmds.get(pos+2)));
    		cmds.set(cmds.get(pos+3), cmds.get(cmds.get(pos+1)) * cmds.get(cmds.get(pos+2)));
    		pos += 4;
    	}
    	String newCmd = "";
    	for (Integer d : cmds) {
    		newCmd += d.toString();
    		newCmd += ",";
    	}
    	newCmd = newCmd.substring(0,newCmd.length() - 1);
    	System.out.println(newCmd);
    	return operate(pos, newCmd);
    }
    public static void main(String[] args){
        try {
            if (args.length != 1){
                System.err.println("Expected filename argument");
                return;
            }
            Scanner fscan = new Scanner(new File(args[0]));
            String input = "";
            while (fscan.hasNextLine()){
                input += fscan.nextLine();
            }
            System.out.printf("Output is: %s%n", operate(0, input));
        }
        catch (FileNotFoundException e){
            System.err.println("File not found.");
        }
    }
}

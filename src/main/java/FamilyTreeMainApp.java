import java.util.HashMap;
import java.util.Scanner;

public class FamilyTreeMainApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        FamilyTree familyTree = new FamilyTree(new HashMap<>(), new HashMap<>());
        while (true) {
            try {
                System.out.println("Enter the Query or type CLOSE to end the program: ");
                String query = scanner.nextLine();
                String[] commands = query.split(" ");
                if ("family-tree".equals(commands[0])) {
                    String command = commands[1].toLowerCase();
                    String subCommand;
                    switch (command) {
                        case "add":
                            subCommand = commands[2].toLowerCase();
                            processAddCmd(commands, subCommand, familyTree);
                            break;
                        case "count":
                            subCommand = commands[2].toLowerCase();
                            processCountCmd(commands, subCommand, familyTree);
                            break;
                        case "connect":
                            String name1 = commands[2];
                            String name2 = commands[6];
                            String relation = commands[4].toLowerCase();
                            familyTree.connectPerson(name1, name2, relation);
                            break;
                        default:
                            familyTree.showFamMembers(commands[3], command);
                            break;
                    }

                } else {
                    break;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ERR08 - Invalid Query cmd");
                System.out.println(e.getMessage());
            }
        }

    }

    public static void processCountCmd(String[] commands, String subCommand, FamilyTree familyTree) {
        switch (subCommand) {
            case "son":
            case "sons":
                System.out.println("Count of sons: " + familyTree.countSons(commands[4]));
                break;
            case "spouse":
            case "wife":
            case "wives":
                System.out.println("Count of wives: " + familyTree.countWives(commands[4]));
                break;
            case "daughter":
            case "daughters":
                System.out.println("Count of daughters: " + familyTree.countDaughters(commands[4]));
                break;
            default:
                System.out.println("ERR03 - Invalid Relation Sub command");
                break;
        }
    }

    public static void processAddCmd(String[] commands, String subCommand, FamilyTree familyTree) {
        if ("person".equals(subCommand)) {
            familyTree.addPerson(commands[3]);
        } else if ("relationship".equals(subCommand)) {
            familyTree.addRelationship(commands[3]);
        } else {
            System.out.println("ERR01 - Invalid Query");
        }
    }
}

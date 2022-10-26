import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class UserLoginTest {

    public static void main(String[] args) {
        String searchDate = "Oct 02";
        String tempData;
        String inputFileName = "Input.txt";
        String outputFileName = "Output.txt";
        UserLoginLinkedList loginList = generateLoginList(inputFileName);

        tempData = "List of users who logged into the system";
        writeData(outputFileName, tempData);
        writeData(outputFileName, loginList);

        tempData = "List of users who logged into the system on "+searchDate;
        writeData(outputFileName, tempData);
        writeData(outputFileName, loginList.searchDate(searchDate));

    }

    private static void writeData(String outputFileName, String tempData){
        try {
            Files.writeString(Path.of(outputFileName), tempData, StandardOpenOption.APPEND);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private static void writeData(String outputFileName,UserLoginLinkedList loginList){
        Node current = loginList.getFirst();
        while(current != null){
            UserLogin userLogin = current.getData();
            writeData(outputFileName, userLogin.toString());
            current = current.getNext();
        }

    }

    private static UserLoginLinkedList generateLoginList(String inputFileName){
        UserLoginLinkedList userLoginLinkedList = new UserLoginLinkedList();
        File file = new File(inputFileName);
        Scanner scanFile = null;
        try {
            scanFile = new Scanner(file);
            while(scanFile.hasNextLine()){
                String line = scanFile.nextLine();
                String[] parts = line.split("-");
                UserLogin userLogin = new UserLogin(parts[0],  Long.valueOf(parts[1]), parts[2], parts[3]);
                userLoginLinkedList.add(userLogin);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return userLoginLinkedList;
    }
}
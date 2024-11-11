package hashing;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class studentHash {
    public static void main(String[] args) {
        
        HashMap<Integer, List<Integer>> studentIDMap = new HashMap<>();
        int studentID;
        
        try {
            BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
            String line;
            
            while ((line = reader.readLine()) != null) {
                try {
                    studentID = Integer.parseInt(line.trim()); 
                    hashMethod(studentID, studentIDMap);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid student ID format: " + line);
                }
            }
            
            reader.close(); 
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        
        if(studentIDMap.isEmpty()) System.out.println("StudentIDMap: 'input.txt' is empty");
        else {
        	System.out.println("StudentIDMap");
        	for (Integer hashKey : studentIDMap.keySet()) {
                System.out.println("Hash Key: " + hashKey + " => " + studentIDMap.get(hashKey));
            }
        }
        
        

        
    }
    
    public static void hashMethod(int studentID, HashMap<Integer, List<Integer>> studentIDMap) {
    	
    	int hashKey = studentID % 100;

        if(studentIDMap.containsKey(hashKey)) {

        	studentIDMap.get(hashKey).add(studentID);
        } else {
            List<Integer> studentList = new ArrayList<>();
            studentList.add(studentID);
            studentIDMap.put(hashKey, studentList);
        }
    }
}

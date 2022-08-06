package io.github.sandeeplakka.dcp;

import java.io.*;
import java.util.List;

/**
 * This problem was asked by Uber.
 *
 * On election day, a voting machine writes data in the form <code>(voter_id, candidate_id)</code> to a text file.
 * Write a program that reads this file as a stream and returns the top 3 candidates at any given time.
 * If you find a voter voting more than once, report this as fraud.
 *
 *
 *Level: Easy
 */
public class VotingMachineStats {

    private void writeVotes(File file, int voterId, int candidateId){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))){
            writer.append(String.format("(%d, %d)%n",voterId, candidateId));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        VotingMachineStats ut = new VotingMachineStats();
        File file = new File("test");
        if(file.exists()) file.delete();
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        ut.writeVotes(file, 1, 2);
        //ut.findTop3Candidates(file);
        ut.writeVotes(file, 2, 2);
        //ut.findTop3Candidates(file);
        ut.writeVotes(file, 3, 1);
        ut.findTop3Candidates(file);
    }

    public List<Integer> findTop3Candidates(File file){
        try(BufferedReader reader = new BufferedReader(new FileReader(file))){
            reader.lines().forEach(System.out::println);
        }catch (IOException e){
            e.printStackTrace();
        }
        return null;
    }
}

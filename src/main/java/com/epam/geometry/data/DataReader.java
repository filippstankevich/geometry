package com.epam.geometry.data;

import com.epam.geometry.Director;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class DataReader {
    private static final Logger logger = LogManager.getLogger(DataReader.class);

    //TODO: implement this method using BufferedReader, do not throw original IOException, wrap it with your own
    public List<String> readLines(String filename) throws DataException {

        logger.info("Start reading lines from file");
        List<String> lines = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))){

            String thisLine = null;
            while ((thisLine = br.readLine()) != null) {
                lines.add(thisLine);
            }
        } catch(Exception e) {
            logger.error(e.getStackTrace());
            throw new DataException(e.getMessage(),e.getCause());
        }
        logger.info("Returning list of " + lines.size() + " lines");
        return lines;

    }
}

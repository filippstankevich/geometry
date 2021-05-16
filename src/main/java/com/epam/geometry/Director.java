package com.epam.geometry;

import com.epam.geometry.creator.Creator;
import com.epam.geometry.data.DataReader;
import com.epam.geometry.logic.PointLogic;
import com.epam.geometry.validator.Validator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class Director<T> {

    private static final Logger logger = LogManager.getLogger(Director.class);

    private final DataReader reader;
    private final Validator validator;
    private final Creator creator;


    public Director(DataReader reader, Validator validator, Creator creator) {
        this.creator = creator;
        this.validator = validator;
        this.reader = reader;
    }

    // Input file contains multiple lines, each line a geometry object
    // i.e. each line contains all necessary data to create object in a simple format like: 1.0 2.0 3.0
    // some line
    public List<T> process(String filename){
        // Read lines from file
        logger.info("Processing a file " + filename);
        List result = new ArrayList();
        List<String> lines = reader.readLines(filename);

        for (String line:  lines   ) {
            if (validator.validate(line)){
                result.add(creator.create(line));
            }

        }
        logger.info("Returning " + result.size() + "records");
        return result;
    }
}

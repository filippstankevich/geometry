package com.epam.geometry;

import com.epam.geometry.creator.CircleCreator;
import com.epam.geometry.creator.Creator;
import com.epam.geometry.creator.PointCreator;
import com.epam.geometry.data.DataReader;
import com.epam.geometry.model.Circle;
import com.epam.geometry.model.Point;
import com.epam.geometry.validator.CircleValidator;
import com.epam.geometry.validator.PointValidator;
import com.epam.geometry.validator.Validator;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.Assert.*;

// Write tests using Mockito to mock dependencies
public class DirectorMockitoTest {

    private String testFileName = "testFileName";
    private String testCircleString = "2;7;8";
    private String testPointString = "2;7";

    private Validator pointValidator;
    private Validator circleValidator;
    private Creator<Point> pointCreator;
    private Creator<Circle> circleCreator;
    private DataReader stubReader;
    private Director<Point> pointDirector;
    private Director<Circle>circleDirector;

    @Before
    public void setUp() {

        stubReader = mock(DataReader.class);
        pointCreator = new PointCreator();
        pointValidator = new PointValidator();
        pointDirector = new Director(stubReader,pointValidator,pointCreator);

        circleCreator = new CircleCreator();
        circleValidator = new CircleValidator();
        circleDirector = new Director(stubReader,circleValidator,circleCreator);


    }
    @Test
    public void directorCreatePoints(){
        List<String> pointsStrings = new ArrayList<>();
        pointsStrings.add(testPointString);
        when(stubReader.readLines(anyString())).thenReturn(pointsStrings);//list of strings

        List<Point> pointsList = pointDirector.process(testFileName);
        assertTrue(pointsList.size() == 1 );

        Point expectPoint = new Point(2f,7f);
        assertTrue(pointsList.contains(expectPoint));

    }
    @Test
    public void directorCreateCircle(){
        List<String> circleStrings = new ArrayList<>();
        circleStrings.add(testCircleString);
        when(stubReader.readLines(anyString())).thenReturn(circleStrings);//list of strings

        List<Circle> circleList = circleDirector.process(testFileName);
        assertTrue(circleList.size() == 1 );

        Circle expectCircle = new Circle(2f,7f,8f);
        assertTrue(circleList.contains(expectCircle));

    }

}

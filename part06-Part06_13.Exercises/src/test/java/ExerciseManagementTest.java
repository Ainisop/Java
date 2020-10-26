/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class ExerciseManagementTest {
    private ExerciseManagement management;
    
    @Before
    public void initialize(){
        management = new ExerciseManagement();
    }
    
    @Test
    public void exerciseListEmptyAtbeginning() { 
       // ExerciseManagement management = new ExerciseManagement();
        assertEquals(0, management.exerciseList().size());
    }
    @Test
    public void addingExerciseGrowsListByOne() {
       // ExerciseManagement management = new ExerciseManagement();
        management.add("Write a test");
        assertEquals(1, management.exerciseList().size());
        
    }
    @Test
    public void addedExerciseIsInList() {
      //  ExerciseManagement management = new ExerciseManagement();
        management.add("Write a test");
        assertTrue(management.exerciseList().contains("Write a test"));
    }
    @Test
    public void exerciseCanBeMarkedAsCompleted(){
        management.add("New exercise");
        management.markAsCompleted("New exercise");
        assertTrue(management.isCompleted ("New exercise"));
    }
    @Test
    public void ifNotMarkedCompletedIsNotCompleted() {
        management.add("New exercise");
        management.markAsCompleted("New exercise");
        assertFalse(management.isCompleted("Some exercise"));
    }
}
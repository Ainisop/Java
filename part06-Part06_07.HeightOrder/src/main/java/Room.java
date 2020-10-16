
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ainis
 */
public class Room {
    private ArrayList<Person> value;
    public Room(){
        this.value = new ArrayList<>();
    }
    public void add(Person person){
        this.value.add(person);
    }
    public boolean isEmpty(){
        if (this.value.isEmpty()){
            return true;
        } else 
            return false;
    }
    public ArrayList<Person> getPersons(){
        
        for (Person persons : this.value){
            
        }
           return this.value;     
    }
    public Person shortest(){
         if (this.value.isEmpty()) {
        return null;
    }
        Person returnObject = this.value.get(0);
        for (Person persons : this.value){
          if (returnObject.getHeight() > persons.getHeight()){
              returnObject = persons;
          }
              
        }
        return returnObject;
    }
    public Person take(){
        Person shortestPerson = this.shortest();
        this.value.remove(shortestPerson);
        return shortestPerson;
    }
}

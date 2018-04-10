package Data;

import Bridge.CreateSurvey;
import Observer.Observer;
import Observer.Subject;

import java.util.ArrayList;

//Database for our surveys and subject of the observer, when a new survey is added to the list the observer it notified

public class Surveys implements Subject{

    public ArrayList<CreateSurvey> surveys;
    private ArrayList<Observer> observers;

    public Surveys(){
        surveys = new ArrayList<CreateSurvey>();
        observers = new ArrayList<Observer>();
    }

    public void addSurvey(CreateSurvey createSurvey){
        surveys.add(createSurvey);
        Notify();
    }

    public ArrayList<CreateSurvey> getSurveys(){
        return surveys;
    }

    public void Attach(Observer o){
        observers.add(o);
    }

    public void Detach(Observer o){
        observers.remove(o);
    }

    public void Notify() {
        for (int i = 0; i < observers.size(); i++){
            observers.get(i).update(this);
        }
    }
}

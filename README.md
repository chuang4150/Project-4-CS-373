# Project-3-COMP373


For our Project 3, we implemented the Bridge and Observer pattern within this command line program. This program prints out three types of survey questions to the terminal. The three question types are True & False, Rating and multiple choice. 


## Our project solution is located within the src/main/java directory.


### Bridge Pattern


The Bridge pattern is represented by the Questions interface being the implementor and the Survey Class representing the abstraction, which make them independent from each other. The Questions interface also extends to three normal classes, which could be modified without disupting the program.



### Observer Pattern


The Observer pattern is represented by the AnswerSurvey class being the Observer and the Surveys class being the Subject. In our program when a new survey is added, the subject notifies the the observer and updates the list.

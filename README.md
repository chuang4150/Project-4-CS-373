# Project-3-COMP373


For our Project 3, we implemented the Bridge and Observer pattern within an example of a survey/form program with a command line interface. This program emulates a survey being updated with three new questions one after the other. Each time you answer a question a you will be notified of a new survey and given the option to answer all the surveys or just the newest one. The three question types are True & False, Rating and multiple choice. 


## Our project solution is located within the src/main/java directory.


### Bridge Pattern


The Bridge pattern is represented by the QuestionType interface with the concrete classes for the different types of questions. Then the Abstract class Surveys delcares an instance of QuestionType and the refined abstraction CreateSurvey is passed a QuestionType to create the desired kind of survey question. 



### Observer Pattern


The Observer pattern is represented by the AnswerSurvey class being the Observer and the Surveys class being the Subject. Surveys acts a database for all of our surveys. When a new survey is added to the list in Surveys, AnswerSurey is notified and the code to show users the new question is run. 

# Project-3-COMP373


For our Project 4, we implemented the Visitor and Mediator pattern within an example of a survey/form program with a command line interface. This program emulates a survey being updated with three new questions one after the other. Each time you answer a question a you will be notified of a new survey and given the option to answer all the surveys or just the newest one. The three question types are True & False, Rating and multiple choice.


## Our project solution is located within the src/main/java directory.


### Visitor Pattern


The Visitor pattern is represented by the Visitor interface with the AnswerCheckVisitor class. The Visitor class checks wherther or not the survey response the user inputted through the console is a valid response. EX. If the survey is under the rating category, then the visitor class would check if the user input a single response of within the range of (1-5). The Visitor interface would then allow for the visitiation of these survey classes to enforce these checks. 


### Mediator Pattern


The Observer pattern is represented by the AnswerSurvey class being the Observer and the Surveys class being the Subject. Surveys acts a database for all of our surveys. When a new survey is added to the list in Surveys, AnswerSurey is notified and the code to show users the new question is run. 

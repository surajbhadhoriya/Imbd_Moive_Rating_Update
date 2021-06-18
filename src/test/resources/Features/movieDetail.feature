Feature: feature to test search movie by name and get movie cast and movie plot

Scenario Outline: Get movie cast and movie plot by movie name

Given matching movie <movieName> title suggestions for the entered search team 
When Selecting a movie from suggestions renders Movie Details page 
And Movie Details page renders top cast
Then Movie Details page renders movie plot

 Examples:
   |movieName|
   |Radhe|
 
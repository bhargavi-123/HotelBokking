Feature: mobile verification



Scenario Outline: Failure in submitting on giving mobile number invalid
Given User is on the sampleform page 
When user enters <phoneno>
Then display alert message
Examples:
|phoneno|
|5000000000|
|0000000000|
|6745|
|9877898090|


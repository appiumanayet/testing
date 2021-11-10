@smoke
Feature: Longest word return
As a User I want to get the longest word returned from a provided file
  
  
  Scenario Outline: Return largest word   
    Given User provides a file with "<word_type>" word "<file_path>"  
    
    Examples:
    |file_path															|				word_type								|
    |DataFiles/file_alphanumeric.txt				| Alphanumeric 									|
    |DataFiles/file_letters.txt							| Alpha only										|
    |DataFiles/file_letterspecialchar.txt		| Alpha	with special charectar	|
    |DataFiles/file_numbers.txt							| Numbers only									|
    |DataFiles/file_numberspecialchar.txt		| Numbers with charectar				|
    |DataFiles/file_specialchar.txt					| Special charectar only				|
    |DataFiles/file_empty.txt								| Empty													|

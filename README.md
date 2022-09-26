# Programming Patterns - Exam 1 Section 3

This template repository is the starter project for Programming Patterns Exam 1 Section 3. Written in Java, and tested with Gradle/JUnit.

### Question(s)

Write a Java program that receives multiple lines of string blocks, and returns all possible strings which can be made by concatenating exactly one string block from each sub array together, with the condition that the concatenated strings must contain our target string or some rotation of our target string. E.g. If our target string is “mytarget”, then “<ins>**mytarget**</ins>ap” and “xl<ins>**tmytarge**</ins>” are both acceptable combinations, while “<ins>**rget**</ins>c<ins>**myta**</ins>” and “y<ins>**mytarg**</ins>g<ins>**et**</ins>ap” are not.

Example 1:  
Input:

input = {  
{"kdzmy", "myta", "etmy", "ytarg"},  
{"ym", "r", "ta", "yta", "xltm", "etc"},  
{"getap", "rg", "e", "tarz"}  
};  
target = "mytarget"

Output:

output = {"etmytarg", "mytargetap", "mytargetc", "rgetmyta", "targetmy", "xltmytarge", "ytargetmy"};

Example 2:  
Input:

input = {  
{"vi", "vifoo", "t", "i"},  
{"o", "olefoo", "le"},  
{"let", "vio", "tv"}  
};  
target = "violet"

Output:

output = {"letvio", "letvio", "letviolefoo", "olefooletvi",
"olefooletvifoo", "oletvi", "oletvifoo", "tviole", "tviolefoo", "violet", "violet"};

### Setup Command

`gradle clean`

### Run Command

`gradle test`

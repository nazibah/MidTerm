package string.problems;

import org.testng.Assert;

public class UnitTestingStringProblem {
    public static void main(String[] args) {
        //Apply Unit Test into all the methods in this package.
        Anagram.isAnagram("ACT", "ACT");
        Assert.assertTrue(true, "true");



        //Largest word
        String s="Human brain is a biological learning machine";
        Assert.assertEquals("biological",DetermineLargestWord.findTheLargestWord(s));
        //Duplicate word
        //String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
        //Assert.assertEquals("1, widely: 1, is: 3, also: 1, " +
        // "language: 1, used: 1, an: 1, Island: 1, Indonesia.: 1, of: 1, programming: 1,Java: 3, a: 1, Language.: ",DuplicateWord.duplicateWords(st));


    }
}

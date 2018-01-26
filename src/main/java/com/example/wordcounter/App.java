package com.example.wordcounter;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Word Count Testing App!");
    }
    
    public static int wordcount(String s) {
        if (!(s.trim().isEmpty()))
        {
            return s.trim().split("\\s+").length;
        }
       
        return 0;
    }
}

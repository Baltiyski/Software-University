﻿using System;

class Factorial
{
    static void Main(string[] args)
    {
        int n = int.Parse(Console.ReadLine());
        long result = 1;
        for (int i = 1; i <= n; i++)
        {
            result *= i; 
        }

        Console.WriteLine(result);
    }
}
package com.example.lab12kotlin

class Data{
    lateinit var result: Result
    class Result{
        lateinit var results:Array<Results>
        class Results{
            val Station = ""
            val Destination = ""
        }
    }
}
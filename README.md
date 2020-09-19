# gfg-assignment-1b

## Q2 Create a spring boot app which interacts with any no-sql database (mongodb or any other database that you are comfortable with) and perform all the below mentioned tasks in it. 

```
Book
{
	Int id, (optional)
	String name,
	String authorName
	int cost,

}
```

## Task 1 : 
Create GET API which will return all the books which have authorName passed in the API request i.e, you have to take authorName in the request Param and find all the books written by that particular author (3 marks)

## Task 2 : 
Create 2 POST APIs which will take in a list of books in the request body (not a single book) and then insert those in the mongo collection. 
But the catch here is, in 1 API you have to insert the books parallely using multiple threads
And in the second API you have to insert using repsoitory’s saveAll function without creating your threads

What is required in this task ?
Both APIs should be working correctly (i.e all the entries should be inserted in collection) and
You have to compare which API performs better the multithreaded one or API which is calling saveAll function

You have to write a small description about the difference b/w these 2, your personal views which one to use and why ?

Since this is a theoretical ques, you can write anything


Marks distribution  for this task : 1 mark for non multi threaded API  + 6 marks for multi threaded API  + 5 marks for your theoretical answer

In total you have to create 3 APIs for this project

---------------------------------xxxxxxxxxxxxxxxxxxxx------------------------------------------------------

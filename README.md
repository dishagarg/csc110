# csc110
csc110 lab material


Types of Array in java
----
There are two types of array:
* Single Dimensional Array
* Multidimensional Array


Multidimensional array in java
----
In this case, data is stored in row and column based index (also known as matrix form).

Syntax to Declare Multidimensional Array in java:
* dataType[][] arrayRefVar; (or)  
* dataType [][]arrayRefVar; (or)  
* dataType arrayRefVar[][]; (or)  
* dataType []arrayRefVar[];

Syntax to instantiate Multidimensional Array in java:
* dataType[][] arr=new dataType[3][3];//3 row and 3 column 
* dataType[][] arr = {   
					{ 1, 2, 3, 4, 5, 6 }, 
					{ 7, 8, 9, 10, 11, 12 },
					{ 13, 14, 15, 16, 17, 18 } 
				}; 

Example instantiation:
* int[][] arr=new int[3][3];//3 row and 3 column
* int[][] arr = {   
					{ 1, 2, 3, 4, 5, 6 }, 
					{ 7, 8, 9, 10, 11, 12 },
					{ 13, 14, 15, 16, 17, 18 } 
				}; 

To Note:
----
If operated mathematically(added/subtracted), characters in java return another character.
Example:
int temp = (int) ('a') + 1;
char var = (char) temp;
// var is now 'b'


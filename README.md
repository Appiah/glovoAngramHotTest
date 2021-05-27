Write a function to check whether two given strings are anagram of each other or not. An anagram of a string is another string that contains same characters, only the order of characters can be different.  For example, “abcd” and “dabc” are anagrams of each other.




//my process :

1. initialise the two string variables

2. create a method that takes the two strings to be compared

3. Within the method to be called : checkForAnagramness(x, y),
   a) get and compare the string lengths of the variables : x & y
	 b) if the lengths are a mismatch, then immediate return "false"
	 c) if the lengths are the same, convert the x and y to a charArray
	    (hint: use the ".toCharArray()" method)
	 d) create a map to help store the unique sets of the individual
	 characters in variables : x & y.
	    (hint : use HashMap with mapping of "Character" and "Integer")
			basically keep the individual characters as keys and the total
			occurance count as the value.
			{ Always check if the character does not exist, if(it exist, then store
				the character as a key with first count value as 1),
			If : the characters exist, then get the value (ie. the count : character occurance count) for the character
		at this index i, and increase it by 1 and update the key : value -> pair. }
	 e) now compare : map_x & map_y
	 f) if ( map_x  IS_EQUAL_TO map_y ) , then both x & y are anagrams
	 ( hint : in doing equals checks for map_x & map_y use ".equals()" )
	 {  ie. if ( map_x.equals(map_y){ return true;//ie. x & y are anagram } )  }

4. It would be prudent to refactor the code so that the string to char to map
is access as a method.

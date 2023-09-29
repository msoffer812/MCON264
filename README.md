# MCON264
I'm not sure what I should be writing - so I will just describe the different methods that can be used with the GenericArray

The GenericArray is a data structure that can hold any datatype

Constructors
  GenericArray() - no-arg constructor, initializes with a capacity of 5;\n
  GenericArray(int) - initializes a GenericArray with a specified size(otherwise it can contain 5 elements) 
  GenericArray(GenericArray) - copy constructor - copies a different array
Methods
   get(int) - returns element of specified index;
   set(int, T) - sets the value of specified index to specified value
   size() - returns the size of the array
   isEmpty() - returns boolean value of whether the GenericArray contains any non-null values
   add(T) - implements dynamic sizing - adds an element to the end of the array, and extends the capacity by one if the array is ful

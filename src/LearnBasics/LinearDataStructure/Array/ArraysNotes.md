# Java Arrays

An array is a collection of similar types of data.

An array in Java is a data structure that can

- **store** multiple **values of the same type**.
- The **elements** in an array are **stored in contiguous memory locations**.
- The **size of an array is fixed** and must be **specified at the time of array creation**.

### declare, instantiate, and initialize

Here's how you can declare, instantiate, and initialize an array in Java:

```java
// Declare an array
int[] myArray;

// Instantiate an array
myArray =new int[5];

// Initialize an array
myArray[0]=10;
myArray[1]=20;
myArray[2]=30;
myArray[3]=40;
myArray[4]=50;

```

You can also declare, instantiate, and initialize an array in one line:

```java
int[] myArray = { 10, 20, 30, 40, 50 };

```

### access elements of an array

To access elements of an array,

- you **use** the **index of the element**.
    - The index of an array starts from 0
    - and goes to n-1, where n is the size of the array.

```java
int firstElement = myArray[0]; // Access the first element
int lastElement = myArray[myArray.length - 1]; // Access the last element

```

### iterate over an array

To iterate over an array, you can use a for loop:

```java
for(int i = 0;
i<myArray.length;i++){
    System.out.

println(myArray[i]);
}

```

Or you can use a for-each loop:

```java
for(int element :myArray){
    System.out.

println(element);
}

```

<aside>
💡 Remember, if you try to access an array element outside of its valid range, Java will throw an `ArrayIndexOutOfBoundsException`.

</aside>

---

## Memory Allocation

In Java, memory allocation for arrays is done on the **heap**. When you declare an array, memory isn't allocated at that
time. It's only when you instantiate the array using the `new` keyword that memory is allocated.

The amount of memory allocated depends on the type of the array and its size. For instance, if you have an array of
integers (`int[]`), and integers take up 4 bytes of memory, an array of size 10 would take up 40 bytes of memory (10
elements * 4 bytes/element).

Here's a step-by-step breakdown:

1. Declare an array: `int[] myArray;`

- At this point, `myArray` is just a reference to an array, and no memory has been allocated for the array elements.

2. Instantiate the array: `myArray = new int[5];`

- Now, memory is allocated on the heap for 5 integers. The `myArray` reference points to this block of memory.

3. Initialize the array: `myArray[0] = 10; myArray[1] = 20; ...`

- The values are stored in the allocated memory.

Here's the code representation:

```java
// Declare an array
int[] myArray;

// Instantiate an array
myArray =new int[5]; // Allocates 20 bytes of memory on the heap (5 elements * 4 bytes/element)

// Initialize an array
myArray[0]=10; // Stores 10 in the first 4 bytes of the allocated memory
myArray[1]=20; // Stores 20 in the next 4 bytes, and so on...

```

Remember, in Java, when the array is no longer needed and there are no more references to it, it becomes eligible for
garbage collection, and the memory is freed up.

---

# Memory Allocation for 2 d Arrays

In Java, memory allocation for a 2D array is done in a row-major order. This means that the memory is allocated for each
row sequentially.

Here's a step-by-step explanation:

1. When you declare a 2D array, only a reference to the array is created. No actual array objects are created yet. This
   reference points to `null`.

```java
int[][] arr;

```

1. When you initialize the 2D array with a specific size, an array of references is created. Each reference can point to
   an array (a row), but they all initially point to `null`.

```java
arr =new int[3][];

```

1. When you specify the size of each row, each reference is then made to point to an actual array object in memory. Each
   of these arrays can have a different size, allowing for the creation of "jagged" arrays.

```java
arr[0]=new int[2];
arr[1]=new int[3];
arr[2]=new int[4];

```

1. Finally, when you assign values to the elements of the 2D array, these values are stored in the respective array
   objects in memory.

```java
arr[0][0]=1;
arr[0][1]=2;
arr[1][0]=3;
arr[1][1]=4;
arr[1][2]=5;
arr[2][0]=6;
arr[2][1]=7;
arr[2][2]=8;
arr[2][3]=9;

```

In memory, the 2D array is stored as an array of arrays. Each element of the main array is a reference to another array.
These arrays can be located anywhere in memory, not necessarily next to each other.
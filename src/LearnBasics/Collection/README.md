The **`Collections`** class is a utility class in Java that contains static methods for working with collections (such
as lists, sets, and maps). The **`Collections`** class provides a set of methods for performing common operations on
collections, such as sorting, searching, reversing, and shuffling elements.

Here are a few examples of commonly used methods in the **`Collections`** class:

1. **`sort(List<T> list)`** : sorts the elements of a list in ascending order, using their natural order or an optional
   comparator.
2. **`reverse(List<T> list)`**: reverses the order of elements in a list.
3. **`shuffle(List<T> list)`**: shuffles (randomly reorders) the elements of a list.
4. **`binarySearch(List<T> list, T key)`**: searches for a specified key in a sorted list using the binary search
   algorithm.
5. **`max(Collection<? extends T> coll)`**: returns the maximum element in a collection, according to their natural
   order or an optional comparator.
6. **`min(Collection<? extends T> coll)`**: returns the minimum element in a collection, according to their natural
   order or an optional comparator.
7. **`fill(List<? super T> list, T obj)`**: replaces all elements in a list with a specified value.
8. **`copy(List<? super T> dest, List<? extends T> src)`**: copies all elements from one list to another.

These are just a few examples of the types of methods available in the **`Collections`** class. The class provides many
other methods for working with different types of collections, such as sets, maps, and queues.

It's worth noting that **`Collections`** class is not used to create a new collection, it's used to perform operations
on the collections that are already created.
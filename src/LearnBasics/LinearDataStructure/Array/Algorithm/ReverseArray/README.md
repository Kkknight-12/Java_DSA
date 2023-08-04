The **`Arrays.asList`** method cannot be used with primitive types because it is `designed to work with object types`,
not with primitive types.

When you try to use the Arrays.asList method with a primitive type, the compiler will automatically convert the
primitive type to its corresponding wrapper class (such as int to Integer, char to Character, etc.). However, this
creates an ArrayList that is backed by an array of the wrapper class, rather than an array of the primitive type.

The problem with this is that the `ArrayList class is not designed to work with primitive types`. It can only work with
objects, not with primitive types. This is why the Arrays.asList method cannot be used with primitive types.

Additionally, since `Arrays.asList returns a fixed-size List` and primitive types are not objects so they cannot be
modified, therefore it is not possible to use Arrays.asList with primitive types.

That's why in order to use the Arrays.asList method with a primitive type, you need to first convert it to its
corresponding wrapper class, which is an object type.
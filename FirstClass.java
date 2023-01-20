// Java is OOPS 
// So Every code start with a Class 
// Standard , File Name and class name should be same if class is not public
// if class is public it must be filename and class name must be same.
class SecondClass{
    // class is a keyword (Reserved Word
    // it is telling to the compiler we are defining a class.
    /*
     * main is a method (Main Signature)
     * void it is a keyword (Reserved Word), Return nothing
     * static is a keyword. static things will be load during class loading time
     * public is a keyword. public access is outside the package (Folder)
     * String args[] it is a command line argument
     * String - String is a predefine class in Java. In Java Every class it start with capital letter
     * String - Collection of Chars
     * args - It is a name of argument, it can be anything.
     * arguments it can be N . That's why it is an array. [] Box Syntax - Array Syntax
     */
    public static void main(String arguments[]){
        /*
         * print is a method and it is call from out object
         * out object belongs to PrintStream class
         * who create the object of PrintStream (out)
         * System class create the out object and make it static
         * print method print the things in same line
         * println method print the things in new line
         * println = print + new line
         */
        //System.out.print("Hello Java");
        System.out.println("Hello Java");
    }
}

// javac <FileName>.java
// Once it is compile it generate a Byte code and Byte code is always with class name.
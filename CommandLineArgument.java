//Command Line Argument is information passed to the program when you run the program.
//The passed information is stored as a string array in the main method.
//Later, you can use the command line arguments in your program.

class CommandLineArgument{
     public static void main(String args[]){
         System.out.println("Argument one = "+args[0]);
         System.out.println("Argument two = "+args[1]);
    }
}
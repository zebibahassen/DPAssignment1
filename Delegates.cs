//Delegate is a type safe function pointer.
//That is it holds a reference to a pointer.
//The signature of the delegate must match th signature of the function,
//the delegate points to, otherwise you get a compilation error.
//It is similar to a class.
//You can create an instance of it, and when you do so,
//you pass in the function name as a parameter to the delegate constructor,
//and it is this function the delegate will point to.

using System;

delegate int NumberChanger(int n);
namespace DelegateAppl {
   
   class Delegates {
      static int num = 10;
      
      public static int AddNum(int p) {
         num += p;
         return num;
      }
      public static int MultNum(int q) {
         num *= q;
         return num;
      }
      public static int getNum() {
         return num;
      }
      static void Main(string[] args) {
         //create delegate instances
         NumberChanger nc1 = new NumberChanger(AddNum);
         NumberChanger nc2 = new NumberChanger(MultNum);
         
         //calling the methods using the delegate objects
         nc1(25);
         Console.WriteLine("Value of Num: {0}", getNum());
         nc2(5);
         Console.WriteLine("Value of Num: {0}", getNum());
         Console.ReadKey();
      }
   }
}
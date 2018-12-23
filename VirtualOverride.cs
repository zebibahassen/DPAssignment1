//Virtual keyword is used for generating a virtual path for its derived classes 
//on implementing method overriding.
//The Virtual keyword is used within a set with an override keyword.
//Override keyword is used in the derived class of the base class 
//in order to override the base class method.

using System;  
using System.Collections.Generic;  
using System.Linq;  
using System.Text;  
using System.Threading.Tasks;  
  
namespace NewVirtualOverride  
{  
    // Base Class    
    class Parent  
    {  
        public virtual void SayHello()  
        {  
            Console.WriteLine("Hello from Parent function!!!");  
        }  
    }  
  
    class Child : Parent  
    {  
        public override void SayHello()  
        {  
            Console.WriteLine("Hello from Child class function!!!");  
  
        }  
    }  
  
    class Program  
    {  
        static void Main(string[] args)  
        {  
            Parent pObj = new Parent();  
            pObj.SayHello();  
            Child cObj = new Child();  
            cObj.SayHello();  
            Parent pcObj = new Child();  
            pcObj.SayHello();  
  
  
            Console.ReadLine();  
        }  
    }  
} 
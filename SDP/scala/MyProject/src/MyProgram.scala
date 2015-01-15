object MyProgram {
  
  def main(args: Array[String]): Unit = 
  {
    println("Scala Rocks")
    println(1.+(2))
    var mike = "mike"
    println(mike)
   
    println("""This is a
              multi line
              string""".stripMargin ) 
              
    var name = mike
  
    println(s"my name is $name")
    
    
    val height = 1.9d
    name = "James"
    println(f"$name%s is $height%2.2f meters tall")
        println(f"$name is $height meters tall")
        
        
        //lazy var
        var a = 1
        lazy val b = a + 1
        a = 5
        println(b)
    //b uses the latest value of a
    
    
    //arrays
    val listOfThings = List("mike", 2, "dog")
    println(listOfThings(0))
    println(listOfThings(2))
    println(listOfThings)
    
    //splitting an array
    val first :: rest = List(1,2,3)
    println("first: " + first + ", " + "Rest: " + rest)
    //first has value of 1, rest has the last two values as an array
        
        
    //functions - can be inside another function or outside
    
    //Unit in Scala is like void in Java
    
    def welcome (name: String) :String = {"Exciting times ahead " + name}
  //def keyword, function name, (variable name: type) : Return Type =  {method body}
    //= is to tell the Scala compiler to infer the return type of
    //your function. remove this then it doesnt infere this.
  //Same as in Java - public String welcome (String name) {"Exciting times ahead " + name}
    println(welcome("mike"))
    

    //functions passed as parameters -
    oncePerSecond(timeFunction)
    
    //functions being called anonymously
    //() => argument list is empty
    oncePerSecond(() => println("time flies like an arrow..."))

    
    
  }  
  
  //functions outside main as per java
  def oncePerSecond (callback: () => Unit)
  {
    var count = 0
    while (count < 3)
    {
      callback(); Thread sleep 1000;
      count += 1
    }    
  }
  
  
  def timeFunction()
  {
    println("Time flies when you are having fun");
  }
  

}

        //calling classes
    object ComplexNumbers 
    {
      def main (args: Array[String])
      {
        val c = new Complex(1.2, 3.4)
        println("imaginary part: " + c.im())
        println(c.toString)
      }
    }
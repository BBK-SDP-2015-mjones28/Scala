//default constructor can be detailed in the class line declaration

class Complex (real: Double, imaginary: Double)
{
  //boiler plate functions - scala inferes the type here but not always
  def re() = real
  def im() = imaginary
  override def toString() = "To String: " + re + (if (im < 0) "" else " + ") + im + "i"
}
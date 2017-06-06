class Person(var personID: Int, var name: String){
  override def toString: String = personID + ", " + name
}

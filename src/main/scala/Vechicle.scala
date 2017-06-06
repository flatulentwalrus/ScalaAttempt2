class Vechicle(var regNumber: Int, var ownerName: String, var cusID: Int) extends Customer(cusID, ownerName) {
  override def toString: String = regNumber + ", " + ownerName + ", " + cusID
}

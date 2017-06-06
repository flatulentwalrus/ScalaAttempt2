class Customer(var customerID: Int, var cusName: String) extends Person(customerID, cusName){
  override def toString: String = cusName + ", " + customerID
}

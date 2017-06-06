class Car(var regNum: Int, var ownName: String, var ownerID: Int, var make: String, var model: String, var isFixed: Boolean, var faults: String) extends Vechicle(regNum, ownName, ownerID) {
  override def toString: String = regNum + ", " + ownName + ", " + make + ", " + model + ", " + isFixed + ", " + faults
}


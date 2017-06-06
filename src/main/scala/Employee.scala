class Employee(var empName: String, var employeeID: Int, var salary: Int, var jobTitle: String) extends Person(employeeID, empName){
  override def toString: String = empName + ", " + employeeID + ", " + salary + ", " + jobTitle
}
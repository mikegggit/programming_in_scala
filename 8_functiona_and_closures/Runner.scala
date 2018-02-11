
object Runner {
  private def getList: List[Int] = {
    List(1,2,3,4,5)
  }

  def run() {
    var l = getList
    for (i <- l) 
      println(i)
  }

  def run_localf() {
    def getList: List[Int] = {
      List(1,2,3,4,5)
    }

    var l = getList
    for (i <- l) 
      println(i)
  }
}

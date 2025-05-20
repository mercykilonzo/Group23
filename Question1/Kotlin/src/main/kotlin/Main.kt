//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
val conveyor = (conveyorBelt("scarf"))
    println(conveyor)
}
fun conveyorBelt(item:String):String{
   var dequeuedItem = ""
   var conveyorList = mutableListOf<String>("bag","shoes")

    conveyorList.add(item)
    if (conveyorList.isNotEmpty()){
        dequeuedItem = conveyorList.removeAt(0)
    }
    return dequeuedItem

}
// Define class with name, number and shift
open class Commercial(customerName: String,
                      customerPhone: String,
                      customerAddress: String,
                      squareFootage: Long,
                      var propertyName: String,
                      var commercialRate: Double,
                      var totalRate: Double,
                      var multipleProperty: Boolean):
    Customer(customerName,customerPhone, customerAddress, squareFootage){

    init {
        totalRate = 0.00
        commercialRate = 5.00
        if (squareFootage.toInt() > 9999) {
            totalRate = 50.00
            println("Yes, square footage is over 10,000")
        }
        else
        {
            totalRate = commercialRate * squareFootage
            println("No, square footage is less then 10,000")}

    }

    fun comweeklyCharges()  {
        if (multipleProperty) {
//          println(totalRate)
            totalRate = totalRate * 0.90 }
        if (squareFootage.toInt() > 9999) {
            totalRate = 50.00
         }
        else
        {
            totalRate = commercialRate * squareFootage
            println("${customerName} ${propertyName} ${totalRate} ${squareFootage.toInt()}")}
        return
    }

    // define printAll by printing fullInfo
//    fun printAll() {
//        println(fullInfo)
//   }
}


// Define class with name, number and shift
open class Residential(customerName: String,
                       customerPhone: String,
                       customerAddress: String,
                       squareFootage: Long,
                       var propertyName: String,
                       var constantRate: Double,
                       var totalRate: Double,
                       var seniorField: Boolean):
    Customer(customerName,customerPhone, customerAddress, squareFootage) {
    // define the fullInfo including name
//    var fullInfo: String ="  "
//    fulltime = "constantRate seniorField"

    // define getter and setter for name; update fullInfo
//    var constantRate: Double = constantRate
//        get() = field
//        set(value) {
//            field = value
//            var fullInfo = "$constantRate $seniorField"
//        }

    // define getter and setter for position; update fullInfo
//    var seniorField: Boolean = seniorField
//        get() = field
//        set(value) {
//            field = value
//            var fullInfo = "$constantRate $seniorField"
//        }



    init {
        this.constantRate = constantRate
        this.seniorField = seniorField
    }


    fun resweeklyCharges() {
        var discount: Double = 0.00
        if (seniorField)
        {
            discount = 0.15
        }
        else {
            discount = 0.00
        }
        constantRate = constantRate + (constantRate * discount)
        println("${customerName} ${propertyName} ${totalRate} ${seniorField}")
    }


    // define printAll by printing fullInfo
//
}
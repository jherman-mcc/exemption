// Define class with name, number and shift
class Residential (customerName: String,
                   customerPhone: String,
                   customerAddress: String,
                   squareFootage: Double
                   var constantRate: Double,
                   var seniorField: Boolean):
    Customer(customerName,customerPhone, customerAddress, squareFootage) {
    // define the fullInfo including name
    var fullInfo = "$constantRate $seniorField"

    // define getter and setter for name; update fullInfo
    var constantRate: Double = constantRate
        get() = field
        set(value) {
            field = value
            var fullInfo = "$constantRate $seniorField"
        }

    // define getter and setter for position; update fullInfo
    var seniorField: Boolean = seniorField
        get() = field
        set(value) {
            field = value
            var fullInfo = "$constantRate $seniorField"
        }
    this.weeklyCharges()
}

init {
    this.constantRate = constantRate
    this.seniorField = seniorField
}


class weeklyChargesk(): Double  {
    var discount: Int = 0
    if (seniorField == 1)
        discount = 0.15
    else
        discount = 0
    constantRate = constantRate + (constantRate * discount)
    return
}

// define printAll by printing fullInfo
fun printAll() {
    println(fullInfo)
}
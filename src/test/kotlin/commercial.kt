// Define class with name, number and shift
class Commercial (customerName: String,
                  customerPhone: String,
                  customerAddress: String,
                  squareFootage: Double
                  var propertyName: String,
                  var commercialRate: Double,
                  var multipleProperty: Boolean,
                  var totalRate: Long):
    Customer(customerName,customerPhone, customerAddress, squareFootage){
{
    // define the fullInfo including name
    var fullInfo = "$customerName $customerPhone $customerAddress $squareFootage $propertyName $commercialRate $multiplePropery"

    // define getter and setter for name; update fullInfo
    var propertyName: String = propertyName
        get() = field
        set(value) {
            field = value
            fullInfo = "$customerName $customerPhone $customerAddress $squareFootage $propertyName $commercialRate $multiplePropery $totalRate"
        }

    // define getter and setter for position; update fullInfo
    var commercialRate: String = commercialRate
        get() = field
        set(value) {
            field = value
            fullInfo = "$customerName $customerPhone $customerAddress $squareFootage $propertyName $commercialRate $multiplePropery $totalRate"
        }
    // define getter and setter for position; update fullInfo
    var multipleProperty: Boolean = multipleProperty
        get() = field
        set(value) {
            field = value
        }

    // define getter and setter for totalRate; update fullInfo
    var totalRate: Long = totalRate
    get() = field
    set(value) {
    field = value
    fullInfo = "$customerName $customerPhone $customerAddress $squareFootage $propertyName $commercialRate $multiplePropery $totalRate"
    }
    this.weeklyCharges()
 }

    init {
        var this.totalRate = 0
        this.commercialRate = 5.00
        if (this.squareFootage > 9,999)
            this.totalRate = 50.00
        else
            totalRate = commercialRate * squareFootage
    }

fun weeklyCharges()  {
    if (multipeProperty== 1)
        this.totalRate = this.totalRate * 0.90
    printAll(fullInfo)
    return
}

    // define printAll by printing fullInfo
    fun printAll() {
        println(fullInfo)
    }
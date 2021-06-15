fun main() {
    var menuChoice = 0
    // set my parameters to my fields
    var person1 = Customer("Jim Riggs","855-220-1021", "230 Simms Blvd. Blue, CO", 2000)
    var person2 = Customer("Jane Riggs","286-238-4345","3452 Kohl Str. New Redd, NM", 1500)
    var person3 = Customer("Albert Suh","345-232-0254", "8231 Lake Ave. San Diego, CA", 3000)
    var person4 = Customer("Deb Fine", "234-342-3452", "2341 AL Str San Francisco, CA", 1200)
    var person5 = Customer("Ann Meno", "345-234-2353", "2982 Sid, Park City, Utah", 1350)
    var person6 = Customer("John Meno", "345-234-4352", "8938 Kondo, Kona, HI" , 1150)
    var person7 = Customer("Jake Smith","345-305-2342", "845 Simms Blvd. Blue, CO"3000)
    var person8 = Customer("Renee Oh","334-321-4522","8723 Oil Road, Irving, TX" , 1500)
    var person9 = Customer("Mark Ray","983-342-3460", "874 INDO, Smyrna, TN" , 2200)
    var person10 = Customer("Eddie Lu", "834-342-3452", "8238 Condo Road, Orlando, FL", 1200)
    var person11 = Customer("Margaret Am", "803-348-2351", "17 Ice Road, Portland, WA" , 1350)
    var person12 = Customer("Flip Jones", "834-234-3482", "302 All Str, Alto, CO", 1150)
    do {
        println()
        println("1) Residential Customer")
        println("2) Commercial Customer")
        println("3) Done")
        menuChoice = readLine()!!.toInt()
        when (menuChoice){
            1 -> person1.residential() person2.residential() person3.residential person4.residential                                                                                            ")
            2 -> person1.commercial()  person2.commercial() person3.commercial person4.commercial                                                                                                           ")
            3 -> print("Thank you.                                                                                                            ")
            !in 1..3 -> print("This is not a valid choice please choose again.                                                                                                        ")
        }
    } while(menuChoice != 3)


}

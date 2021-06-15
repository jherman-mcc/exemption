fun main() {
    var menuChoice = 0
    // set my parameters to my fields
    var person1 = Residential("Jim Riggs","855-220-1021", "230 Simms Blvd. Blue, CO", 2000, "Chicago",20.00, 10.00, true)
    var person2 = Residential("Jane Riggs","286-238-4345","3452 Kohl Str. New Redd, NM", 1500, "Orlando", 20.00, 15.00, true)
    var person3 = Residential("Albert Suh","345-232-0254", "8231 Lake Ave. San Diego, CA", 3000, "Albuquerque",25.00, 6.00,true)
    var person4 = Residential("Deb Fine", "234-342-3452", "2341 AL Str San Francisco, CA", 1200, "New Orleans", 10.00, 6.00, true)
    var person5 = Residential("Ann Meno", "345-234-2353", "2982 Sid, Park City, Utah", 1350, "San Diego", 22.00, 6.00,true)
    var person6 = Residential("John Meno", "345-234-4352", "8938 Kondo, Kona, HI" , 1150, "Los Angeles",19.00, 6.00, true)
    var person7 = Residential("Jake Smith","345-305-2342", "845 Simms Blvd. Blue, CO",3000,"Seattle", 28.00, 6.00, false)
    var person8 = Residential("Renee Oh","334-321-4522","8723 Oil Road, Irving, TX" , 1500,"Portland", 20.00,6.00, true)
    var person9 = Residential("Mark Ray","983-342-3460", "874 INDO, Smyrna, TN" , 2200,"Boston", 25.00,6.00, true)
    var person10 = Residential("Eddie Lu", "834-342-3452", "8238 Condo Road, Orlando, FL", 1200,"St. Petersburg",22.00,6.00, false)
    var person11 = Residential("Margaret Am", "803-348-2351", "17 Ice Road, Portland, WA" , 1350,"Cancun", 10.00,6.00, true)
    var person12 = Residential("Flip Jones", "834-234-3482", "302 All Str, Alto, CO", 1150,"Tucson", 25.00,6.00, false)
    var person13 = Commercial("Jim Riggs","855-220-1021", "230 Simms Blvd. Blue, CO", 1200, "Scottsdale", 20.00, 20.00, true)
    var person14 = Commercial("Jane Riggs","286-238-4345","3452 Kohl Str. New Redd, NM", 1500,"Scottsdale", 15.00, 20.00, true)
    var person15 = Commercial("Albert Suh","345-232-0254", "8231 Lake Ave. San Diego, CA", 2000,"Scottsdale", 30.00, 25.00, true)
    var person16 = Commercial("Deb Fine", "234-342-3452", "2341 AL Str San Francisco, CA", 1500, "Scottsday", 12.00, 10.00, true)
    var person17 = Commercial("Ann Meno", "345-234-2353", "2982 Sid, Park City, Utah", 1800, "Scottsdale", 13.50, 22.00, true)
    var person18 = Commercial("John Meno", "345-234-4352", "8938 Kondo, Kona, HI" , 1950, "Scottsdale", 11.50, 19.00, true)
    var person19 = Commercial("Jake Smith","345-305-2342", "845 Simms Blvd. Blue, CO", 2000, "Orlando", 30.00,28.00, false)
    var person20 = Commercial("Renee Oh","334-321-4522","8723 Oil Road, Irving, TX" , 1900, "Orlando", 15.00,20.00, false)
    var person21 = Commercial("Mark Ray","983-342-3460", "874 INDO, Smyrna, TN" , 2000, "Orlando", 22.00,25.00,false)
    var person22 = Commercial("Eddie Lu", "834-342-3452", "8238 Condo Road, Orlando, FL", 1500, "Orlando", 12.00,22.00, false)
    var person23 = Commercial("Margaret Am", "803-348-2351", "17 Ice Road, Portland, WA" , 1800, "Orlando", 13.50,10.00, false)
    var person24 = Commercial("Flip Jones", "834-234-3482", "302 All Str, Alto, CO", 3000, "Orlando", 11.50,25.00,false)

    do {
        println()
        println("1) Residential Customer")
        println("2) Commercial Customer")
        println("3) Done")
        try {
        menuChoice = readLine()!!.toInt()
            println("exception")
            var Exception = false
            if (menuChoice < 1)
                Exception = true
            if (menuChoice > 3)
                Exception = true
//            checkmenuChoice()
            when (menuChoice) {
                1 -> {
                    person1.resweeklyCharges()
                    person2.resweeklyCharges()
                    person3.resweeklyCharges()
                    person4.resweeklyCharges()
                    person5.resweeklyCharges()
                    person6.resweeklyCharges()
                    person7.resweeklyCharges()
                    person8.resweeklyCharges()
                    person9.resweeklyCharges()
                    person10.resweeklyCharges()
                    person11.resweeklyCharges()
                    person12.resweeklyCharges()
                }
                2 -> {

                    person13.comweeklyCharges()
                    person14.comweeklyCharges()
                    person15.comweeklyCharges()
                    person16.comweeklyCharges()
                    person17.comweeklyCharges()
                    person18.comweeklyCharges()
                    person19.comweeklyCharges()
                    person20.comweeklyCharges()
                    person21.comweeklyCharges()
                    person22.comweeklyCharges()
                    person23.comweeklyCharges()
                    person24.comweeklyCharges()
                }
                3 -> println("Thank you")
             }
        }
            catch(ex: Exception)
        {
                println("Not a valid selection.")
        }
    } while(menuChoice != 3)

}

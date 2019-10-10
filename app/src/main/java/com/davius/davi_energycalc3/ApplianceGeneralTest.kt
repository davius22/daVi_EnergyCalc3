
    fun applianceGeneral() {

        // Appliance name
        println("What is the name of the appliance you want to analyse?  ")
        val appliancename = readLine()

        print("Enter number of hours per day you use the $appliancename:  ")       //time used per day in hours
        var hoursperday: Int = readLine()!!.toInt()

        while(hoursperday > 24){
            println("$hoursperday is too many hours for a single day.  Enter a number less than 24.")
            hoursperday = readLine()!!.toInt()
        }
        /*if(hoursperdayInput>24){
            println("Too many hours")
            
        }else {
            //println("$hoursperDay")
            println(hoursperday)
        }
        */

        var electricityPrice = 0.16f          //Power price in £/kWh

        print("Enter power rating of $appliancename (in Watts):  ")
        val wattratingInput = readLine()!!
        var wattrating: Float = wattratingInput.toFloat()
        println("$appliancename is $wattrating watts")

        var kW: Float = wattrating / 1000f                         //kW rating of appliance
        println("kW: $kW")

        var kWhperday = kW * hoursperday      //kWh per day
        println("kWh per day: " + "%.2f".format(kWhperday))
        println("")

        var costperday = kWhperday * electricityPrice           //Cost per day = kWh/day * price

        var annualCost = costperday * hoursperday * 365         //Cost per year

        println("The cost to use your $appliancename per year is:  £" + "%.2f".format(annualCost))


    }

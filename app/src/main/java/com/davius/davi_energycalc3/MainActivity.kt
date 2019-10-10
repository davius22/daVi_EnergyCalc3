package com.davius.davi_energycalc3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }



    fun kettle() {

        /**Volume - how many cups - kettle on time to boil
        1 cup = 0.5 min
        2 cups = 1 min
        4 cups = 2 min
         */

        //times used per day
        println("Enter number of times you use the kettle per day:  ")
        val timesperdayInput = readLine()!!
        var timesperDay: Int = timesperdayInput.toInt()
        //println("$timesperDay")
        println("")

        // time in minutes
        print("Enter cups of water in kettle:  ")
        val cupinput = readLine()!!
        var cup: Int = cupinput.toInt()
        println("$cup cups")

        //time to boil = number of cups * 2 mins/cup
        var timeMin = 2f * cup
        println("Minutes to boil: $timeMin")

        //time to boil
        var timeHour = timeMin / 60
        //println ("Hours to boil: " +timeHour)

        //kW rating of appliance
        var kW = 2
        println("kW: $kW")

        //kWh per use
        var kWh = kW * timeHour
        println("kWh: " + "%.2f".format(kWh))

        //Power price in £/kWh
        var electricityPrice = 0.16f

        //Cost to run kettle per time
        var costToBoil: Float = electricityPrice * kWh

        println("Cost to boil kettle is:   £" + "%.2f".format(costToBoil))

        //Cost per year
        var annualCost = costToBoil * timesperDay * 365
        println("The cost to use your kettle per year is:  £" + "%.2f".format(annualCost))
        println()
        println()

        kettle_Calc_Btn.setOnClickListener {
            kettle()
        }


    }
}

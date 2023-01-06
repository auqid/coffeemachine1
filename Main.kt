package machine

import kotlin.system.exitProcess

var water = 400
var milk = 540
var beans = 120
var cups = 9
var money = 550

fun buy (){

    println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ")
    when (readln()) {
        "1" -> if (water > 250) {
            if (beans > 16) {
                println("I have enough resources, making you a coffee!")
                water-=250
                beans-=16
                money+=4
                cups--
            } else {
                println("Sorry, not enough beans!")
            }
        }else{println("Sorry, not enough water!")
        }
        "2"->if (water > 350) {
            if (milk>75) {
                if (beans>20){println("I have enough resources, making you a coffee!")
                    water-=350
                    milk-=75
                    beans-=20
                    money+=7
                    cups--
                }else{println("Sorry, not enough beans!")}
            }else{println("Sorry, not enough milk!")}
        }else{println("Sorry, not enough water!")}


        "3"->if (water > 200) {
            if (milk>100) {
                if (beans>12){print("I have enough resources, making you a coffee!")
                    water-=200
                    milk-=100
                    beans-=12
                    money+=6
                    cups--
                }else{println("Sorry, not enough beans!")}
            }else{println("Sorry, not enough milk!")}
        }else{println("Sorry, not enough water!")}

    }
}
fun fill(){
    println("Write how many ml of water you want to add: ")
    water += readln().toInt()
    println("Write how many ml of milk you want to add: ")
    milk += readln().toInt()
    println("Write how many grams of coffee beans you want to add: ")
    beans += readln().toInt()
    println("Write how many disposable cups you want to add: ")
    cups += readln().toInt()
}

fun take(){

    println("I gave you $money")
    money = 0
}

fun remaining(){

    println("""The coffee machine has:
$water ml of water
$milk ml of milk
$beans g of coffee beans
$cups disposable cups
$$money of money""")



}




fun main() {

    while(true){

        println("Write action (buy, fill, take, remaining, exit): ")
        when (readln()){
            "buy"-> buy()
            "fill"-> fill()
            "take"-> take()
            "remaining"-> remaining()
            "exit"->exitProcess(0)

        }
    }
}



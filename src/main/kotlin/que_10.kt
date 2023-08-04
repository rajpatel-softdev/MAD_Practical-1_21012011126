
class car(var carobjn:Int,var type:String,var model:String,var originalprice:Long,var currentprice:Long,var owner:String,var milesdrive:Long){

    fun getcarprice():Long{
        return originalprice
    }
    fun getcarinformation():Array<String>
    {
        var a1= arrayOf<String>(type,model,owner)
        return a1
    }
    fun getoriginalprice():Long
    {
        return originalprice
    }
    fun getcurrentprice():Long
    {
        return currentprice
    }
    fun displycarinfo(){
        println("Creating car class object car$carobjn in next line")
        println("Object of class is created and Init is Called.")
        println("----------")
        var a = getcarinformation()
        println("Car Information:${a[0]},${a[1]}")
        println("Car Owner:${a[2]}")
        println("Miles Drive:$milesdrive")
        println("Original Car Price:$originalprice")
        println("Current Car Price:$currentprice")
        println("----------")
    }
}

fun main()
{
    var no:Int= 0;
    no=no+1
    var obj1 = car(no,"BMW","2018",10000,98950,"Raj",105)
    obj1.displycarinfo()

    no = no + 1
    var obj2 = car (no, "BMW", "2019", 40000, 399800,"V N Patel", 20)
    obj1.displycarinfo()
}




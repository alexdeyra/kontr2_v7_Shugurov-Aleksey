

abstract class Dog(override var name:String, override var breed:String, override var height:Double, override var coatColor:String, override var weight:Double,override var temperament:String, override var vid:String):DOGIn
{
    override fun Info(){
        try {
            println("Введите имя собаки")
            name = readLine()!!.toString()
            println("Введите породу собаки")
            breed = readLine()!!.toString()
            do {
                println("Введите рост собаки")
                height = readLine()!!.toDouble()
            }while (height<=0)
            println("Введите окрас шерсти собаки")
            coatColor = readLine()!!.toString()
            do {
                println("Введите вес собаки")
                weight = readLine()!!.toDouble()
            }while (weight<=0)
            println("Введите характер собаки")
            temperament = readLine()!!.toString()
            println("Введите вид спорта собаки: Обидиенс, Ноузворк, Флайбол, Мондьоринг")
            vid = readLine()!!.toString()
        } catch (e:Exception) {println("вы ввели не то")}
    }
    override fun Output()
    {
        println("\nимя-${name} \nпорода-${breed} \nрост-${height} \nОкрас шерсти-${coatColor} \nВес-${weight} \nхарактер-${temperament} \nвид-${vid}")
    }
}
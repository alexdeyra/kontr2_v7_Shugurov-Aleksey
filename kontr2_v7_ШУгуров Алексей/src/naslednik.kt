class naslednik(name:String, breed:String, height:Double,coatColor:String, weight:Double, temperament:String, vid:String):Dog(name,breed, height, coatColor,weight,temperament,vid) {
    fun Vid()
    {
        println("Ввиды соревнований: Обидиенс, Ноузворк, Флайбол, Мондьоринг")
        if (vid=="Обидиенс")
        {
            println("Вау, ваша собака знает самый сложный вид спорта, вы молодцы")
        }
        else if (vid=="Ноузворк")
        {
            println("У вашей собаки очень хороший нюх")
        }
        else if (vid=="Флайбол")
        {
            println("Ваша собака очень быстрая, за ней не угнаться")
        }
        else if (vid=="Мондьоринг")
        {
            println("Ваша собака очень послушная")
        }
        else
        {
            println("Такого спорта не существует, либо не занесён в список")
        }

    }

}
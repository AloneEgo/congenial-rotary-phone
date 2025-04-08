package ru.netology

//Условия акции
//от 0 до 1 000 рублей — скидка не предоставляется
//от 1 001 до 10 000 рублей — скидка составит 100 рублей (как в лекции)
//от 10 001 рубля и выше — скидка составит 5% от суммы.
//Все цены указаны в рублях.

//Те, кто приобретает музыку ежемесячно, попадают в отдельную категорию — постоянные покупатели.
// После стандартной скидки к получившейся сумме применяется дополнительная — ещё 1% сверху.

fun main(){
    val regular: Boolean = true
    val price: Int = 5_000
    val regularDiscount: Int = 1 //скидка за регулярность в целых процентах
    val priceDiscountFirstLimit: Int = 1_000 //первый уровень скидок
    val priceDiscountSecondLimit: Int = 10_000 //второй уровень скидок
    val discountFirstStage: Int = 100 //рубли скидки
    val discountSecondStage: Int = 5 //проценты скидки

    val subPrice = if (price > priceDiscountSecondLimit) price - price * discountSecondStage / 100 else
        if (price > priceDiscountFirstLimit) price - discountFirstStage else price

    val totalPrice = if (regular) subPrice - subPrice * regularDiscount / 100 else subPrice

    println ("price $price - total $totalPrice")

}

const val regularClient: Boolean = false

fun main() {
    print("Введите сумму которую вы хотели бы потратить: ")
    val amount = readLine()?.toUInt()

    val sale = when (amount) {
        in 0U..1000U -> 0
        in 1001U..10000U -> 100
        else -> (amount!! / 100U) * 5u
    }
    val totalSale = if (regularClient) ((amount!! - sale as UInt) / 100U) + sale else sale
    println("Ваша скидка составит $totalSale рублей!")
}
fun main() {
    val country = countries("Kenya")
    println(country)
    multipleNumbers(100)
}
//Write and invoke one function that takes in a random string and returns the
//following values: first character, last character, length of the string and
//whether it begins with a vowel or not.
data class CountryStats (var firstCharacter:Char,var lastCharacter:Char,var length:Int)
fun countries(country:String):CountryStats{
    val firstCharacter = country[0]
    val lastChar = country.count() -1
    val lastCharacter = country[lastChar]
    val length = country.count()
    val vowels = setOf('a', 'e', 'i', 'o', 'u')

     return CountryStats(firstCharacter,lastCharacter,length)

   }
//Create a function that takes in a password as a parameter. For a password to
//be valid it must meet the following conditions:
//1. Must be at least 8 characters long
//2. Must be at most 16 characters long
//3. Must not be “password”
//4. Must contain a digit
//Your function should determine whether the password provided is valid or not.
//The function returns true/false (7pts)

fun takePassword(password:String){
    for (pass in password){
      val len = password.count()>=8
        val characters = password[i]<=16
        val passcode = (!="password")
        val content = (password:Int)
    }
}
//Create a function that prints out multiples of 6 and 8 between 1 and 1000. For
//multiples of both 6 and 8 it should print out “Bingo!”

fun multipleNumbers(numbers:Int){
for (num in numbers<=1000){
    if (num %6 && num%8 ==0){
       println("Bingo!")
    }



}
//Create a class CurrentAccount with the following attributes: account number,
//account name, balance. It has the following functions:
//a. deposit(amount: Double) - Increments the balance by the amount
//deposited
//b. withdraw(amount: Double) - Decrements the balance by the amount
//withdrawn
//c. details() - Prints out the account number and balance and name in
//this format: “Account number x with balance y is operated by z”

class CurrentAccount(var accountNumber:Int,var accountName:String,var balance:Double){
    fun deposit(amount:Double):Double{
        var increment = 0
        for (a in amount){
            increment+=a
        }
        return increment
    }

    fun withdraw(amount: Double):Double{
        var decrement = 0
        for (d in amount){
            decrement-=d
        }
        return decrement
    }
}




}

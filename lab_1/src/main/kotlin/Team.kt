class Team constructor(private val _id: Int, private val _countryName: String, private val _teamName: String, private  val _fullName: String,private val _gameNumber: Int,  private val _age: Int, private val _height: Int, private val _weight: Int ): ITeamInfo {
    override var id: Int= _id
    override var countryName: String= _countryName
    override var teamName: String= _teamName
    override var fullName: String= _fullName
    override var gameNumber: Int= _gameNumber
    override var age: Int= _age
    override var height: Int= _height
    override var weight: Int= _weight

    fun show(){
        println("ID: $id")
        println("Название страны: $countryName")
        println("Название команды: $teamName")
        println("ФИО: $fullName")
        println("Игровой номер : $gameNumber")
        println("Возраст: $age")
        println("Рост: $height")
        println("Вес: $weight")
    }



}
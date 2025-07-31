package uz.gravity.kidstories

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
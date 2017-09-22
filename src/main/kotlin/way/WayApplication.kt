package way

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class WayApplication

fun main(args: Array<String>) {
    SpringApplication.run(WayApplication::class.java, *args)
}

package way.controller

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.http.ResponseEntity
import org.springframework.http.HttpStatus

@RestController
class HelloController {
	
	@RequestMapping("/hello")
	fun hello() : ResponseEntity<String> = ResponseEntity("Hellooo!", HttpStatus.OK)
	
}
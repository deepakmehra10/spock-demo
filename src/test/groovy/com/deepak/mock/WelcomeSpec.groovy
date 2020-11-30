package com.deepak.mock

import com.deepak.User
import com.deepak.Welcome
import spock.lang.Specification

class WelcomeSpec extends Specification {
    
    Welcome welcome;
    def user = Mock(User)
    
    def setup() {
        welcome = new Welcome(user)
    }
    
    def "Greet user with name"() {
        given: "Name of the user"
        def name = "Deepak"
        when: ""
        def actualResult = welcome.greetUser(name)
        then:
        1 * user.getUser("Deepak") >> "Deepak"
        "Welcome, Deepak" == actualResult
    }
}

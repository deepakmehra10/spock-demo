package com.deepak

import spock.lang.Specification

class UserSpec extends Specification {
    User user
    
    def setup() {
        user = new User()
    }
    
    def "Get User"() {
        given: "Name of the user"
        def name = "Deepak"
        
        when:
        def result = user.getUser(name)
        
        then:
        result == "Deepak"
    }
}

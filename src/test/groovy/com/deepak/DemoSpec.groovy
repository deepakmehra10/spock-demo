package com.deepak

import spock.lang.Specification

class DemoSpec extends Specification {
    
    Demo demo
    
    def setup() {
        demo = new Demo()
    }
    
    def "Greeting with hello"() {
        when: "Initializing a class"
        def demo = new Demo()
        
        then: "greet with name"
        demo.sayHello("Deepak") == "Hello, Deepak"
    }
    
    def "Adding two numbers"() {
        given: "Two numbers"
        def first = 50
        def second = 50
        
        when:
        def result = demo.add(first, second)
        
        then:
        result == 100
    }
}

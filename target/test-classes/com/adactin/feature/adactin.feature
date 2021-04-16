Feature: Login functionality of Adactin application
@login1
Scenario: User enter valid username and password
    Given User launch application
    When User enter "Balaganesan" as username
    And User enter "L4Y507" as password
    Then Use verify valid username and password
    
 Scenario: User enter hotel details 
     Given User enter location
     When User enter hotel
     And User enter room_type
     And User enter room_nos
     And User enter date_in
     And User enter date_out
     And User enter adult
     And User enter children
     Then User enter submit
     
    Scenario: scenario description
        Given User select radio_button
        Then User select Continue_button
        
     Scenario: User confirms booking
         Given User enters firstname
         When User enters lastname
         And User enters billingaddress
         And User enters ccnumber
         And User enters cc_type
         And User enters cc_expirymonth
         And User enters cc_expiryyear
         And User enters ccv_no
         Then User selects book_now
         
         Scenario: User Logsout
             Given User select logout
             
        
         
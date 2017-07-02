# Event-Planning-Java

##### Event Planning Java. 6.30.2017

#### By Alena Golovina

## Description

This application is an individual project finishing week 1 Java at Epicodus, demonstrating Java and jUnit testing.

## Code Specs

|Behavior - Plain English|Input|Output|
|---|---|---|
|The user enters a number of guests from 5 to 100 and receives a confirmation for guest number|guest number: 10|number of guests: 10|
|The user enters a number of guests and receives a confirmation for guest number and rental cost|guest number: 10|number of guests: 10, rental: $ 150|
|The user enters their food choice and receives a confirmation for this and cost for food|food choice: Dinner (for 10)|number of guests: 10, Dinner: $ 200|
|The user enters their drinks choice and receives a confirmation for this and cost for drinks|drinks choice: Soft (for 10)|number of guests: 10, Soft drinks: $ 70|
|The user enters their entertainment choice and receives a confirmation for this and cost for entertainment|entertainment choice: Clown|entertainment Clown: $ 150|
|The user enters their guest count, food, drinks and entertainment choice and receives a total cost for the party|guest number: 80, food choice: Dinner, drinks choice: Alcoholic, entertainment choice: no|Your grand total is: $ 2460|
|The user enters a coupon code to get $50 off|FIFTYoff|Your new grand total is: $ 2410|
|If the user enters their guest count 80+, Dinner and Alcoholic drinks they get a free DJ|guest number: 80, food choice: Dinner, drinks choice: Alcoholic, entertainment choice: no|Your party got a free DJ!|

Guest total: 5-20 guests - $150; 21-50 guest - $230; 51-100 guests - $300;
Food total: dinner = 20 * guest number; snacks = 10 * guest number;
Drinks total: soft drinks = 2 * guest number; alcohol = 7 * guest number;
Entertainment: clown - $10; live music - $ 100;
Grand total = Guest total + Food total + Drinks total + entertainment;
Discount  - FIFTYoff - $50;
Coupon - FreeDJ if you ordeer Dinner with alcohol for 80+ guests.


## Setup

Install this event planning applicayion by cloning this repository and compiling and running it in your terminal with javac App.java && App java command at src/main/java.

## Technologies Used

JavaScript
jUnit
gradle

### Legal

Copyright (c) 2017 Alena Golovina

This software is licensed under the MIT license.

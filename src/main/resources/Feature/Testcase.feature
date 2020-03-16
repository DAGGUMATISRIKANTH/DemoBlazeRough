@DemoBlaze_Feature
Feature: DemoBlaze Website

@tc01_demoblazesignupwithvaliddetails
Scenario:

Given the user launched the chromebrowser
When the user open the Demoblaze website
Then user clicks on signup link
Then the user enters the username and password clicks on signup button

@tc02_demoblazesignupwithnullcredentials
Scenario:

Given the user launches the chromebrowser
When the user opens the Demoblaze application
Then user clicks on the signup link
Then the user clicks on signup button with out entering any details

@tc03_demoblazeloginwithvaliddetails
Scenario:
Login in to demo blaze steps

Given the user launched Browser
When the user open the Demoblaze Application in chromebrowser
Then user clicks on login button
Then the user enters the username and password clicks on login button

@tc04_loginwithinvaliddetails
Scenario:
Given the user launched chromebrowser
When the user open  Demoblaze website
Then user clicks on the login button
Then the user enters invalid  username and password clicks on login button

@tc05_loginwithinvaliddetailsgivingonlyusername
Scenario:
Given the user launches chromebrowser
When the user opens  Demoblaze website
Then user click on login button
Then the user enters only username and clicks on login

@tc06_loginwithexceldata
Scenario:
Given user launches chromebrowser
When user opens  Demoblaze website
Then user clicked on login button
Then the values are taken from the excelsheet

@tc07_loginandlogout
Scenario:
Given user launched chromebrowser
When user opened  Demoblaze website
Then user clicks the login button
Then the user logouts the page

@tc08_Addtocart
Scenario:
Given  user launched Demoblazewebsite
When the user selects  the product
Then the user clicks on the AddtoCart button

@tc09_deletefromcart
Scenario:
Given  user launched Demoblaze
When user selects  the product and addtocart
And the user clicks on Cart button
And the user remove the cart


@tc10_updatecart
Scenario:
Given  user launched DemoblazeApplication
When the user selects  the multiple products and addedtothecart
Then the user click on Cart button
And user checks the updated price and print on the console window

@tc11_ValidContactdetails
Scenario:
Given  user launched the DemoblazeApplication
When the user clicks on  contact link
Then the user fill the valid information from excelsheet
And user clicks on send message button

@tc12_InvalidContactDetails
Scenario:
Given  user opens the demoblazeApplication in the chromebrowser
When the user clicks on the contact link
Then the user gives the invalid data
And user clicks on the send message button

@tc13_AboutUs
Scenario:
Given  user opens the demoblazeApplication in  chromebrowser
When the user clicks on the Aboutus link
Then the user clicks on any link
And user takes the screenshot closes that window

@tc14_Navigatetonextpage
Scenario:
Given  user opens the demoblazeApplication in browser
When the user clicks on nextpage
Then the user selects any product in the nextpage

@tc15_Navigatetopreviouspage
Scenario:
Given  user opens the demoblazeApplication site in browser
When the user clicks on the nextpage
Then the user clicks on previous page

@tc16_Navigatetohomepage
Scenario:
Given  user opens the demoblazeApplication site in the browser
When user clicks on the Aboutus
And the user will navigate to homepage 

@tc17_Clickingonphones
Scenario:
Given  user opens the demoblazeApplication site
When the user clicks the phonesLink under catagories
Then the user select the particular phone 
And product will be added to the cart
And place the order

@tc18_ClickingonLaptops
Scenario:
Given  user opens the demoblazesite
When the user clicks the Laptops under catagories
Then the user select the particular Laptop 
And Laptop will be added to the cart
And place order

@tc19_ClickingonMonitors
Scenario:
Given the user opens the demoblaze site
When the user clicks the Monitors under catagories
Then the user select the particular  Monitors 
And  Monitors will be added to the cart

@tc20-_Checkingsitedescription
Scenario:
Given the user opens the demoblaze site Application from the  browser
When the user scroll down that page
Then the user checks the information available under aboutUs







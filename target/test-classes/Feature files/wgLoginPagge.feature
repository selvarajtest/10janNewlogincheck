Feature: To check functionality of signin of wallgreens
@Regression
Scenario: To check login functionality of invalid user and invalid passord
Given click account icon homepage then click sigin
When User should enter the user name and enter the password in login page
					#2D  map :
					     |userId|password|
					     |user@gmail.com||	
					     
And User shouldk sign in button for login
Then To verify the page is incredential login page


  

# using scenario outline
  
 # Feature: To check functionality of signin of wallgreens
#@Regression
#Scenario Outline: To check login functionality of invalid user and invalid passord
#Given User should launch the chrome browser and load the url
#When User should enter the user name "<user>" in login page 
#And To enter the password "<pass>" in login page
#And User shouldk sign in button for login
#Then To verify the page is incredential login page

#Examples:
  #|user|pass|
 	#|John|john@123|
  #|Mill|Mill@123|
  #|Vijay|Vj@123|
  
  
  # 1D list:
  #When User should enter the user name in login page 
					#1D list = |ram@gmail.com|varun@gmail.com|
	#And To enter the password in login page
					# 1D list = |raj@123|vaun@1234|
					
	# 2D list:
	#When User should enter the user name and enter the password in login page
		#			     |sam@yahoo.com|user@gmail.com|
		#		      |pass123|user@123|				
	#And User shouldk sign in button for login				
					
	#1D map
	#When User should enter the user name and enter the password in login page
					#1D  map :
					     #|user1|user@gmail.com|
					     #|pass1|password@123|	
  #And User shouldk sign in button for login
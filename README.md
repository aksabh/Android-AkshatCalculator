# Android-AkshatCalculator
		=======================================================
         		   Android Application Development
                  		     CIS 4930
		=======================================================



		           Application Name-AkshatCalculator
  	             -----------------------------------------------


		        	 Project Description
               
 		This application is about a simple calulator which performs               
		4 functions(Addition,Subtraction,Division and Multiplication) 
                on the numbers inputted by the user.The important files and 
                their description is as under:


                 MainActivity.java

                This .java file is the main file which does the event handling
		of the whole apllication.It has the follwing functions:

		    public void onClickNumber(View view)
					
			This functions takes the input from the user and stores
		the value in instance varable a(double) and b(double).Based on the 
		operator chosen by the user this function performes the different
		tasks.This also calls the method myCalculation when the user clicks
		on the operator buttons.
		

        	    public void myCalculation()

			  This function contains the oerations that are to be
		performed by this application i.e. Addition,Subtraction,Division
		and Multiplication based on the operator chosen by the user.           

       
 
                 activity_main.xml

		This .xml file is used to design the user interface of the 
		apllication. The layout for the application is relative and 
		I have used  buttons and text views for the interface.


	////////////////////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////////////////

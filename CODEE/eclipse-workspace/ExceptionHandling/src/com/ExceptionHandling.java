/*
 * Error :  Error is an runtime interruption or mistake which cannot be handled.(We have to debug).
 *          During runtime we will get a Runtime Error, whenever we are trying to execute program without main().
 *        & During compile time we will get Compilation Error, when there is a Syntax mistake.
 * 
 *          We can't handle Errors, Therefore we have to debug that error.
 *          
 * Exception : During runtime, some event or interruption occurs where in our program gets terminated & the below codes will not be executed.
 * 			   
 * 			   In simple terms, Exception means Abrupt Termination.
 * 			   Whenever, we get an exception we can handle it.
 * Exception Handling : The process of handling an exception is called as Exception Handling.
 * 						We can handle exception using try block & catch block.
 * 
 * try & catch block :
 * --------------------
 * 
 * 1. The critical lines of code which gives exception have to be written in try block.
 * 2. If there is any try block, mandatorily catch block should be present.
 * 3. Solution should always be written in catch block.
 * 4. Catch block will be executed only if an exception occurs.
 * 
 * syntax :
 * 			try{
 * 			    //set of instructions which gives exceptions
 * 				}
 * 			catch(ExceptionName referenceVariable){
 * 				//set of instructions
 * 					}
 * 5. One try block can have multiple catch blocks.
 * 6. There should not be any executable lines of code between try & catch block.
 * 7. It is always a good practice to handle the superclass exception as the last catch block.
 * 
 * Important methods present in Throwable Class :
 * ----------------------------------------------
 * 1. printStackTrace() : This method is used to get the complete information about the exception.
 * 2. getMessage() : This method is used to return a small message about why we are getting exception.
 * 
 * 
 * finally block
 * --------------
 * 1. The Set of Instructions which has to be executed all the time has to written within the finally block.
 * 2. Finally block is a block of code which gets executed all the time.
 * 		i.e. irrespective of exception occurs or not.
 * syntax : finally {
 * 			}
 * 
 * Note : 
 * 1. In java we can have nested try and catch block.
 * 2. We can have try and catch block within finally block as well.
 * 
 * throws
 * ---------
 * 1. throws is a indication to the caller about the possibility of an Exception.
 * 2. throws is used to propogate an Exception.
 * 3. throws is generally used with Checked Exception.
 * 4. We use throws with methods & we can use throws w.r.t. constructors as well.
 * 
 * Custom Exception
 * ------------------
 * Based on the project, sometimes necessary to create our own exception & those exceptions are created
 * by user/programmer are called as Custom Exception or User-defined Exception.
 * 
 * Rules for Creating Custom Exception 
 * --------------------------------------
 * 1. We have to create a Class with Exception Name.
 * 2. & The Exception class which we have created has to extend RuntimeException(Unchecked) or Exception(Checked) class.
 * 3. Create an object of Exception class & invoke/throw the object of that exception.
 * 4. Handle it using try & catch block. 
 * 
 * throw
 * ------
 * 1. throw is a keyword in order to invoke/throw an object of exception.
 * 2. throw is generally used with custom exception.
 * syntax : 
 * 
 * throw objectOfExceptionType; //throw new ExceptionName();
 * 
 * Difference b/w throws & throw keyword :
 * --------------------------------------------
 * use Throw keyword to throw an exception explicitly in the code.
 * use Throws keyword to declare that a method might throw an exception in the code.
 *             
 * 
 *          
 */
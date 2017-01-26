# Welcome this is the official repo for project 2
##UCLA ACM HACK

If you've missed the second session, check out the blog post first: http://hackucla.com/blog/session-2-java-deep-dive/

##What do I turn in
For beginners you should solve all of the listed short exercises and receive points for completing those. These are unrelated to the project skeleton in this repo. For intermediate/advanced students you can work on the weekly project with your team, and receive points for completing that. You can only get credit for one or the other, but not for both so choose the one most appropriate for your skill level. Please only submit one .zip file per team. Include the contents of your entire android project, and also provide your team access code (Found on Hack School Dashboard) in a text file. Otherwise you will not receive credit! 

##Grading
Submissions will be due 1 week from the session, but we will accept late submissions taking some points for each day it is late. The lateness penalty for an assignment that is submitted between N and N+1 full days late (where N is nonnegative) is 2^N % of the assignment's value. That is, the penalty is 1% for being up to 1 day late, 2% for being from 1 to 2 days late, 4% for being from 2 to 3 days late, and so forth.

##Beginner Exercises

####Exercise 1: ArrayLists
1. Create a Text Field and two Buttons. 
2. Use the Text Field to gather input in the form of names. 
3. Have the first button add the name to an ArrayList of Strings. 
4. Use the second button to print (log) out all names to console.


####Exercise 2: Classes
1. Create a class called `Professor`.
* This class should have private variables `name` and `quote`. 
* This class should have a function called `setQuote` that takes a parameter and changes the professor’s quote.
* This class should have a function called `talk` that makes the professor say his or her quote.
2. Now, create a Text Field and use the input of this Text Field to change the professor’s quote. 
* Make this professor talk upon a button click!

Note: Put all of your exercises into the same android project when submitting

##Intermediate/Advanced Project
The project is for intermediate/advanced students. If you are feeling confident you can attempt to 
complete the project without the skeleton, but it will be a lot easier to use it. We will be uploading the project solution later on, so if you haven't cracked it by then look at the solution to learn the correct implementation.

###Instructions
The goal is to scramble the input text into a "encrpyted" output text. There will be three encrypt and three decrypt methods for you to implement, and the primary purpose of this is to get more familiar with the java language so try using varied syntax for each of the encryptions. Additionally there is a swap button at the top that should switch between the encrypt and decrypt mode. The implementation is pretty flexible, so we will grade simply based on functionality so don't worry too much about following a particular structure.

#####Encryption 1
Implement a substitution cipher (https://en.wikipedia.org/wiki/Substitution_cipher)
Optional Substitutional Cipher, but you can use your own.
plain text: ABCDEFGHIJKLMNOPQRSTUVWXYZ
cipher text: ZEBRASCDFGHIJKLMNOPQTUVWXY
example: "flee at once. we are discovered!" transforms into "SIAA ZQ LKBA. VA ZOA RFPBLUAOAR!"

#####Encryption 2
Implement a polyalphabetic cipher (https://en.wikipedia.org/wiki/Polyalphabetic_cipher)
This is similar to substitution but using multiple substitution alphabets
plain text: ABCDEFGHIJKLMNOPQRSTUVWXYZ
even letter cipher text: ZEBRASCDFGHIJKLMNOPQTUVWXY
odd letter cipher text: CDFGHIJKLMNOPQTUVWXYZEBRAS
example: "test" transforms into "yaxo"

#####Encryption 3
Implement your own encryption
This doesn't have to be complicated, but for those who are interested in security
and want try something more advanced you could try creating AES encryption (https://en.wikipedia.org/wiki/Advanced_Encryption_Standard)
which is the standard worldwide. You can also take a look at some of java and android's built-in encryption libraries for more ideas here is a link to the android developer docs: https://developer.android.com/reference/javax/crypto/package-summary.html

###End Product Goal
![T3XT SCR4MBL3R](https://s3-us-west-1.amazonaws.com/acm-hack-ghost/2017/01/text_scrambler_bg_nexus5x-portrait--2-.png)

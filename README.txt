###########################################
How to run the ImageToHack Program:
###########################################

Call the program with the following parameters: input image file, output asm file

Example:
    java -jar ImageToHack.jar input.jpg output.asm

If the output asm file does not exist yet, ImageToHack creates it automatically.

Supported image formats: jpg, png,



###########################################
Known bugs:
###########################################

Due to the fact that an a instruction in the hack assembler language can only take a number up to 15 bit every 16th column is left blank.

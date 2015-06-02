###########################################
How to run the ImageToHack Program:
###########################################

Call the program with the following parameters: input image file, asm or hack, output file

Example:
    java -jar ImageToHack.jar input.jpg asm output.asm
    java -jar ImageToHack.jar input.jpg hack output.hack

If the output asm file does not exist yet, ImageToHack creates it automatically.

Supported image formats: jpg, png
(Because of the compression in the jpg format there appears to be some wrong placed pixels on the CPU Emulator screen.)

The instruction pdf did not clearly stated if an hack or an asm file as an output was demanded ("Hack assembler program", "executed by the CPU emulator without any modifications") so you can do both with this implementation.



###########################################
Known bugs:
###########################################

Due to the fact that an a instruction in the hack assembler language can only take a number up to 15 bit every 16th column is left blank. I posted this problem to the learnweb forum as suggested in the task instructions but sadly nobody replied.

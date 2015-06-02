###########################################
How to run the ImageToHack Program:
###########################################

Call the program with the following parameters: input image file, asm or hack, output file

Examples:

    //Testing the implementation with a suitable sized Image (= (256 x 512))
    java -jar ImageToHack.jar FullSizeTestImage.png asm FullSizeTestImage.asm
    java -jar ImageToHack.jar FullSizeTestImage.png hack FullSizeTestImage.hack

    //Testing the implementation with too large sized Image (> (256 x 512))
    java -jar ImageToHack.jar LargeSizeTestImage.png asm LargeSizeTestImage.asm
    java -jar ImageToHack.jar LargeSizeTestImage.png hack LargeSizeTestImage.hack

    //Testing the implementation with too small sized Image (< (256 x 512))
    java -jar ImageToHack.jar SmallSizeTestImage.png asm SmallSizeTestImage.asm
    java -jar ImageToHack.jar SmallSizeTestImage.png hack SmallSizeTestImage.hack



If the output file does not exist yet, ImageToHack creates it automatically.

Supported image formats: jpg, png
(Because of the compression in the jpg format there appears to be some wrong placed pixels on the CPU Emulator screen.)

The instruction pdf did not clearly stated if an hack or an asm file as an output was demanded ("Hack assembler program", "executed by the CPU emulator without any modifications") so you can do both with this implementation.
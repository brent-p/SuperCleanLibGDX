# Super Clean LibGDX Project Template 
This is an empty Libgdx project template that demonstrates how to compile and run a simple desktop only LibGDX project without using Gradle.

## Why
I was starting to get frustrated at the time spent googling everytime something went wrong Gradle and didn't want to learn yet another DSL(Domain Specific Language). As my projects are only targeted towards the desktop, using a full on build system seemed a bit overkill. Personally I think having a clean directory structure and easily debuggable error messages only adds to the joy of programming.

## How To Use:
### Compiling 
To compile the project and create a single runnable jar file run the "cmp" script from a bash shell:

	./cmp

### Running
To run either double click the jar file or from a bash shell run the "run" script:

	./run

## Adding Extra .Jar files
To add an extra library add the .jar to the libs directory and update the "Class-Path:" in the manifest.mf file

## Directory Structure:
### build
Contains the generated *.class files that are created during compilation
### libs
Contains the LibGDX .jar files
### src
Contains your source code, I have just provided a simple demo that uses some libgdx classes to demonstrate that the project is compiling properly

#### Further Notes
This template uses LibGDX version 1.5.5 but you can download the latest Jars from here: https://libgdx.badlogicgames.com/releases/

#### Contact:
If you get any use out of this you can let me know at hello at brentparish dot com

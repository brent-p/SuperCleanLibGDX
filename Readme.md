# Super Clean LibGDX Project Template 
This is an empty Libgdx Project Template that demonstrates how to compile and run a simple desktop only LibGDX project without using Gradle.

## Why
I was only ever creating desktop only LibGDX projects and continually waste time everytime something went wrong with Gradle. As my projects are usally simple having a full on build system is totally overkill and having a clean directory structure only adds to the joy of programming.

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

#### Contact:
If you get any use out of this you can let me know at hello at brentparish dot com

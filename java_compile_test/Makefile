# A simple Makefile to compile the java_compile_test files to be able to execute them

# Define a makfile variable for hte java compiler
#
JCC = javac

# Define a makefile variable for the java compiler
# of where to put the .class files
# 
out = out/

# Define a makfile variable for compilation flags
# the -g flag compiles with debugging information
JFLAGS = -g -d $(out) -classpath $(out)

# To clear the default suffixes if there are any
# and to define the java suffixes
#

.SUFFIXES: .java .class

# Target entry for creating .class files from .java files
# uses the suffix rule, second siffix id the target suffix
# and the first is the suffix of the dependency file
# 
.java.class:
	$(JCC) $(JFLAGS) $*.java

# CLASSES is a macro for each source file specified
# 

CLASSES = main/ImportClass.java \
	main/subdir/ImportClass.java \
	main/Test.java

# Default make target entry
# 

default: classes

# the make funtion to compile the program
# 

classes: $(CLASSES:.java=.class)

# This removes the java files
# 

clean:
	$(RM) *.class
	$(RM) -r $(out)/main

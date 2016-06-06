@ECHO OFF

IF %1==path (
set path=C:\Program Files\Java\jdk1.8.0_66\bin
ECHO Java path was set!
ECHO                                                                             *

) ELSE IF %1==comp (
	ECHO *********************Compiling...*************************
	javac -d bin src/jallermax/%2/%2.java
	ECHO ***********************Compiled***************************
	java -classpath ./bin jallermax.%2.%2 %3 %4 %5 %6 %7
) ELSE IF %1==open (
ECHO Opening
	If EXIST C:\Java\src\jallermax\%2\%2.java (
ECHO file exists
		C:\Java\src\jallermax\%2\%2.java
	) ELSE (
ECHO file not exists. New file created!
		MD C:\Java\src\jallermax\%2
		ECHO package jallermax.%2;>>C:\Java\src\jallermax\%2\%2.java
		ECHO class %2 {>>C:\Java\src\jallermax\%2\%2.java
		ECHO 	public static void main(String[] args>>C:\Java\src\jallermax\%2\%2.java
		ECHO }>>C:\Java\src\jallermax\%2\%2.java
REM		C:\Java\src\jallermax\%2\%2.java
	)
) ELSE (
	ECHO                                                                             *
	ECHO                                                                             *
	java -classpath ./bin jallermax.%1.%1 %2 %3 %4 %5 %6 %7
)
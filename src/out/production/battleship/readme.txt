Battleship
Created as a CPSC 233 assignment at the University of Calgary. The basic rules were taken from the original guessing game Battleship.
 
From Wikipedia on the original Battleship:
It is played on ruled grids (paper or board) on which the players' fleets of ships (including battleships) are marked. The locations of the fleet are concealed from the other player. Players alternate turns calling "shots" at the other player's ships, and the objective of the game is to destroy the opposing player's fleet.




The logic package contains the following:
-Computer
-Human
-Player
-Board
-Ship


The GUI package contains the following:
-BoardSetUpGUI
-BattleFrameGUI
-Buttons
-Display
-InfoPanel


The Controller package contains the following:
-Controller
-GamePlay


The Tests package contains the following
-BoardTest
-ShipTest
-ComputerTest
-HumanTest


For Windows/Mac/LinuxFedora
In console, terminal, or command prompt




To compile:
Ensure all 3 folders, the images lit.jpg, wave.jpg, are all in the same directory.
Enter into your command prompt or console the following.
javac control/*.java
javac logic/*.java
javac gui/*.java



To run:
java control/Controller
java control/GamePlay




Tests:
To compile: 
javac -cp .:junit-4.12.jar:hamcrest-core-1.3.jar tests/*.java


To run:
java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore tests.ComputerTest
java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore tests.ShipTest
java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore tests.HumanTest
java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore tests.BoardTest
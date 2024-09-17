# [CoyotesRobot](./CoyotesRobot.java)

It is a class to instatiate the robot and perform basic tasks(e.g. drive the robot forward).
Both Autonomous and TeleOp instantiate a CoyotesRobot.
The CoyotesRobot uses objects instantiated from the classes in [hardware](./hardware).

# [Hardware](./hardware/)

This directory contains helper classes used by CoyotesRobot.
The classes are meant to separate and organize the various systems of the robot(e.g. arms, wheels, etc.).
Some of the classes are abstract and are meant to be used as superclasses.
Being abstract classes rather than interfaces prevents multiple implementing.

## [ArmSystem](./hardware/ArmSystem.java)

An abstract class to control the robot's arm system.

## [CraneSystem](./hardware/CraneSystem.java)

A subclass of ArmSystem that controls a jointed arm system with a claw.
Not really a crane in the conventional sense.
If you can think of a better name for it, then rename it. 

## [DriveSystem](./hardware/DriveSystem.java)

A abstract class for the robot's drive system(i.e. the wheels and motors).

## [MeccanumDrive](./hardware/MeccanumDrive.java)

A subclass of DriveSystem for controlling the driving of a four-wheel meccanum wheel system.
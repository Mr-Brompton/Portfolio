@echo off
:Start2
cls
goto Start
:Start
title passGen
color 04
echo Welcome to passGen by Matthew Brompton
echo I will make you a new password.
echo Please write the password down somewhere in case you forget it.
echo ----------------------------------------­-----------------------
echo 1) Short Random Password
echo 2) Medium Random Password
echo 3) Long Random Passwords#
echo Input your choice
set input=
set /p input= Choice:
if %input%==1 goto A if NOT goto Start2
if %input%==2 goto B if NOT goto Start2
if %input%==3 goto C if NOT goto Start2
:A
cls
echo Generating Password .................
echo ....
echo ...
echo ..
echo .
echo Your password is %random%
echo Now choose what you want to do.
echo 1) Go back to the beginning
echo 2) Exit
set input=
set /p input= Choice:
if %input%==1 goto Start2 if NOT goto Start 2
if %input%==2 goto Exit if NOT goto Start 2
:Exit
exit
:B
cls
echo Generating Password .................
echo ....
echo ...
echo ..
echo .
echo Your password is %random%%random%%random%%random%%random%.
echo Now choose what you want to do.
echo 1) Go back to the beginning
echo 2) Exit
set input=
set /p input= Choice:
if %input%==1 goto Start2 if NOT goto Start 2
if %input%==2 goto Exit if NOT goto Start 2
:C
cls
echo Generating Password .................
echo ....
echo ...
echo ..
echo .
echo Your Password is %random%%random%%random%%random%%random%%random%%random%%random%%random%%random%.
echo Now choose what you want to do.
echo 1) Go back to the beginning
echo 2) Exit
set input=
set /p input= Choice:
if %input%==1 goto Start2 if NOT goto Start 2
if %input%==2 goto Exit if NOT goto Start 2
:exit
exit
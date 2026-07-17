@echo off
rem Compile and run the current Java file using its package declaration.
rem Usage: run-current-java-file.bat path\to\File.java

setlocal enabledelayedexpansion
set "FILE=%~1"
if "%FILE%"=="" (
  echo Usage: %~nx0 path\to\File.java
  exit /b 1
)

set "ROOT=%~dp0"
set "BIN_DIR=%ROOT%bin"
set "PACKAGE="
set "CLASS=%~n1"

for /f "usebackq tokens=1,2 delims=; " %%A in (`findstr /r "^package" "%FILE%"`) do (
  if /i "%%A"=="package" set "PACKAGE=%%B"
)

if defined PACKAGE (
  set "FULLCLASS=!PACKAGE!.%CLASS%"
) else (
  set "FULLCLASS=%CLASS%"
)

if not exist "%BIN_DIR%" mkdir "%BIN_DIR%"

javac -d "%BIN_DIR%" "%FILE%"
if errorlevel 1 (
  echo Compilation failed.
  exit /b 1
)

echo Running %FULLCLASS%...
java -cp "%BIN_DIR%" %FULLCLASS%
if errorlevel 1 (
  echo Program failed to run.
  exit /b 1
)

endlocal

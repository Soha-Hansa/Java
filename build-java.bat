@echo off
rem Compile all Java source files into the bin directory.
rem Usage: build-java.bat

setlocal
set "ROOT=%~dp0"
set "BIN_DIR=%ROOT%bin"

if not exist "%BIN_DIR%" mkdir "%BIN_DIR%"

for /r "%ROOT%" %%F in (*.java) do (
  echo Compiling "%%F"...
  javac -d "%BIN_DIR%" "%%F"
  if errorlevel 1 (
    echo Compilation failed.
    exit /b 1
  )
)

echo Build completed successfully. Compiled classes are available in "%BIN_DIR%".
endlocal

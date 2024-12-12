#!/bin/bash

# Navigate to project directory
echo "Navigating to the project directory"
cd /Users/smartsolution/Documents/Personal/Projects/TaskCsvToText || exit

# Clean old builds
echo "Removing any old builds"
rm -rf build TaskCsvToText.jar

# Compile Java files
echo "Creating build directory . . ."
mkdir -p build

echo "Building the source files . . ."
javac -d build src/iambstha/*.java src/**/**/*.java

# Create manifest file
echo "Creating manifest file . . ."
echo "Main-Class: iambstha.Main" > manifest.txt

# Package into JAR file
echo "Packaging the application into a jar file . . ."
jar cfm TaskCsvToText.jar manifest.txt -C build .

# Clean up manifest file
echo "Cleaning up manifest file . . ."
rm manifest.txt

echo "Build successful: TaskCsvToText.jar"


# Run the JAR file
echo "Running the JAR file..."
java -jar TaskCsvToText.jar

TODAY_DATE=$(date +"%Y-%m-%d")

# Construct the file path
FILE_PATH="src/task-records/${TODAY_DATE}_task.txt"

# Check if the file exists and copy its content to the clipboard
if [[ -f "$FILE_PATH" ]]; then
  echo "Copying task content of today's file: $FILE_PATH"
  cat "$FILE_PATH" | pbcopy
  echo "Content task copied to clipboard."
else
  echo "File does not exist: $FILE_PATH"
fi
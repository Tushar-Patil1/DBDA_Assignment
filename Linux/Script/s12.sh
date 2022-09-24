#!/bin/bash
echo "Enter the file name"
read file
if [[ -f "$file" ]]
then
printf "File found \n"
else
printf "File is not found \n"
fi

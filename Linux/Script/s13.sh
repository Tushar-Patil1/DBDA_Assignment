#!/bin/bash
echo "Enter the directory name"
read dir
if [[ -d "$dir" ]]
then
printf "Directory found \n"
else
printf "Directory not found \n"
fi

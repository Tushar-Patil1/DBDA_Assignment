echo "Enter a file name"
read f
for i in $(cat $f)
do
printf "${i} "
done

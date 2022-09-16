#! /bin/bash
path=`pwd`
touch plsfindme
echo hahaha > plsfindme
file_path=$path/test.py
res=`python $file_path $@`
echo $res
echo 1122222
echo 11111111
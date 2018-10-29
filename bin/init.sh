#!/bin/sh
FOLDER="$( cd "$(dirname "$0")" ; pwd -P )"
cd $FOLDER/..
FOLDER=$(pwd)
echo "############################################"
echo "# DIRECTORIO"
echo "# $FOLDER"
echo "############################################"
echo "#         INICIALIZANDO SUBMODULOS         #"
echo "############################################"
git pull
git checkout develop
git pull
git submodule init
git submodule update
git submodule foreach git pull
git submodule foreach git checkout develop
git submodule foreach git pull

#!/bin/sh
FOLDER="$( cd "$(dirname "$0")" ; pwd -P )"
cd $FOLDER/..
FOLDER=$(pwd)
echo "############################################"
echo "# DIRECTORIO                               "
echo "# $FOLDER"
echo "############################################"
echo "#        ACTUALIZANDO REPOSITORIOS         #"
echo "############################################"
git pull || echo "ERROR: git pull"
git checkout develop || echo "ERROR: git checkout develop"
git pull || echo "ERROR: git pull"
git submodule foreach git pull || echo "ERROR: git submodule foreach git pull"
git submodule foreach git checkout develop || echo "ERROR: git submodule foreach git checkout develop"
git submodule foreach git pull || echo "ERROR: git submodule foreach git pull"
echo "############################################"
echo "#         INICIANDO DOCKER COMPOSE         #"
echo "############################################"
docker-compose up -d
echo "############################################"
echo "#            LOGS DOCKER COMPOSE           #"
echo "############################################"
docker-compose logs -f --tail=100

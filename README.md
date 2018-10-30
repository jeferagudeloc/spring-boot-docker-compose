# spring-boot-docker-compose


Para descargar los fuentes del proyecto se debe ejecutar el siguiente comando:

```shell
git clone https://github.com/jeferagudeloc/spring-boot-docker-compose.git
```

> Para no ingresar el usuario/contraseña de github en cada instrucción se puede utilizar el [Cache de Autenticación](https://git-scm.com/docs/git-credential-cache).


Luego, se pueden ejecutar los siguiente comandos:
```

Para iniciar el ambiente de desarrollo es necesario tener instalado docker y docker-compose.

Para instalar docker, docker-compose y otras herramientas de desarrollo.
Ejecutar:

```shell
bash bin/install.sh
```

Una vez instalado el ambiente de docker, puedes ejecutar la instruccion:

```shell
docker-compose up -d
```

Dentro de la carpeta del proyecto para inicailizar los tres servicios.

Luego, de iniciado el ambiente de desarrollo se tiene acceso a lo siguiente:

Backend - Java
http://localhost:18080/

db - Mysql (BD: dbadmin)
http://localhost:13306/


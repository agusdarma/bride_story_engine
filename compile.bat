@echo off 

set PATH_COMPILE=D:\Personal\PHP\source code\bride_story_engine
echo Compile %1 using path %PATH_COMPILE%
if not "%2"=="" echo Additional Param: client=%2

if "%1" == "all" goto compile_all

if "%1" == "lib" goto compile_lib
if "%1" == "trx" goto compile_trx

goto end

:compile_all
cd %PATH_COMPILE%\bride-lib
call mvn clean install
cd %PATH_COMPILE%\bride-trx
call mvn clean package
goto end

:compile_lib
cd %PATH_COMPILE%\bride-lib
call mvn clean install
goto end

:compile_trx
cd %PATH_COMPILE%\bride-trx
if "%2"=="" (call mvn clean package) else (call mvn clean package -Dclient=%2)
goto end

:end
cd %PATH_COMPILE%
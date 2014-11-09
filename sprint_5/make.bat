echo off
set ASCIIDOCDIR=.\tools\asciidoc-8.6.9\
set PLANTUMLDIR=.\tools\
set SPRINTDIR=%~dp0
set SRCDIR=./src/
set BINDIR=./bin/
set SRCDOCDIR=./srcdoc/
set DOCDIR=./doc/
set OPTIWEB=./OPTIweb/test/


set CIBLE=%1

if "%CIBLE%"=="doc" (
	@echo ///////////////////////////////////////////////////////
	@echo // COMPILATION des documentations
	@echo ///////////////////////////////////////////////////////
	@echo Generation fichier HTML documentation utilisateur ...
	java -jar %PLANTUMLDIR%plantuml.jar -graphvizdot .\tools\graphviz-2.38\release\bin\dot.exe -Tpng -o images %SRCDOCDIR%diag.puml
	java -jar %PLANTUMLDIR%plantuml.jar -graphvizdot .\tools\graphviz-2.38\release\bin\dot.exe -Tpng -o images %SRCDOCDIR%diag2.puml
	python %ASCIIDOCDIR%asciidoc.py -a source-highlighter=pygments -o %DOCDIR%docUtil.html %SRCDOCDIR%docUtil.txt
	@echo Generation fichier HTML documentation technique ...
	python %ASCIIDOCDIR%asciidoc.py -a source-highlighter=pygments -o %DOCDIR%docTech.html %SRCDOCDIR%docTech.txt
)


if "%CIBLE%"=="java" (
	@echo ///////////////////////////////////////////////////////
	@echo // COMPILATION JAVA
	@echo ///////////////////////////////////////////////////////
	@echo Compilation des fichiers java ...
	 javac -cp bin -d bin src/Modele/*.java src/Controleur/*.java src/Vue/*.java
	 @echo Creation de OPTI HTML ...
	 java -cp bin Vue.OPTIweb
	 start chrome "./OPTIWeb/test/OPTIweb.html"
)

if "%CIBLE%"=="test" (
	@echo ///////////////////////////////////////////////////////
	@echo // COMPILATION TEST
	@echo ///////////////////////////////////////////////////////
	@echo Compilation des tests ...
	 cd %BINDIR%
	 cd %SPRINTDIR%
	 cd %OPTIWEB%
	
	casperjs.bat test casperAccueil.js
	pause
	casperjs.bat test casperCredits.js
	pause
	casperjs.bat test casperIntervenants.js
	pause
	casperjs.bat test casperProjets.js
	pause
	casperjs.bat test casperEtudiants.js
	pause
	casperjs.bat test casperSujets.js
	cd %SPRINTDIR%
 )
pause
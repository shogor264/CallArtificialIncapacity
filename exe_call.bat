@echo off
:格納フォルダのパスの設定=========================================
cd %~dp0

:Jarファイルにパスを通して実行
java -cp bin;bin/jackson-mapper-asl-1.0.0.jar;bin/jackson-core-asl-1.0.0.jar;bin/commons-io-1.3.jar;bin/commons-lang-2.3.jar;bin/ArtificialIncapacity.jar;bin/twitter4j-core-4.0.3.jar Main
pause
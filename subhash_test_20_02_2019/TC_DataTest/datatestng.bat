set projectLocation=E:\subhash_test_20_02_2019\TC_DataTest
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*;
java org.testng.TestNG%projectLocation%\CrossBrowserTesting.xml
pause
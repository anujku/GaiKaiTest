GaikaiTest Project

FACTS ABOUT THE PROJECT

Technologies used : Java7, Gradle, Tomcat, Jersey, Servlets, Jsoup, Java Threading
Objective : To display the top games using REST service web scraped from
metacritic website. Please refer the PDF document to get idea of objective.
Explanation : I have used threading and jsoup parse to extract the top games
from the metacritic website. Once the web app starts running on tomcat 
server, it makes a request to the metacritic website using jsoup library using 
a thread in the servlet web listner. I have kept a fixed refresh interval
where I make requests to the metacritic website to fetch the top games using the
above process. I store the top games and ratings information in the static 
member of a class. When the rest services call is made by the browser, 
I simply use the data in the static memeber of that class to return the expected
content. This way I always get the latest content from the metacritic website
as well as I do not have to keep making requests each time to the metacritic
website to fetch the data each time the rest service is called.  


OBJECTIVES TO BE ACHIEVED : 
1) Method : GameFetchTask.scrapWebData()
2) RESTful Services : 
   GameRestService.getTopGames()
   GameRestService.getGameInfo() 


RUNNING THE PROJECT
This Java project is build using Gradle. 
Gradle can be downloaded from : http://www.gradle.org/

Once you have gradle installed on your OS, you can navigate inside the project
and run this command from command line
     
     gradle tomcatRunWar
     
It will run the project on tomcat server. 

After this you can navigate to this URL on any rest client like 
 
 Postman : https://chrome.google.com/webstore/detail/postman-rest-client/fdmmgilgnpjigdojojpjoooidkmcomcm?hl=en

1)
Now since the rest services are running on the tomcat server, navigate to 
this URL to get the top games:

http://localhost:8080/GaikaiTest/rest/top/games
It will give something like this as an output.
[
{
"title": "XCOM: Enemy Within",
“score”: 88
},
{
"title": "Assasin’s Creed IV: Black Flag",
“score”: 88
}
… etc ...
]
      

2)      
In case you want to find score for a top game then just append the game title
to the Rest API URL. For example, navigate to this URL:      
http://localhost:8080/GaikaiTest/rest/top/games/Gran%20Turismo%206
It will give something like this as an output.
    
{
    "title": "Gran Turismo 6",
    "score": 81
}   
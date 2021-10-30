# lab 11
#SONGR
------------------------------------------------------------
##Spring boot lab
-------------------------------------------------------------
###Instructions:
------------------------------------------------------------
Clone this repo
Build with gradle
run it with spring boot and navigate to "/"
navigate the app
# songr Web application

* This app contains a hello world route at /hello, and I can visit that route.
* I Created a route that turns words into UPPER CASE. and I create Html file  that when I  visit /capitalize/hello it will get back an HTML page containing the response HELLO, or I could visit /capitalize/this is Kinda Capitalized and get an HTML page containing the response THIS IS KINDA CAPITALIZED.
* This app contains a basic splash page for the Songr app, available at the root route, and style it with some CSS.
* I Created an Album class that contain constructor has a title, an artist, a songCount, a length, and an imageUrl , also have getters and setters methods.
* the singr app contains a route at /albums that shows three album instances.
* I do testing for constructor, getters, and setters for the Album class.
* This app contains a hello world route at /hello, and I can visit that route.
  I Created a route that turns words into UPPER CASE. and I create Html file that when I visit /capitalize/hello it will get back an HTML page containing the response HELLO, or I could visit /capitalize/this is Kinda Capitalized and get an HTML page containing the response THIS IS KINDA CAPITALIZED.
  This app contains a basic splash page for the Songr app, available at the root route, and style it with some CSS.
  I Created an Album class that contain constructor has a title, an artist, a songCount, a length, and an imageUrl , also have getters and setters methods.
  the singr app contains a route at /albums that shows three album instances.
  I do testing for constructor, getters, and setters for the Album class.

# lab 12
## Lab: 12 - Spring and REST
### Feature Tasks

Updating your album can be saved in a database.
Album on title, artist, and Omen user should be able to see information about all albums User should be able to add albums to the site. You are not required to write any tests for this lab.
Make sure your server fails safely. The server must not crash and the database must not be damaged in any way if the user tries to read the information

spring.sql.init.platform=postgres
spring.datasource.url=jdbc:postgresql://localhost:5432/album
spring.datasource.username=username
spring.datasource.password=password
spring.jpa.hibernate.ddl-auto=create
spring.sql.init.mode=always
Create a database and album table .

make the album class as Entity and have a primary key.

create an interface repository AlbumRepository extends CrudRepository .

http://localhost:8080/SongsApp will switch you the home page for song application .

create postMapping to add the data in database and show it at the web application

http://localhost:8080/AddAlbum this URL will rout you to AddAlbum page *to fill the form with album data and press add album to add this data to this URL will rout you to the table.

http://localhost:8080/AlbumsList this URL will rout you to AlbumsList page that is contained table have a title, an artist, a songCount, a length, and an imageUrl data for the album.

the command line shows the database for album table :
## Lab: 13 - Related Resources and Integration Testing
### Feature Tasks
 Create a Song model.
 A Song has a title, a length (in seconds), a trackNumber, and the album on which that song appears.
 Ensure that the relationship between Albums and Songs is appropriately set up.
 A user should be able to see information about all the songs on the site.
 A user should be able to view a page with data about one particular album.
 A user should be able to add songs to an album.
 A user should be able to see the songs that belong to an album when looking at that album.
 Create a Song model has a title, a length (in seconds), a trackNumber, and the album on which that song appears.

Create an relationship between Albums and Songs is appropriately set up.

http://localhost:8080/ this URL will rote you to page contain form to add data for song.

http://localhost:8080/this URL will rote you to page contain the table for song data and the album for this song.

The user can add albums and can add song for specific album .

the command line shows the database for album table :
#### How to run application
use http://localhost:8080
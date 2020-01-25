-- SQLite commands

-- .show  	        Displays current settings for various parameters
-- .databases       Provides database names and files
-- .quit      	    Quit sqlite3 program
-- .tables          Show current tables
-- .schema 	        Display schema of table
-- .header 	        Display or hide the output table header
-- .mode 	          Select mode for the output table
-- .dump 	          Dump database in SQL text format
-- .backup 'name'   Backup object used to copy data


-- Example of tables from music database

CREATE TABLE songs(
  _id INTEGER PRIMARY KEY, track INTEGER, title TEXT NOT NULL, album INTEGER);
CREATE TABLE albums(
  _id INTEGER PRIMARY KEY, name TEXT NOT NULL, artist INTEGER);
CREATE TABLE artists(
  _id INTEGER PRIMARY KEY, name TEXT NOT NULL);


-- challenge - find title of album 367

SELECT name
FROM albums
WHERE _id = 367;


-- challenge - list of all songs so that the songs from the same album appear together in track over

SELECT *
FROM songs
ORDER BY album, track;


-- challenge - relate the tables together so that we can get a list of songs that include
--             the album the appear on as well as the artist that produce them

SELECT songs.track, songs.title, albums.name
FROM songs INNER
  JOIN albums ON songs.album = albums._id
ORDER BY albums.name, songs.track;


-- challenge - produce a list of all the artists with their albums in alphabetical order of artists name

SELECT artists.name, albums.name
FROM albums INNER
  JOIN artists ON albums.artist = artists._id
ORDER BY artists.name;


-- example - adding view

CREATE VIEW artist_list AS
  SELECT artists.name AS artist, albums.name AS album, songs.track, songs.title
  FROM songs INNER
    JOIN albums ON songs.album = albums._id
    INNER JOIN artists ON albums.artist = artists._id
  ORDER BY artists.name
  , albums.name
  , songs.track;


-- challenge - select the titles of all the songs on the album "Forbidden"

SELECT songs.title
FROM songs INNER
  JOIN albums ON songs.album = albums._id
WHERE albums.name = "Forbidden";


-- challenge - repeat the previous query but this time display the songs
--             in track order now you may want to include the track number in the output

SELECT songs.track, songs.title
FROM songs INNER
  JOIN albums ON songs.album = albums._id
WHERE albums.name = "Forbidden"
ORDER BY songs.track;


-- challenge - display all songs for the band "Deep Purple"

SELECT artists.name, songs.title
FROM songs INNER
  JOIN albums ON songs.album = albums._id
  INNER JOIN artists ON albums.artist = artists._id
WHERE artists.name = "Deep Purple"
ORDER BY songs.track;

SELECT *
FROM artist_list
WHERE artist = "Deep Purple";


-- challenge - rename the band "Mehitable" to "One kitten"

UPDATE artists SET name = 'One kitten' WHERE artists.name = 'Mehitabel';


-- challenge - select the title of all the songs by "Aerosmith"
--             in alphabetical order include only the title in the output

SELECT songs.title
FROM songs INNER
  JOIN albums ON songs.album = albums._id
  INNER JOIN artists ON albums.artist = artists._id
WHERE artists.name = "Aerosmith"
ORDER BY songs.title;

SELECT title
FROM artist_list
WHERE artist = "Aerosmith"
ORDER BY title;


-- challenge - replace the column that you used in the previous answer with count title in parentheses
--             to get just a count of the number of the songs number of songs

SELECT COUNT(title)
FROM artist_list
WHERE artist = "Aerosmith";


-- challenge - select the title of all the songs by "Aerosmith" without duplicates

SELECT DISTINCT title
FROM artist_list
WHERE artist = "Aerosmith"
ORDER BY title;

-- challenge - find out how to get a count of the songs without duplicates

SELECT COUNT(DISTINCT title)
FROM artist_list
WHERE artist = "Aerosmith";

-- challenge - repeat the previous query to find the number of artists and the number albums

SELECT COUNT(DISTINCT artist)
FROM artist_list
WHERE artist = "Aerosmith";

SELECT COUNT(DISTINCT album)
FROM artist_list
WHERE artist = "Aerosmith";
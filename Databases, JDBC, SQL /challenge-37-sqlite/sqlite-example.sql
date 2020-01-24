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
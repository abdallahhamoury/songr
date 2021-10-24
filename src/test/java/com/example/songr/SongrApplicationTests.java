package com.example.songr;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SongrApplicationTests {

	@Test
	void AlbumsConstructorTest(){
		Albums albums = new Albums("baddi hada hebbu"," Nancy Ajram", 5,250 ,"https://upload.wikimedia.org/wikipedia/commons/thumb/b/b0/Nancy_Ajram_signing_ceremony.jpg/220px-Nancy_Ajram_signing_ceremony.jpg");
		String expected = "Albums{title='baddi hada hebbu', artist=' Nancy Ajram', songCount=5, length=250.0, imageUrl='https://upload.wikimedia.org/wikipedia/commons/thumb/b/b0/Nancy_Ajram_signing_ceremony.jpg/220px-Nancy_Ajram_signing_ceremony.jpg'}";
		assertEquals(expected,albums.toString());
	}
	@Test
	void  AlbumsConstuctorGetterAndSitterTest(){
		Albums album = new Albums("baddi hada hebbu"," Nancy Ajram", 5,250 ,"https://upload.wikimedia.org/wikipedia/commons/thumb/b/b0/Nancy_Ajram_signing_ceremony.jpg/220px-Nancy_Ajram_signing_ceremony.jpg");
		album.setTitle("baddi hada hebbu");
		album.setArtist("Nancy Ajram");
		album.setImageUrl("https://upload.wikimedia.org/wikipedia/commons/thumb/b/b0/Nancy_Ajram_signing_ceremony.jpg/220px-Nancy_Ajram_signing_ceremony.jpg");
		String expected = "baddi hada hebbu";
		String expected2 = "Nancy Ajram";
		String expected3 = "https://upload.wikimedia.org/wikipedia/commons/thumb/b/b0/Nancy_Ajram_signing_ceremony.jpg/220px-Nancy_Ajram_signing_ceremony.jpg";
		assertEquals(expected,album.getTitle());
		assertEquals(expected2,album.getArtist());
		assertEquals(expected3,album.getImageUrl());
	}

	@Test
	void AlbumsConstuctorGetterAndSitter(){
		Albums album = new Albums("baddi hada hebbu"," Nancy Ajram", 3,300 ,"https://upload.wikimedia.org/wikipedia/zh/thumb/4/45/Billie_Eilish_-_Happier_Than_Ever.png/220px-Billie_Eilish_-_Happier_Than_Ever.png");
		album.setTitle("baddi hada hebbu");
		album.setArtist(" Nancy Ajram");
		album.setImageUrl("https://www.icon-icon.com/wp-content/uploads/2021/07/dua-lipa.jpeg");
		int expected = 300;
		assertEquals(expected,album.getLength());
	}

}

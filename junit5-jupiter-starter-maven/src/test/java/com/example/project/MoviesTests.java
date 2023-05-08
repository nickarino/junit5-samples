package com.example.project;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MoviesTests {

	@Test
	@DisplayName("Movies Tests")
	void testThatArrayElementsAreTheSameUntilYouReassignThem() {
		Movie[] movies = new Movie[3];
		Movie first, second;
		first = new Movie(1984, "elf");
		assertEquals( "NR",first.getRating(),"Rating is NR unless set");
		first.setRating("PG");
		assertEquals( "PG",first.getRating(),"Rating is PG because I set it");
		movies[0] = first;
		movies[1] = first;
		assertEquals(first, movies[0],"Expect them to be the same object in memory at the time I set it");
		assertTrue(first.equals(movies[0]));
		assertEquals(movies[1], movies[0],"Expect them to be the same object in memory");
		first = new Movie(2014, "Fast");
		second = new Movie(2014, "Furious");
		first = second;
		second.setRating("PG-13");
		assertNotEquals(movies[0], second, "once movies[0]=object then it is that one until you reassign it");
		assertNotEquals(movies[0], first, "once movies[0]=object then it is that one until you reassign it");
		assertNotEquals(movies[1], second, "once movies[1]=object then it is that one until you reassign it");
		assertNotEquals(movies[1], first, "once movies[1]=object then it is that one until you reassign it");
		assertEquals(second, first, "second should be the same object in memory as first");
		assertEquals(1984, movies[0].getReleaseDate(),"Even after first is given a new object, movies[0] stays the same");
		movies[2] = new Movie(second.getReleaseDate(), second.getName() + "2");
		movies[2].setRating("R");
		for (Movie curMovie : movies) {
			System.out.println(curMovie);
		}
		System.out.println(first);
		System.out.println(second);

	}

}



// todo: use java visualize
// todo: record https://jenkov.com/tutorials/maven/maven-unit-test-report.html
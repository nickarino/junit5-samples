/*
 * Copyright 2015-2022 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v20.html
 */

package com.example.project;

//In java visualizer, run this. 
//https://cscircles.cemc.uwaterloo.ca/java_visualize/

// public class showStuff {
// 	public static void main(String[] args) {
// 		Movie[] movies = new Movie[3];
// 		Movie first, second;
// 		first = new Movie(1984, "elf");
// 		first.setRating("PG");
// 		movies[0] = first;
// 		movies[1] = first;
// 		first = new Movie(2014, "Fast");
// 		second = new Movie(2014, "Furious");
// 		first = second;
// 		second.setRating("PG-13");
// 		movies[2] = new Movie(second.getReleaseDate(),second.getName() + "2");
// 		movies[2].setRating("R");
// 		for (Movie curMovie : movies) {
// 			System.out.println(curMovie);
// 		}
	   
// 	}
//  }


class Movie {

	private String rating;
	private int releaseDate;
	private String name;

	public Movie(int releaseDate, String name) {
		this.releaseDate = releaseDate;
		this.name = name;
		this.rating = "NR";
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public int getReleaseDate() {
		return releaseDate;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
	return "Movie [rating=" + rating + ", releaseDate=" + releaseDate + ", name=" + name + "]";
	}

}


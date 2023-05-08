# junit5-jupiter-starter-maven

The `junit5-jupiter-starter-maven` project demonstrates how to execute JUnit Jupiter
tests using Maven.

Please note that this project uses the [Maven Wrapper](https://github.com/takari/maven-wrapper).
Thus, to ensure that the correct version of Maven is used, invoke `mvnw` instead of `mvn`.


To see [the 
visualization](https://cscircles.cemc.uwaterloo.ca/java_visualize/#code=public+class+showStuff+%7B%0A%09public+static+void+main(String%5B%5D+args)+%7B%0A%09%09Movie%5B%5D+movies+%3D+new+Movie%5B3%5D%3B%0A%09%09Movie+first,+second%3B%0A%09%09first+%3D+new+Movie(1984,+%22elf%22)%3B%0A%09%09first.setRating(%22PG%22)%3B%0A%09%09movies%5B0%5D+%3D+first%3B%0A%09%09movies%5B1%5D+%3D+first%3B%0A%09%09first+%3D+new+Movie(2014,+%22Fast%22)%3B%0A%09%09second+%3D+new+Movie(2014,+%22Furious%22)%3B%0A%09%09first+%3D+second%3B%0A%09%09second.setRating(%22PG-13%22)%3B%0A%09%09movies%5B2%5D+%3D+new+Movie(second.getReleaseDate(),second.getName()+%2B+%222%22)%3B%0A%09%09movies%5B2%5D.setRating(%22R%22)%3B%0A%09%09for+(Movie+curMovie+%3A+movies)+%7B%0A%09%09%09System.out.println(curMovie)%3B%0A%09%09%7D%0A%09+++%0A%09%7D%0A+%7D%0A%0A%0Aclass+Movie+%7B%0A%0A%09private+String+rating%3B%0A%09private+int+releaseDate%3B%0A%09private+String+name%3B%0A%0A%09public+Movie(int+releaseDate,+String+name)+%7B%0A%09%09this.releaseDate+%3D+releaseDate%3B%0A%09%09this.name+%3D+name%3B%0A%09%09this.rating+%3D+%22NR%22%3B%0A%09%7D%0A%0A%09public+String+getRating()+%7B%0A%09%09return+rating%3B%0A%09%7D%0A%0A%09public+void+setRating(String+rating)+%7B%0A%09%09this.rating+%3D+rating%3B%0A%09%7D%0A%0A%09public+int+getReleaseDate()+%7B%0A%09%09return+releaseDate%3B%0A%09%7D%0A%0A%09public+String+getName()+%7B%0A%09%09return+name%3B%0A%09%7D%0A%0A%09%40Override%0A%09public+String+toString()+%7B%0A%09return+%22Movie+%5Brating%3D%22+%2B+rating+%2B+%22,+releaseDate%3D%22+%2B+releaseDate+%2B+%22,+name%3D%22+%2B+name+%2B+%22%5D%22%3B%0A%09%7D%0A%0A%7D%0A&mode=display&curInstr=26)

To Run the tests 
* mvn test
* mvn surefire-report:report



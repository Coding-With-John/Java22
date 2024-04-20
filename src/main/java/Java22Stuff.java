import java.util.List;

public class Java22Stuff {

  public static void main(String[] args) {

    int myInt = 0;
    String myString = "Parmesan cheese";
    try {
      myInt = Integer.parseInt(myString);
    }
    catch (NumberFormatException _) {
      System.out.println(myString + " is not a number");
    }


    List<Cat> cats = List.of(new Cat(), new Cat(), new Cat());
    cats.forEach(_ -> System.out.println("Yay cats!"));


    String name = "John";
    int age = 35;
    String message = STR."Hello, my name is \{name}! I am \{age} years old.";

    System.out.println(message);


    String title = "My Web Page";
    String text  = "Hello, world";

    String html = STR."""
      <html>
        <head>
          <title>\{title}</title>
        </head>
        <body>
          <p>\{text}</p>
        </body>
      </html>
      """;

    System.out.println(html);

    Cat cat = new Cat();
      cat.setName("Whiskers");
      cat.setAge(3);
      cat.meow();
  }
}

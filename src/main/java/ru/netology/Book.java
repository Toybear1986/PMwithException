package ru.netology;

public class Book extends Product {
  protected String author;

  public Book(int id, String name, int price, String author) {
    super(id, name, price);
    this.author = author;
  }

  public String getAuthor() {
    return author;
  }

  @Override
  public boolean matches(String search) {
    if (super.matches(search)) { // вызов метода matches в версии описанной в Product
      return true;
    } else {
      return getAuthor().contains(search);
    }
  }
}

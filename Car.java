class Car {
    int speed;
    double regularPrice;
    String color;
    
    Car(int speed, double regularPrice, String color) {
      this.speed = speed;
      this.regularPrice = regularPrice;
      this.color = color;
    }
    
    double getSalePrice() {
      return regularPrice;
    }
  }
  
  class Truck extends Car {
    int weight;
    
    Truck(int speed, double regularPrice, String color, int weight) {
      super(speed, regularPrice, color);
      this.weight = weight;
    }
    
    @Override
    double getSalePrice() {
      if (weight > 2000) {
        return 0.9 * regularPrice;
      } else {
        return 0.8 * regularPrice;
      }
    }
  }
  
  class Ford extends Car {
    int year;
    int manufacturerDiscount;
    
    Ford(int speed, double regularPrice, String color, int year, int manufacturerDiscount) {
      super(speed, regularPrice, color);
      this.year = year;
      this.manufacturerDiscount = manufacturerDiscount;
    }
    
    @Override
    double getSalePrice() {
      return super.getSalePrice() - manufacturerDiscount;
    }
  }
  
  class Sedan extends Car {
    int length;
    
    Sedan(int speed, double regularPrice, String color, int length) {
      super(speed, regularPrice, color);
      this.length = length;
    }
    
    @Override
    double getSalePrice() {
      if (length > 20) {
        return 0.95 * regularPrice;
      } else {
        return 0.9 * regularPrice;
      }
    }
  }
  
  class MyOwnAutoShop {
    public static void main(String[] args) {
      Sedan sedan = new Sedan(100, 10000, "red", 25);
      Ford ford1 = new Ford(120, 12000, "blue", 2019, 500);
      Ford ford2 = new Ford(110, 10000, "black", 2018, 600);
      Car car = new Car(90, 8000, "white");
      
      System.out.println("Sedan sale price: " + sedan.getSalePrice());
      System.out.println("Ford 1 sale price: " + ford1.getSalePrice());
      System.out.println("Ford 2 sale price: " + ford2.getSalePrice());
      System.out.println("Car sale price: " + car.getSalePrice());
    }
  }
  
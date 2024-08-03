public class Human {
   private int id;
   private String name;
   private int age;
   private String father;
   private String mother;

   public Human(int id, String name, int age,String father, String mother){
      this.id = id;
      this.name = name;
      this.age = age;
      this.father = father;
      this.mother = mother;

   }

   public int getId() {
      return id;
   }

   public String getName() {
      return name;
   }

   public int getAge() {
      return age;
   }

   public String getFather() {
      return father;
   }

   public String getMother() {
      return mother;
   }

   @Override
   public String toString() {

      return "id: " + id + ", name: " + name + ", age: " + age + " years, father: " + father + ", mother: " + mother;
   }
}
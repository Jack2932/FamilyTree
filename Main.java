public class Main {
    public static void main(String[] args) {
        int number = 0;
        FamilyTree famileTree = new FamilyTree();

        Human human1 = new Human(number++, "Владимир", 58, null, null);
        Human human2 = new Human(number++, "Маргарита", 56, null, null);
        Human human3 = new Human(number++, "Анатолий", 64, null, null);
        Human human4 = new Human(number++, "Алина", 59, null, null);
        Human human5 = new Human(number++, "Сергей", 41, "Владимир", "Маргарита");
        Human human6 = new Human(number++, "Татьяна", 38, "Анатолий", "Алина");
        Human human7 = new Human(number++, "Андрей", 18, "Сергей", "Татьяна");
        Human human8 = new Human(number++, "Владислав", 10, "Сергей", "Татьяна");

        famileTree.addHuman(human1);
        famileTree.addHuman(human2);
        famileTree.addHuman(human3);
        famileTree.addHuman(human4);
        famileTree.addHuman(human5);
        famileTree.addHuman(human6);
        famileTree.addHuman(human7);
        famileTree.addHuman(human8);
        System.out.println(famileTree.getHumanListInfo());
    }
}
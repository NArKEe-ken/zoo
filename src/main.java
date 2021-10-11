public class main {
    public static void main(String[] args){


            animals Cage1 = new crocodile(food.predator, class_anim.reptile, "Crocodile", cages.cage1);
            animals Cage2 = new mole(food.predator, class_anim.mammal, "Mole", cages.cage2);
            animals Cage3 = new mouse(food.omnivore, class_anim.mammal, "Mouse", cages.cage3);
            animals Cage4 = new goose(food.herbivore, class_anim.bird, "Goose", cages.cage4);
            Cage1.GetInfo();//получение инфы
            Cage2.GetInfo();
            Cage3.GetInfo();
            Cage4.GetInfo();
            Cage1.Walk();
            Cage2.Walk();
            Cage3.Walk();
            Cage4.Walk();

            Cage2.setAnimal(food.predator, class_anim.reptile, "Alligator", cages.cage1);
            Cage2.GetInfo();

    }
}


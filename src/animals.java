public class animals implements GetInfoAnimal, WalkOnZoo{

    food typefood;//тип питания
    cages cell;//нумерация клетки
    class_anim class_of_animal;// класс животного
    String name;// наименование
    String sound="...";//голос животного
    public animals(food typefood,class_anim class_of_animal, String name, cages cell){
        this.typefood=typefood;
        this.cell=cell;
        this.name=name;
        this.class_of_animal=class_of_animal;
    }

    public void setAnimal(food typefood,class_anim class_of_animal, String name, cages cell){
        this.typefood=typefood;
        this.cell=cell;
        this.name=name;
        this.class_of_animal=class_of_animal;
    }

    public void GetInfo()//получить информацию о животном
     {
        System.out.println(name+" это "+typefood+", "+class_of_animal+". Голос животного: "+sound+". Он находится в "+cell);
    }

    public void Walk()//функция "прогулка", которая говорит, есть ли животное в клетке или нет
    {
        System.out.println(sound);
        if (sound!="none") System.out.println(name+" в клетке\n");
        else System.out.println("клетка c "+name+" пустая\n");
    }


}


interface GetInfoAnimal{
    void GetInfo();
}

interface WalkOnZoo{
    void Walk();
}

enum food{predator, herbivore, omnivore} //список типов питания
enum cages{cage1, cage2, cage3, cage4} //список номеров клеток
enum class_anim{ mammal, bird, reptile} //список классов животных

class crocodile extends animals{
    public crocodile(food typefood, class_anim class_of_animal, String name, cages cell){
        super(typefood,class_of_animal,name, cell);
        sound="grgrgrgrgr";
    }
}

class mole extends animals{
    public mole(food typefood, class_anim class_of_animal, String name, cages cell){
        super(typefood,class_of_animal,name, cell);
        sound="none";
    }
}

class mouse extends animals{
    public mouse(food typefood, class_anim class_of_animal, String name, cages cell){
        super(typefood,class_of_animal,name, cell);
        sound="pipipipiip";
    }
}

class goose extends animals{
    public goose(food typefood, class_anim class_of_animal, String name, cages cell){
        super(typefood,class_of_animal,name, cell);
        sound="gagagagaggaga";
    }
}


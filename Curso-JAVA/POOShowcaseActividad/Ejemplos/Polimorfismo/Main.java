public class Main {
    public static void main(String[] args) {
        Animal[] animales = {new Perro(), new Gato()};

        for (Animal animal : animales) {
            animal.hacerSonido();
        }
    }
}

class Animal {
    public void hacerSonido() {
        System.out.println("El animal hace un sonido.");
    }
}

class Perro extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra.");
    }
}

class Gato extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("El gato maulla.");
    }
}

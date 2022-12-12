package solidprinciples.dependancyinversion;

import java.util.List;

public class DependencyInversion {
    private int numbers;
    List<String> list;

    public DependencyInversion(int numbers, List<String> list) {
        this.numbers = numbers;
        this.list = list;
    }

    public int getNumbers() {
        return numbers;
    }

    public void setNumbers(int numbers) {
        this.numbers = numbers;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }
}

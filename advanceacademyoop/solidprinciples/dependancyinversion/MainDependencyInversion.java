package advanceacademyoop.solidprinciples.dependancyinversion;

import java.util.ArrayList;

public class MainDependencyInversion {

    ArrayList<String> list = new ArrayList<>();

    DependencyInversion example = new DependencyInversion(1, list);
}

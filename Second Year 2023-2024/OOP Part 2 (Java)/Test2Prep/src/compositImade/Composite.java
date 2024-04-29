package compositImade;

import java.util.ArrayList;
import java.util.List;

public class Composite implements item{
    private List<item> ls = new ArrayList<>();

    @Override
    public void recolor(String color) {
        for(item i: ls){
            i.recolor(color);
        }
    }

    public void add(item i){
        this.ls.add(i);
    }

    public void remove(item i){
        this.ls.remove(i);
    }
}

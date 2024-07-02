package tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Commands;


/**
 * Интерфейс за дефиниране на команда, която може да бъде изпълнена с определени аргументи.
 */
public interface Command {

    /**
     * Изпълнява командата със зададените аргументи.
     *
     * @param args Аргументите на командата, предадени като масив от низове
     */
    void execute(String[] args);
}

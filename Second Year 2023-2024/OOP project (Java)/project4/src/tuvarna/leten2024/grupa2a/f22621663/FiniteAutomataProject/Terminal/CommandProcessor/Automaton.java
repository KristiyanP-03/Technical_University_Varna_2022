package tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.CommandProcessor;


import java.util.List;



/**
 * Класът Automaton представлява автомат с преходи.
 */
public class Automaton {
    private final List<Transition> transitions;

    /**
     * Конструктор за създаване на автомат.
     *
     * @param transitions Списък от преходи на автомата.
     */
    public Automaton(List<Transition> transitions) {
        this.transitions = transitions;
    }

    /**
     * Връща списъка с преходите на автомата.
     *
     * @return Списък от преходи.
     */
    public List<Transition> getTransitions() {
        return transitions;
    }

    /**
     * Статичен вътрешен клас, който представлява преход в автомата.
     */
    public static class Transition {
        private final int fromState;
        private final char symbol;
        private final int toState;

        /**
         * Конструктор за създаване на преход.
         *
         * @param fromState Началното състояние на прехода.
         * @param symbol Символът, който предизвиква прехода.
         * @param toState Крайното състояние на прехода.
         */
        public Transition(int fromState, char symbol, int toState) {
            this.fromState = fromState;
            this.symbol = symbol;
            this.toState = toState;
        }

        /**
         * Връща началното състояние на прехода.
         *
         * @return Началното състояние.
         */
        public int getFromState() {
            return fromState;
        }

        /**
         * Връща символа, който предизвиква прехода.
         *
         * @return Символът на прехода.
         */
        public char getSymbol() {
            return symbol;
        }

        /**
         * Връща крайното състояние на прехода.
         *
         * @return Крайното състояние.
         */
        public int getToState() {
            return toState;
        }
    }
}

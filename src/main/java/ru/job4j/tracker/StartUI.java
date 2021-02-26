package ru.job4j.tracker;

public class StartUI {
    private final Output out;

    public StartUI(Output out) {
        this.out = out;
    }

    public void init(Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select: ");
            if (select < 0 || select >= actions.length) {
                out.println("Wrong input, you can select: 0 .. " + (actions.length - 1));
                continue;
            }
            run = actions[select].execute(input, tracker);
        }
    }

    private void showMenu(UserAction[] actions) {
        out.println("Menu.");
        for (int index = 0; index < actions.length; index++) {
            out.println(index + ". " + actions[index].name());
        }
    }

    public static void main(String[] args) {
        Output out = new ConsoleOutput();
        Input input = new ValidateInput(new ConsoleInput(out), out);
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(out),
                new ShowAllAction(out),
                new ReplaceAction(out),
                new DeleteAction(out),
                new SearchByIdAction(out),
                new SearchByNameAction(out),
                new ExitAction(out)
        };
        new StartUI(out).init(input, tracker, actions);
    }
}
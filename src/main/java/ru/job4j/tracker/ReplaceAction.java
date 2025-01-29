package ru.job4j.tracker;

public class ReplaceAction implements UserAction {
    private final Output output;

    public ReplaceAction(Output output) {
        this.output = output;
    }

    @Override
    public String name() {
        return "Изменить заявку";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        output.println("=== Редактирование заявки ===");
        int id = input.askInt("Введите id заявки, которую хотите заменить:");
        String name = input.askStr("Введите название новой заявки:");
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
            output.println("Заявка изменена. Новая заявка с id " + id + ": " + item);
        } else {
            output.println("Такого id в хранилище не существует.");
        }
        return true;
    }
}

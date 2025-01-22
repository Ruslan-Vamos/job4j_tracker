package ru.job4j.enumeration;

public enum Status implements Code {
    ACCEPTED(1, "Принят") {
        private String message = "Автомобиль принят на СТО";

        @Override
        public String getMessage() {
            return message;
        }
    },
    IN_WORK(2, "В работе") {
        private String message = "Автомобиль в работе";

        @Override
        public String getMessage() {
            return message;
        }
    },
    WAITING(3, "Ожидание") {
        public String message = "Автомобиль ожидает запчасти";

        @Override
        public String getMessage() {
            return message;
        }
    },
    FINISHED(4, "Завершен") {
        public String message = "Все работы завершены";

        @Override
        public String getMessage() {
            return message;
        }
    };

    private final String text;
    private final int code;

    Status(int code, String text) {
        this.code = code;
        this.text = text;
    }

    public String info() {
        return text;
    }

    @Override
    public int code() {
        return code;
    }

    public abstract String getMessage();
}

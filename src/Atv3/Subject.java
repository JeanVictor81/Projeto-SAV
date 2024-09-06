package Atv3;

// Subject enum
enum Subject {
    SCIENCE("Ensino de ciências"),
    MATHEMATICS("Ensino de matemática"),
    MUSIC("Ensinar música"),
    GYMNASTICS("Ditando ginástica");

    private final String teachingMessage;

    Subject(String teachingMessage) {
        this.teachingMessage = teachingMessage;
    }

    public String getTeachingMessage() {
        return teachingMessage;
    }
}

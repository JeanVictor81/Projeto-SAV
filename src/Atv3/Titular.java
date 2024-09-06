package Atv3;

// Titular class
class Titular extends Teacher {
    private final Subject subject;

    public Titular(Subject subject) {
        this.subject = subject;
    }

    @Override
    public String teach() {
        return subject.getTeachingMessage();
    }
}

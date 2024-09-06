package Atv3;

import java.util.ArrayList;
import java.util.List;

// Substitute class
class Substitute extends Teacher {
    private final List<Subject> subjects = new ArrayList<>();
    private int currentIndex = 0;

    public void assign(Subject subject) {
        subjects.add(subject);
    }

    @Override
    public String teach() {
        if (subjects.isEmpty()) {
            return "No subjects assigned";
        }
        String message = subjects.get(currentIndex).getTeachingMessage();
        currentIndex = (currentIndex + 1) % subjects.size(); // Rotate to the next subject
        return message;
    }
}

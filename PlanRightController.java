

import org.springframework.web.bind.annotation.*;

@RestController
public class PlanRightController {

    @GetMapping("/lesson")
    public String getLessonPlan(
        @RequestParam int grade,
        @RequestParam String subject,
        @RequestParam String week) {
        return "Lesson Plan - Grade: " + grade + ", Subject: " + subject + ", Week: " + week;
    }
}

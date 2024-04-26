package org.example;
public class Prison {
    public static void main(String[] args) {
        Prisoner prisoner = new Prisoner();
        PrisonGuard prisonGuard = new PrisonGuard();
        PrisonDatabase prisonDatabase = new PrisonDatabase();
        PrisonSecurity prisonSecurity = new PrisonSecurity();
        VisitorRegistration visitorRegistration = new VisitorRegistration();

        // Примеры использования функций
        boolean escapeSuccess = prisoner.escapeAttempt(7);
        System.out.println("Попытка побега: " + (escapeSuccess ? "Успешна" : "Неуспешна"));

        prisonGuard.checkInmateBehavior("агрессивное");
        double sentenceLength = prisoner.calculateSentenceLength(10, 6);
        System.out.println("Длительность приговора: " + sentenceLength + " лет");

        String inmateInfo = prisonDatabase.getInmateInfo("12345");
        System.out.println("Информация о заключённом: " + inmateInfo);

        String securityLevel = prisonSecurity.checkSecurityLevel("B123");
        System.out.println("Уровень безопасности: " + securityLevel);

        visitorRegistration.registerVisitor("Иванов", "12345");
        prisonGuard.conductSearch("камера");
    }
}

class Prisoner {
    boolean escapeAttempt(int securityLevel) {
        // Логика оценки попытки побега на основе уровня безопасности
        return securityLevel < 5;
    }

    double calculateSentenceLength(int years, int months) {
        int totalMonths = years * 12 + months;
        return totalMonths / 12.0; // Возвращаем длительность приговора в годах
    }
}

class PrisonGuard {
    void checkInmateBehavior(String behavior) {
        // Логика оценки поведения заключённого
        if (behavior.equals("агрессивное")) {
            System.out.println("Необходимо принять меры безопасности.");
            // Принятие мер безопасности, например, отправка в карцер
        } else if (behavior.equals("нарушение")) {
            System.out.println("Заключённый нарушил правила. Отправить на работу в целях наказания.");
            // Отправка заключённого на работу в целях наказания
        } else {
            System.out.println("Поведение заключённого в норме.");
        }
    }

    void conductSearch(String location) {
        // Логика проведения обыска в указанном месте
        System.out.println("Проводится обыск в " + location + ".");
        // Дополнительные действия при обнаружении запрещенных предметов или правонарушений
    }
}

class PrisonDatabase {
    String getInmateInfo(String inmateID) {
        // Логика запроса информации о заключённом из базы данных
        return "Имя: Иван Петров, Возраст: 35 лет, Стать: Мужской, Преступление: Кража";
    }
}

class PrisonSecurity {
    String checkSecurityLevel(String inmateID) {
        // Логика проверки уровня безопасности для заключённого
        if (inmateID.startsWith("A")) {
            return "Высокий"; // Уровень безопасности для особо опасных преступников
        } else if (inmateID.startsWith("B")) {
            return "Средний"; // Уровень безопасности для обычных заключённых
        } else {
            return "Низкий"; // Уровень безопасности для неподверженных нарушениям заключённых
        }
    }
}

class VisitorRegistration {
    void registerVisitor(String visitorName, String inmateID) {
        // Логика регистрации посетителя в системе
        System.out.println("Посетитель " + visitorName + " зарегистрирован для посещения заключённого с ID: " + inmateID);
    }
}

package org.knit.labs2.lab1.Task1;

abstract class Approver {
    protected Approver nextApprover; // Следующий обработчик в цепочке

    public void setNextApprover(Approver nextApprover) {
        this.nextApprover = nextApprover;
    }

    public void processRequest(int amount) {
        if (canApprove(amount)) {
            approve(amount);
        } else if (nextApprover != null) {
            nextApprover.processRequest(amount); // Передача запроса дальше
        } else {
            System.out.println("Ваш запрос не был обработан! Попробуйте перефразировать вопрос.");
        }
    }

    protected abstract boolean canApprove(int amount); // Проверка лимита
    protected abstract void approve(int amount); // Логика одобрения
}

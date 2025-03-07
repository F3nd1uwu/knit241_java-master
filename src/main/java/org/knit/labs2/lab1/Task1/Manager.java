package org.knit.labs2.lab1.Task1;

class Manager extends Approver {
    @Override
    protected boolean canApprove(int amount) {
        return amount <= 2;
    }

    @Override
    protected void approve(int amount) {
        System.out.println("Менеджер обработал вашу заявку. Сложность запроса: " + amount);
    }
}

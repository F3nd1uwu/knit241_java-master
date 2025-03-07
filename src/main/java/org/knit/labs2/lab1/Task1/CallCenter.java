package org.knit.labs2.lab1.Task1;

class CallCenter extends Approver {
    @Override
    protected boolean canApprove(int amount) {
        return amount <= 1;
    }

    @Override
    protected void approve(int amount) {
        System.out.println("Колл-центр обработал вашу заявку. Сложность запроса: " + amount);
    }
}

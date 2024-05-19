package org.example;

public class Main {
    public static void main(String[] args) {
    //Ініційовані змінні
        int variable_1 = 32;
        int variable_2 = 1;
        int variable_3 = 2;
        int variable_4 = 21;

    //Сумування змінних попарно.
        int sum_1 = variable_1 + variable_2;
        int sum_2 = variable_3 + variable_4;

    //Виводення результат порівняння сум (true, якщо перша сума більша).
        System.out.println(sum_1 > sum_2);

    //Збільшення sum_1 на 1.
        sum_1++;

    //Зменшення sum_2 на 2ю
        sum_2 -= 2;

    //Виводення результат порівняння (true, якщо sum_1 більша).
        System.out.println(sum_1 > sum_2);

    //Виводить true, якщо хоча б одна сума кратна 2, інакше – false.
        System.out.println((sum_1 % 2 == 0) || (sum_2 % 2 == 0));
    }

}

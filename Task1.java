// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// Создать множество ноутбуков.
// Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации
//  и выведет ноутбуки, отвечающие фильтру. 
// Критерии фильтрации можно хранить в Map. Например: “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет …
// Далее нужно запросить минимальные значения для указанных критериев - 
// сохранить параметры фильтрации можно также в Map.
// Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        Nout nout1 = new Nout("Lenovo", "8", "Intel", "256", "Windows", "Black");
        Nout nout2 = new Nout("Asus", "6", "Intel", "512", "Windows", "Grey");
        Nout nout3 = new Nout("Macbook", "16", "Intel", "512", "MAC OS", "White");
        Nout nout4 = new Nout("Acer", "8", "AMD", "256", "Windows", "Black");
        Nout nout5 = new Nout("Acer", "4", "AMD", "512", "Linux", "Black");
        Nout nout6 = new Nout("Lenovo", "16", "Intel", "256", "Windows", "White");
        

        Set<Nout> set = new HashSet<>();
        set.add(nout1);
        set.add(nout2);
        set.add(nout3);
        set.add(nout4);
        set.add(nout5);
        set.add(nout6);
        

        Map<String, String> map = new HashMap<>();
        System.out.println("Введите цифру, соответствующую необходимому критерию:\n" +
                "1 - Название ноутбука \n" +
                "2 - Объем оперативной памяти \n" +
                "3 - Марка процессора \n" +
                "4 - Объем жесткого диска \n" +
                "5 - Тип операционной системы \n" +
                "6 - Цвет ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Поле ввода: ");
        String choice = scanner.nextLine();
        String choice2 = null;

        if (choice.equals("1")){
            System.out.println("Выберите модель ноутбука:\n" +
                "1 - Lenovo \n" +
                "2 - Asus \n" +
                "3 - Macbook \n" +
                "4 - Acer ");
                Scanner scanner1 = new Scanner(System.in);
                System.out.print("Поле ввода: ");
                choice2 = scanner1.nextLine();
        }

        if (choice.equals("2")){
            System.out.println("Выберите объем оперитавной памяти:\n" +
                "1 - 4 Гб\n" +
                "2 - 6 Гб\n" +
                "3 - 8 Гб\n" +
                "4 - 16 Гб");
                Scanner scanner2 = new Scanner(System.in);
                System.out.print("Поле ввода: ");
                choice2 = scanner2.nextLine();
        }

        if (choice.equals("3")){
            System.out.println("Выберите Марку процессора:\n" +
                "1 - Intel \n" +
                "2 - AMD \n");
                Scanner scanner3 = new Scanner(System.in);
                System.out.print("Поле ввода: ");
                choice2 = scanner3.nextLine();
        }

        if (choice.equals("4")){
            System.out.println("Выберите объем жесткого диска:\n" +
                "1 - 256 Гб \n" +
                "2 - 512 Гб \n");
                Scanner scanner4 = new Scanner(System.in);
                System.out.print("Поле ввода: ");
                choice2 = scanner4.nextLine();
        }

        if (choice.equals("5")){
            System.out.println("Выберите тип операционной системы:\n" +
                "1 - Windows \n" +
                "2 - MAC OS \n" + 
                "3 - Linux ");
                Scanner scanner5 = new Scanner(System.in);
                System.out.print("Поле ввода: ");
                choice2 = scanner5.nextLine();
        }

        if (choice.equals("6")){
            System.out.println("Выберите цвет ноутбука:\n" +
                "1 - Black \n" +
                "2 - Grey \n" + 
                "3 - White ");
                Scanner scanner6 = new Scanner(System.in);
                System.out.print("Поле ввода: ");
                choice2 = scanner6.nextLine();
        }
        
        map.put(choice, choice2);
        
        for (Nout nout: set){            
            for (Map.Entry<String, String> entry: map.entrySet()){
                if (entry.getKey().equals("1")){
                    if (entry.getValue().equals("1")){
                        System.out.println(nout1);
                        System.out.println(nout6);
                        return;
                    } else if(entry.getValue().equals("2")){
                        System.out.println(nout2);                        
                        return;
                    } else if(entry.getValue().equals("3")){
                        System.out.println(nout3);                       
                        return;
                    } else if(entry.getValue().equals("4")){
                        System.out.println(nout4);
                        System.out.println(nout5);                       
                        return;
                    }
                }
                if (entry.getKey().equals("2")){
                    if (entry.getValue().equals("1")){
                        System.out.println(nout5);                        
                        return;
                    } else if(entry.getValue().equals("2")){
                        System.out.println(nout2);                        
                        return;
                    } else if(entry.getValue().equals("3")){
                        System.out.println(nout1);
                        System.out.println(nout4);                       
                        return;
                    } else if(entry.getValue().equals("4")){
                        System.out.println(nout3);
                        System.out.println(nout6);                       
                        return;
                    }
                }
                if (entry.getKey().equals("3")){
                    if (entry.getValue().equals("1")){
                        System.out.println(nout1);
                        System.out.println(nout2);
                        System.out.println(nout3);
                        System.out.println(nout6);                        
                        return;
                    } else if(entry.getValue().equals("2")){
                        System.out.println(nout4);
                        System.out.println(nout5);                        
                        return;
                    }
                }
                if (entry.getKey().equals("4")){
                    if (entry.getValue().equals("1")){
                        System.out.println(nout1);
                        System.out.println(nout4);                        
                        System.out.println(nout6);                        
                        return;
                    } else if(entry.getValue().equals("2")){
                        System.out.println(nout2);
                        System.out.println(nout3);
                        System.out.println(nout5);                        
                        return;
                    }
                }
                if (entry.getKey().equals("5")){
                    if (entry.getValue().equals("1")){
                        System.out.println(nout1);
                        System.out.println(nout2);
                        System.out.println(nout4);                        
                        System.out.println(nout6);                        
                        return;
                    } else if(entry.getValue().equals("2")){                        
                        System.out.println(nout3);                                                
                        return;
                    } else if(entry.getValue().equals("3")){                        
                        System.out.println(nout5);                        
                        return;
                    }
                }
                if (entry.getKey().equals("6")){
                    if (entry.getValue().equals("1")){
                        System.out.println(nout1);                        
                        System.out.println(nout4);                        
                        System.out.println(nout5);                        
                        return;
                    } else if(entry.getValue().equals("2")){                        
                        System.out.println(nout2);                                                
                        return;
                    } else if(entry.getValue().equals("3")){                        
                        System.out.println(nout3);
                        System.out.println(nout6);                        
                        return;
                    }
                }
            }
        }
        
    }
}

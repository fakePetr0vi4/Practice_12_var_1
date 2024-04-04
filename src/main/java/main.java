import java.io.*;

public class main {
    public static void main(String[] args) {
        try {
            System.out.println("С любовью от Никиты Максимова РИБО-05-22");
            String directoryPath = scann.getString("Введите батник или директорию файла: ");

            String make = scann.getString("Введите марку вашей колымаги: ");
            String model = scann.getString("Введите модель автомобиля: ");
            int year = scann.getInt("Введите год выпуска: ");
            int mileage = scann.getInt("Введите накат на машинке: ");
            String review = scann.getString("Че скажешь еще о машине? ");

            Car car = new Car(make, model, year, mileage, review);

            FileOutputStream fileOut = new FileOutputStream(directoryPath);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            car.writeExternal(objectOut);
            objectOut.close();
            fileOut.close();

            System.out.println("Файл сохранен в директории " + directoryPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

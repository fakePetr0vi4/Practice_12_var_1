import java.io.*;

public class Car implements Externalizable {
    private String mark;
    private String model;
    private int year;
    private int mileage;//пробег
    private String review; //комментарий

    public Car() {
        //Externalizable
    }

    public Car(String mark, String model, int year, int mileage, String review) {
        this.mark = mark;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
        this.review = review;


    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(mark);
        out.writeObject(model);
        out.writeInt(year);
        out.writeInt(mileage);
        out.writeObject(review);

    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        mark = (String) in.readObject();
        model = (String) in.readObject();
        year = in.readInt();
        mileage = in.readInt();
        review = (String) in.readObject();
    }
}


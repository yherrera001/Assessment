public class HireDate {
    //properties/instances/states
    public String month;
    public String date;
    public String year;

    //constructor
    public HireDate(String month, String date, String year){

    this.month = month;
    this.date = date;
    this.year = year;

    //methods


    }

    @Override
    public String toString() {
        return
                  month +"/"  +date + "/" + year;
    }
}

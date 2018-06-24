package Day5.Test10;

public class Employee extends Department {
    private String idE;
    private String nameE;
    private String descriptionE;

    public Employee(String idE, String nameE, String descriptionE, String idD) {
        super();
        this.idE = idE;
        this.nameE = nameE;
        this.descriptionE = descriptionE;
        this.idD = idD;
    }

    public Employee(String idD, String nameD, String descriptionD, String idE, String nameE, String descriptionE) {
        super(idD, nameD, descriptionD);
        this.idE = idE;
        this.nameE = nameE;
        this.descriptionE = descriptionE;
    }

    public Employee() {

    }

    public String getIdE() {
            return idE;
        }

        public void setIdE(String idE) {
            this.idE = idE;
        }

        public String getNameE() {
            return nameE;
        }

        public void setNameE(String nameE) {
            this.nameE = nameE;
        }

        public String getDescriptionE() {
            return descriptionE;
        }

        public void setDescriptionE(String descriptionE) {
            this.descriptionE = descriptionE;
        }
    }

package session_16_binary_file.bai_tap.model;


public class Product {

        private String idSP;
        private String nameSP;
        private String companySP;
        private String price;
        private String description;

        public Product(){}

        public Product(String idSP, String nameSP, String companySP, String price, String description) {
            this.idSP = idSP;
            this.nameSP = nameSP;
            this.companySP = companySP;
            this.price = price;
            this.description = description;
        }
        public String getIdSP() {
            return idSP;
        }

        public void setIdSP(String idSP) {
            this.idSP = idSP;
        }

        public String getNameSP() {
            return nameSP;
        }

        public void setNameSP(String nameSP) {
            this.nameSP = nameSP;
        }

        public String getCompanySP() {
            return companySP;
        }

        public void setCompanySP(String companySP) {
            this.companySP = companySP;
        }

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

    @Override
    public String toString() {
        return "Product{" +
                "idSP=" + idSP +
                ", nameSP='" + nameSP + '\'' +
                ", companySP='" + companySP + '\'' +
                ", price='" + price + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public String getInfor() {
            return idSP + "," + nameSP + "," + companySP + "," + price + "," +description ;
        }
}

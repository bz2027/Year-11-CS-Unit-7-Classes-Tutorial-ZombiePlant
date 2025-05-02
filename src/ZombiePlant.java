public class ZombiePlant {
    private int potency;
    private int treatmentsRequired;

    public ZombiePlant(int potency, int treatmentsRequired) {
        this.potency = potency;
        this.treatmentsRequired = treatmentsRequired;
    }

    public int getPotency() {
        return this.potency;
    }

    public int treatmentsNeeded() {
        return this.treatmentsRequired;
    }

    public boolean isDangerous() {
        return this.treatmentsRequired > 0;
    }

    public void treat(int p) {
        if (p > 0) {
            if (p <= this.potency && this.treatmentsRequired > 0) {
                this.treatmentsRequired--;
            } else if (p > this.potency) {
                this.treatmentsRequired++;
            }
        }
    }
}

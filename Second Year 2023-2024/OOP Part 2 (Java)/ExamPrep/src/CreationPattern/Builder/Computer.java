package CreationPattern.Builder;

class Computer {
    // Булеви променливи за части на компютъра
    private boolean hasCPU;
    private boolean hasGPU;
    private boolean hasRAM;
    private boolean hasSSD;
    private boolean hasHDD;
    private boolean hasPowerSupply;

    // Приватен конструктор, който приема Builder като параметър
    private Computer(ComputerBuilder builder) {
        this.hasCPU = builder.hasCPU;
        this.hasGPU = builder.hasGPU;
        this.hasRAM = builder.hasRAM;
        this.hasSSD = builder.hasSSD;
        this.hasHDD = builder.hasHDD;
        this.hasPowerSupply = builder.hasPowerSupply;
    }

    // Вложен клас Builder
    public static class ComputerBuilder {
        // Булеви променливи за части на компютъра
        private boolean hasCPU;
        private boolean hasGPU;
        private boolean hasRAM;
        private boolean hasSSD;
        private boolean hasHDD;
        private boolean hasPowerSupply;

        public ComputerBuilder() {
            // По подразбиране, всички части са false (не присъстват)
        }

        public ComputerBuilder setCPU(boolean hasCPU) {
            this.hasCPU = hasCPU;
            return this;
        }

        public ComputerBuilder setGPU(boolean hasGPU) {
            this.hasGPU = hasGPU;
            return this;
        }

        public ComputerBuilder setRAM(boolean hasRAM) {
            this.hasRAM = hasRAM;
            return this;
        }

        public ComputerBuilder setSSD(boolean hasSSD) {
            this.hasSSD = hasSSD;
            return this;
        }

        public ComputerBuilder setHDD(boolean hasHDD) {
            this.hasHDD = hasHDD;
            return this;
        }

        public ComputerBuilder setPowerSupply(boolean hasPowerSupply) {
            this.hasPowerSupply = hasPowerSupply;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }

    @Override
    public String toString() {
        return "Computer [hasCPU=" + hasCPU + ", hasGPU=" + hasGPU + ", hasRAM=" + hasRAM +
                ", hasSSD=" + hasSSD + ", hasHDD=" + hasHDD + ", hasPowerSupply=" + hasPowerSupply + "]";
    }
}



    class Коло implements Figure {
        private double радіус;

        public Коло(double радіус) {
            this.радіус = радіус;
        }

        @Override
        public double returnSquare() {
            return Math.PI * радіус * радіус;
        }
    }

    // Клас "Трикутник"
    class Трикутник implements Figure {
        private double основа;
        private double висота;

        public Трикутник(double основа, double висота) {
            this.основа = основа;
            this.висота = висота;
        }

        @Override
        public double returnSquare() {
            return 0.5 * основа * висота;
        }
    }

    // Клас "Квадрат"
    class Квадрат implements Figure {
        private double сторона;

        public Квадрат(double сторона) {
            this.сторона = сторона;
        }

        @Override
        public double returnSquare() {
            return сторона * сторона;
        }
    }

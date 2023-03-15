/*
 * Nama File    : TimSepakbola.java
 * Nama Pembuat : Resma Adi Nugroho
 * NIM          : 24060121120021
 * Deskripsi    : File Class Tim Sepakbola
 * Tanggal      : 15 Maret 2023
 */

class TimSepakbola {

  // Assume there are only 2 teams using this class!

  // Attribute
  String nama;
  int skor;
  boolean isOnMatch;

  // Default constructor
  TimSepakbola() {
    nama = "[NAMA]";
    skor = 0;
    isOnMatch = false;
  }

  // TimSepakbola(nama: string)
  // TODO: Create an overloading constructor below this comment
  TimSepakbola(String nama){
    this.nama = nama;
    this.skor = 0;
    this.isOnMatch = false;
  }

  // TODO: Fix the method below
  // Replace [TIM 1] and [TIM 2] with the correct attribute
  // [TIM 1] and [TIM 2] are commutative, so you don't need to worry if [TIM 1] or [TIM 2] refer to either this class or 'lawan'
  void startTandingBola(TimSepakbola lawan) {
    // DO NOT change both if conditions
    if (Boolean.TRUE.equals(this.isOnMatch)) {
      System.out.println("Tim " + lawan.nama + " sedang dalam pertandingan!");
      return;
    }

    if (Boolean.TRUE.equals(lawan.isOnMatch)) {
      System.out.println("Lawan sedang dalam pertandingan!");
      return;
    }

    System.out.println(
      "Pertandingan antara " + this.nama + " dan " + lawan.nama + " dimulai!\n"
    );
    this.setIsOnMatch(true);
    lawan.setIsOnMatch(true);
  }

  // TODO: Implement goal() method. Skor will be added by 1 for every single goal from the team
  void goal() {
    // DO NOT change the if condition
    if (Boolean.FALSE.equals(this.isOnMatch)) {
      System.out.println(
        "Tim " + this.nama + " TIDAK sedang dalam pertandingan!"
      );
      return;
    } else {
      this.skor++;
    }


  }

  // TODO: Implement getSkor() method. This is a selector to get the score for a team
  int getSkor() {
    // DO NOT change the if condition
    if (Boolean.FALSE.equals(this.isOnMatch)) {
      System.out.println(
        "Tim " + this.nama + " TIDAK sedang dalam pertandingan!"
      );
      return 0;
    } else {
      return this.skor;
    }
  }

  // TODO: Implement setIsOnMatch() method. This is a mutator to set a new boolean value for isOnMatch
  void setIsOnMatch(boolean onMatch) {
    this.isOnMatch = onMatch;
  }

  // TODO: Fix the method below. This method below is quite similar with startTandingBola()
  // Replace [TIM 1] and [TIM 2] with the correct attribute
  // [TIM 1] and [TIM 2] are commutative, so you don't need to worry if [TIM 1] or [TIM 2] refer to either this class or 'lawan'
  void endTandingBola(TimSepakbola lawan) {
    // DO NOT change the if condition
    if (
      Boolean.FALSE.equals(this.isOnMatch) &&
      Boolean.FALSE.equals(lawan.isOnMatch)
    ) {
      System.out.println("Kedua tim TIDAK sedang dalam pertandingan");
      return;
    }

    System.out.println(
      "\nPertandingan antara " +
      this.nama +
      " dan " +
      lawan.nama +
      " selesai!\n"
    );
    this.setIsOnMatch(false);
    lawan.setIsOnMatch(false);
  }
}

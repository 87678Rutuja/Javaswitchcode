class SwitchDemo2{

  public static void main(String[] args) {
    String grade = "B";
    String marksRange;
    switch (grade) {
      case "A":
        marksRange = "Marks: 90+";
        break;
      case "B":
        marksRange = "Marks: 80-90";
        break;
      case "C":
        marksRange = "Marks: 70-80";
        break;
      case "D":
        marksRange = "Marks: 60-70";
        break;
      case "E":
        marksRange = "Marks: 50-60";
        break;
      case "F":
        marksRange = "Marks: 40-50";
        break;
      default:
        marksRange = "No grade provided.";
        break;
    }
    System.out.println("Grade B: " + marksRange);
  }
}

public class Pattern_15 {
    public static void main(String[] args) {
        int rows = 15;
        for (int i=1; i<=rows; i++) {
            for (int j=1; j<=rows; j++) {
                if ((i == j) || (i+j == (rows+1))) {
                    System.out.print("$ ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("\n");

        for (int i=1; i<=rows; i++) {
            for (int j=1; j<=rows; j++) {
                if ((i == j) || (i+j == (rows+1)) || (i == 1) || (i == rows)) {
                    System.out.print("$ ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("\n");

        for (int i=1; i<=rows; i++) {
            for (int j=1; j<=rows; j++) {
                if ((i == j) || (i+j == (rows+1)) || (j == 1) || (j == rows)) {
                    System.out.print("$ ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
/*
$                           $
  $                       $
    $                   $
      $               $
        $           $
          $       $
            $   $
              $
            $   $
          $       $
        $           $
      $               $
    $                   $
  $                       $
$                           $


$ $ $ $ $ $ $ $ $ $ $ $ $ $ $
  $                       $
    $                   $
      $               $
        $           $
          $       $
            $   $
              $
            $   $
          $       $
        $           $
      $               $
    $                   $
  $                       $
$ $ $ $ $ $ $ $ $ $ $ $ $ $ $



$                           $
$ $                       $ $
$   $                   $   $
$     $               $     $
$       $           $       $
$         $       $         $
$           $   $           $
$             $             $
$           $   $           $
$         $       $         $
$       $           $       $
$     $               $     $
$   $                   $   $
$ $                       $ $
$                           $

 */

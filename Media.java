package boletin11.pkg1;
/**
 *
 * @author sverdecadilla
 */
public class Media {

  private String nom;
  private String autor;
  private int duradaSegons;
  
  public String getNom(){
      return nom;
  }
  public String getAutor(){
      return autor;
  }
  public int getDurada(){
      return duradaSegons;
  }
  public void setNom(String nom){
     this.nom=nom;
  }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setDuradaSegons(int duradaSegons) {
        this.duradaSegons = duradaSegons;
    }
}

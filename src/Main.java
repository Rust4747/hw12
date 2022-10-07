public class Main {
    public static void main(String[] args) {
        Author arturcheyli=new Author("Артур", "Хейли");
        Author fyodordostoevsky=new Author("Федор", "Достоевский");
        if (arturcheyli.equals(arturcheyli)) {
            System.out.println("объкты равны");
        }
        if (arturcheyli.hashCode() == fyodordostoevsky.hashCode()) {
            System.out.println("хэшкоды равны");
        }

        Book theFinalDiagnosis=new Book ("Окончательный диагноз ", arturcheyli,1959);
        Book theIdiot=new Book("Идиот", fyodordostoevsky, 1868);
        System.out.println("Книга:"+theFinalDiagnosis.getTitle()+ " Автор:"+theFinalDiagnosis.getAuthor().getName()
        + " "+theFinalDiagnosis.getAuthor().getSurname()+ " Год публикации:" + theFinalDiagnosis.getPublicationYear());
        System.out.println("Книга: "+theIdiot.getTitle()+ " Автор:"+theIdiot.getAuthor().getName()+ " "+theIdiot.getAuthor().getSurname()
                +  " Год публикации:" + theIdiot.getPublicationYear());
        theFinalDiagnosis.setPublicationYear(2005);
        System.out.println("Книга:"+theFinalDiagnosis.getTitle()+ " Автор:"+theFinalDiagnosis.getAuthor().getName()
                + " "+theFinalDiagnosis.getAuthor().getSurname()+ " Год публикации:" + theFinalDiagnosis.getPublicationYear());
        System.out.println(theIdiot);


    }
}
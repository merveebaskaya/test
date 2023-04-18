package introduction.day30abstraction;

public abstract class Courses {

    public abstract void math();

    public void art(){
        System.out.println("Learn art");
    }



    /*
    1)Eger bir class'ta object olusturulmasini istemiyorsak ve bu classi sadece child classlarin
    yapmak zorunda olduklari gorevleri belirlemek icin kullaniyorsak "Abstraction" yapariz.

    2)Bazen parent classtaki methodun bodysi hicbir child tarafindan kullanilmaz.BU yuzden
    parenttaki methoda body yazmak hic kullanilmadigi icin mantikli degildir.Bizde o methoda
    body yazmayiz.

    3)Bodysi yazilmayan methoda Abstract method denir.Abstract ingilizce vucutsuz ya da soyut anlamindadir

    4)Methodun body sini yazmayinca java bize hata verir, bizde abstract keywordunu kullanarak javaya
    bu methodun bodysi olmayacak deriz

    5)abstract keywordunu kullaninca elde ettigimiz abstract method normal classlara konulamaz,
    o yuzden classi da abstract yapmaliyiz

    6)Parent taki method abstract ise butun child classlar o methodu override etmek zorundadir
    Bu yuzden tum chidlar icin mecburi olmasini istedigimiz fonksiyonlari abstract yapmak mantikli bir secimdir

    7)Bodysi olan methodlar (concrete method) abstract classlarin icine yazilabilir ama
    Abstract methodlar concrete methodlarin icine yazilamazlar concrete methodlar child classlar tarafindan
    override edilmek zorunda degildir.

    8)Abstract keyword ile method body bir methodda ayni anda kullanilamaz.

    9)final methodlar abstract olamazlar, final methodlar override edilemezler oysaki abstract methodlar
    override edilebilmek icin olustururlar.Bu celiskidir, bu yuzden java abstract methodlarin final olamasina musade etmez

    10)abstract classlarin icinde abstract methodlar olur abstract methodlar bodysi olmadigindan
    eksik methodlar gibi dusunulebilir.
    Yani abstract class icinde eksik bir yapi barindirir, siz abstract class icinde
    eksiklik objecte yansir.
    Java bunu istemez cunku eksik object eksik is yapar bu da application in yanlis calısmasina sebep olur.
    Javada application'u korumak icin abdstract classlardan obje uretilmesini engeller.

    11)abstract classlarin constructor'u vardır ama object olusturamazlar.

    12)Abstract classlarin abstract childi veya concrete childi olabilir.

    13)Abstract methodlar private olamazlar cunku child classlar abstract methodlari kullanirlar, private yapinca
    kullanima kapali olur bu celiskidir bu yuzden java abstract methodlarin private olmasina musaade etmez.


     */

}

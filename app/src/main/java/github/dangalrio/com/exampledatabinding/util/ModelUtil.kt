package github.dangalrio.com.exampledatabinding.util

import android.databinding.ObservableArrayList
import github.dangalrio.com.exampledatabinding.model.WorldOfWarcraftModel

class ModelUtil {
    companion object {
        fun dummyCharacters() : ObservableArrayList<WorldOfWarcraftModel> {
            val characterList = ObservableArrayList<WorldOfWarcraftModel>()

            val arthas = WorldOfWarcraftModel(1,
                    "Arthas Menethil",
                    "Príncipe heredero de Lordaeron y Caballero de la Mano de Plata, era hijo del Rey Terenas Menethil II y heredero del trono. Fue entrenado como un paladín por Uther el Iluminado, y tenía una relación romántica con la hechicera Jaina Valiente",
                    "https://d1u5p3l4wpay3k.cloudfront.net/es_wowpedia/a/a2/Lich_King_by_Raneman.jpg?version=90db2bd8ae26ca9ef907711470a3c13d")

            val illidan = WorldOfWarcraftModel(2,
                    "Illidan Tempestira",
                    "Fue el autoproclamado Señor de Terrallende, que gobernó desde el Templo Oscuro. Illidan nació como un elfo de la noche, y, en palabras de Maiev Cantosombrío . Es el hermano gemelo de Malfurion,y, al igual que él, siempre estuvo enamorado de Tyrande. Es difícil clasificar todos sus poderes, por el hecho de que el aprendió muchos hechizos siendo cazador de demonios, hechicero, y habiendo recibido los poderes de la Calavera de Gul'dan.",
                    "https://d1u5p3l4wpay3k.cloudfront.net/es_wowpedia/d/d6/Illidan.jpg?version=cf0f74095dacf8b40ea6303821c78e4c")

            val varian = WorldOfWarcraftModel(3,
                    "Varian Wrynn",
                    "Es el hijo del fallecido rey Llane Wrynn y antiguo rey de Ventormenta.Bajo su mandato, los humanos de Ventormenta llevaron a la Alianza a la victoria contra el Rey Exánime en Rasganorte y se enfrentó a la Horda de Garrosh Grito Infernal durante los años de conflicto.",
                    "https://d1u5p3l4wpay3k.cloudfront.net/es_wowpedia/b/be/Varian_Wei.jpg?version=0b6f43414b1457639f378325c952a1f7")

            val sylvanas = WorldOfWarcraftModel(4,
                    "Sylvanas Brisaveloz",
                    "Titulada a veces también como \"la Dama Oscura\" o como \"la Reina alma en pena\", es la líder suprema de los Renegados, una de las facciones más poderosas de no-muertos en Azeroth.",
                    "https://d1u5p3l4wpay3k.cloudfront.net/es_wowpedia/b/bc/Sylvanas_Raneman.jpg?version=30b698e8eb7d17a8d38369418acddf1b")

            val guldan = WorldOfWarcraftModel(5,
                    "Gul'dan",
                    "fue el brujo más poderoso de la Horda y de facto fundador de la Horda orca. Abandonó el chamanismo y traicionó a su pueblo y a su maestro para servir al señor demonio Kil'jaeden quien le dio poder. Gul'dan fue el responsable directo de la caída de los orcos en la esclavitud así como uno de los autores de la invasión a Azeroth.",
                    "https://d1u5p3l4wpay3k.cloudfront.net/wowpedia/0/08/Gul%27dan_HoW.jpg")


            characterList.add(arthas)
            characterList.add(illidan)
            characterList.add(varian)
            characterList.add(sylvanas)
            characterList.add(guldan)
            return characterList
        }
    }
}
package com.example.fragmentintro

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class PinkFragment : Fragment() {
    //Skapa een text fragment
    lateinit var nameText: TextView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_pink, container, false)
        nameText = view.findViewById(R.id.pinkTextView)
        // imageView= view.findViewById(R.id.animalImageView)


        return view
    }

    //Ta text i fragment och ändra
    fun setText(text: String) {
        nameText.text = text


    }
    //fun setImage(image: Int){
// imageView.setImageResource(image)
// }

    //Funcao para criar uma lista de perguntas com imagems e respostas!
    fun createQuestions(){

        val questionList= mutableListOf<Question>()
        //Criar uma lista de resposta em listOf e depois mostra a resposta correta!
        val q1=Question(R.drawable.cat, "Hur sto?", listOf("4", "jätterstor", "Ganska stor", "3"), 3)
        questionList.add(q1)

        //imageView.setImageReasouce(questionList[1].image)
    }
}
class Question(val image :Int, val q :String, val answer: List<String>, val correctAswer: Int)
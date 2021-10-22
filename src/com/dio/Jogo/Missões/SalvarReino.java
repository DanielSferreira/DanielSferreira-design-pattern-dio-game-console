package com.dio.Jogo.Missões;

class SalvarReino extends Modalidade {
    @Override
    public void NomeDoJogo() {
        message("Você escolheu a missão de salvar a cidade de uma invasão verduras selvagens");
    }

    @Override
    public void Descrição() {
        message("Você está na praça pública, quando começa a invasão de uma horda de repolhos selvagens");
        message("Quando eles chegam o terror é absoluto, você corajosamente pega o vinagre e azeite e ameaça os vegetais");
        message("Eles com medo entram para debaixo da terra e o feitiço sobre eles desaparecem e você salva o dia");
    }
}
